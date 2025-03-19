package com.Watch_Shop.repository;

import com.Watch_Shop.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}