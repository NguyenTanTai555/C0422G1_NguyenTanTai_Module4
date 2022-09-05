package com.example.phones.service;

import com.example.phones.model.Smartphone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ISmartphoneService {
    Page<Smartphone> findAll(Pageable pageable);

    Optional<Smartphone> findById(Integer id);

    void save (Smartphone smartphone);

    void delete(Integer id);
}
