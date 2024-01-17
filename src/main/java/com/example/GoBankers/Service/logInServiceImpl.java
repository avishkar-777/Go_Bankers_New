package com.example.GoBankers.Service;
import com.example.GoBankers.DTO.UserDTO;
import com.example.GoBankers.Entity.Users;
import com.example.GoBankers.Repo.CustomResponse;
import com.example.GoBankers.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class logInServiceImpl implements IlogInService{

    @Autowired
    private UserRepo userRepo;
    @Override
    public String registerUser(UserDTO userDTO) {

        Users user = new Users(
                userDTO.getFirstName(),
                userDTO.getMiddleName()!=null ? userDTO.getMiddleName() : "",
                userDTO.getLastName(),
                userDTO.getMobileNo(),
                userDTO.getEmail(),
                userDTO.getPassword(),
                userDTO.getUserName()
        );
    userRepo.save(user);

    return user.getFirstName();
    }

    @Override
    public List<UserDTO> getUser() {

        List <UserDTO> list = userRepo.getUsers();
        List <UserDTO> list1 = new ArrayList<>();

        for(UserDTO user : list)
        {
            user.setPassword(null);
            list1.add(user);
        }
        return list1;

//        List<Users> list = userRepo.getUsers();
//        List<UserDTO> userList = new ArrayList<>();
//
//        for(Users u : list){
//
//            UserDTO dto = new UserDTO(
//                 u.getUserId(),
//                 u.getFirstName(),
//                 u.getMiddleName(),
//                 u.getLastName(),
//                 u.getMobileNo(),
//                 u.getEmail(),
//                 u.getPassword()
//            );
//            userList.add(dto);
//        }
//        return userList;
    }

    @Override
    public String updateUser(UserDTO userDTO) {

        if(userRepo.existsById(userDTO.getUserId()))
        {
            Users users = userRepo.getById(userDTO.getUserId());
            users.setFirstName(userDTO.getFirstName());
            users.setMiddleName(userDTO.getMiddleName());
            users.setLastName(userDTO.getLastName());
            users.setMobileNo(userDTO.getMobileNo());
            users.setEmail(userDTO.getEmail());
            users.setPassword(userDTO.getPassword());

            userRepo.save(users);

            return "Employee Updated Successfully!";
        }
        else {
            System.out.println("Employee ID Not Found!");

            return "Employee Id not found!";
        }

    }

    @Override
    public boolean removeUser(int id) {
        if(userRepo.existsById(id)){
            userRepo.deleteById(id);
        }
        else{
            System.out.println("Employee ID Not Found!");
        }
        return true;
    }


    public CustomResponse<Object> verifyUser(UserDTO userDTO) {
        Users user = userRepo.getUserByUsername(userDTO.getUserName());

        if (user != null) {
            if(user.getUserName().equals(userDTO.getUserName()) && user.getPassword().equals(userDTO.getPassword())){
                return new CustomResponse<>("Success", 200, "Success", null, null, true);
            }
            else{
                return new CustomResponse<>("Error", 500, "Credentials not matched", null, null, true);
            }
        }
        else{
            return new CustomResponse<>("Error", 500, "User not found", null, null, false);
        }
    }
}
