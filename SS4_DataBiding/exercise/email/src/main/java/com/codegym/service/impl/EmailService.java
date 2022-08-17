package com.codegym.service.impl;

import com.codegym.repository.IEmailRepository;
import com.codegym.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailService implements IEmailService {
    @Autowired
    private IEmailRepository iEmailRepository;

    @Override
    public List<String> languages() {
        return this.iEmailRepository.languages();
    }

    @Override
    public List<String> pageSize() {
        return this.iEmailRepository.pageSize();
    }
}
