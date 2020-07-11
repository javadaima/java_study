package com.example.study.service;

import com.example.study.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {
    List<User> findByName(String name);

    @Transactional
    void saveUser();

    String getUser(Long id);

    void updateUser(User user,Long id);
}
