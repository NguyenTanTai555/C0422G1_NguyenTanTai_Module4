package com.example.phones.service.impl;

import com.example.phones.model.Smartphone;
import com.example.phones.repository.ISmartphoneRepository;
import com.example.phones.service.ISmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class SmartPhoneService implements ISmartphoneService {

    @Autowired
    private ISmartphoneRepository smartphoneRepository ;

    @Override
    public Page<Smartphone> findAll(Pageable pageable) {
        return smartphoneRepository.findAll(pageable);
    }

    @Override
    public Optional<Smartphone> findById(Integer id) {
        return smartphoneRepository.findById(id);
    }

    @Override
    public void save(Smartphone smartphone) {
        this.smartphoneRepository.save(smartphone);
    }

    @Override
    public void delete(Integer id) {
        smartphoneRepository.deleteById(id);
    }
}
