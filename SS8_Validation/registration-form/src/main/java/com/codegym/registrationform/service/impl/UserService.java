package com.codegym.registrationform.service.impl;

import com.codegym.registrationform.model.User;
import com.codegym.registrationform.repository.IUserRepository;
import com.codegym.registrationform.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository iUserRepository;

    @Override
    public void save(User user) {
        this.iUserRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return iUserRepository.findAll();
    }
}
