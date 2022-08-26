package com.codegym.registrationform.service;

import com.codegym.registrationform.model.User;

import java.util.List;

public interface IUserService{
    void save(User user);
    List<User> findAll();
}
