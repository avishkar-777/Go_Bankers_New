package com.example.GoBankers.Repo;

import com.example.GoBankers.DTO.UserDTO;
import com.example.GoBankers.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<Users,Integer> {

    @Query(value = "select u from Users u")
    public List<Users> getUsers();


//    @Query(value = "select u from Users u where name=:val")
//    public List<Users> getUsers(@Param("val") String firstName);
}
