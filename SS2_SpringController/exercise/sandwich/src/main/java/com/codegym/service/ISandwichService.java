package com.codegym.service;

import java.util.List;

public interface ISandwichService {
    List<String> findAll();

    List<String> findSpice(String[] spice);
}
