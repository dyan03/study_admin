package com.example.study_admin.repository;

import com.example.study_admin.StudyAdminApplicationTests;
import com.example.study_admin.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class UserRepositoryTest extends StudyAdminApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void create() {
        User user = new User();
        user.setAccount("TestUser01");
        user.setEmail("TestUser01@gmail.com");
        user.setPhoneNumber("010-1111-1111");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("admin");

//        User newUser=userRepository.save(user);
//        System.out.println("newUser : "+newUser);
//        System.out.println("Test here");

    }

    public void read() {

    }

    public void update() {

    }
}
