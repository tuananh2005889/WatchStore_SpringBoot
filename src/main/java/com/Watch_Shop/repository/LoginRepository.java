package com.Watch_Shop.repository;

import com.Watch_Shop.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<User, Long> {

    User findByEmailAndPassword(String email, String password);

}
