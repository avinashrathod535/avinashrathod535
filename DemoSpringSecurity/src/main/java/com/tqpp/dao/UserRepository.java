package com.tqpp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tqpp.model.User;

public interface UserRepository extends JpaRepository<User,Integer>
{
    public User findByUserName(String username);
    public User findByPassword(String password);
}
