package com.example.GoBankers.Service;

import com.example.GoBankers.DTO.UserDTO;
import com.example.GoBankers.Entity.Users;

import java.util.List;

public interface IlogInService {
    String registerUser(UserDTO userDTO);

    List<Users> getUser();

    String updateUser(UserDTO userDTO);

    boolean removeUser(int id);
}
