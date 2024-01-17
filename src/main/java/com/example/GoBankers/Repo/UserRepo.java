package com.example.GoBankers.Repo;

import com.example.GoBankers.DTO.UserDTO;
import com.example.GoBankers.Entity.Users;
import org.hibernate.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.List;

@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<Users,Integer> {

    @Query("SELECT new com.example.GoBankers.DTO.UserDTO(u.userId, u.firstName, u.middleName, u.lastName, u.mobileNo, u.email, u.userName) FROM com.example.GoBankers.Entity.Users u")
    List<UserDTO> getUsers();


    Optional<Users> findByUserName(String userName);
    @Query("SELECT u FROM Users u WHERE u.userName = :username")
    Users getUserByUsername(@Param("username") String username);
}
