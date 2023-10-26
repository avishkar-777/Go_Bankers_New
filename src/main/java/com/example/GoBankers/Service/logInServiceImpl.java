package com.example.GoBankers.Service;
import com.example.GoBankers.DTO.UserDTO;
import com.example.GoBankers.Entity.Users;
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
                userDTO.getPassword()
        );
    userRepo.save(user);

    return user.getFirstName();
    }

    @Override
    public List<Users> getUser() {

        List <Users> list = userRepo.getUsers();
        List <Users> list1 = new ArrayList<>();

        for(Users user : list)
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
}
