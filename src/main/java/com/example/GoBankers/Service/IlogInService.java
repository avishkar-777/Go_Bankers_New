package com.example.GoBankers.Service;

import com.example.GoBankers.DTO.UserDTO;
import com.example.GoBankers.Entity.Users;
import com.example.GoBankers.Repo.CustomResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IlogInService {
    String registerUser(UserDTO userDTO);

    List<UserDTO> getUser();

    String updateUser(UserDTO userDTO);

    boolean removeUser(int id);

    CustomResponse<Object> verifyUser(UserDTO userDTO);
}
