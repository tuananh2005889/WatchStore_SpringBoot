package com.Watch_Shop.service;

import com.Watch_Shop.model.User;
import com.Watch_Shop.repository.LoginRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public void saveUser(User user) {
        loginRepository.save(user);
    }

    public List<User> getAllUsers() {
        return loginRepository.findAll();
    }

    public Optional<User> Login(String email, String password) {
        return Optional.ofNullable(loginRepository.findByEmailAndPassword(email, password));
    }
}
