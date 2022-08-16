package com.codegym.repository.impl;

import com.codegym.repository.ISandwichRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SandwichRepository implements ISandwichRepository {
    private static List<String> topping = new ArrayList<>();

    static {
        topping.add("Lettuce");
        topping.add("Tomato");
        topping.add("Mustard");
        topping.add("Sprouts");
    }

    @Override
    public List<String> findAll() {
        return topping;
    }

    @Override
    public List<String> findSpice(String[] spice) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < spice.length; i++) {
            strings.add(spice[i]);
        }
        return strings;
    }

}
