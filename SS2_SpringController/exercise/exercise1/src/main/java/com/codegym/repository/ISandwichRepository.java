package com.codegym.repository;

import java.util.List;

public interface ISandwichRepository {
    List<String> findAll();

    List<String> findSpice(String[] spice);
}
