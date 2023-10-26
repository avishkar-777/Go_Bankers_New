package com.example.GoBankers.Controller;

import com.example.GoBankers.DTO.UserDTO;
import com.example.GoBankers.Entity.Users;
import com.example.GoBankers.Service.IlogInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/goBankers")
public class logInController {

    @Autowired
    private IlogInService iLogInService;

    @PostMapping(path = "/registerUser")
    public String registerUser(@RequestBody UserDTO userDTO){

        String id = iLogInService.registerUser(userDTO);
        return id;
    }


    @GetMapping(path = "/getUsers")
    public List<Users> getUsers(){
        List<Users> list = iLogInService.getUser();
        return list;
    }

    @PutMapping(path = "/updateUser")
    public String updateUser(@RequestBody UserDTO userDTO){

        String id = iLogInService.updateUser(userDTO);
        return id;
    }

    @DeleteMapping(path = "/removeUser/{id}")
    public String removeUser(@PathVariable(value = "id")int id){

        boolean removeUser = iLogInService.removeUser(id);
        return "User Removed Successfully";
    }
}
