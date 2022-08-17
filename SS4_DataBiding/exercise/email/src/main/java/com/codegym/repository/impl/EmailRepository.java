package com.codegym.repository.impl;

import com.codegym.repository.IEmailRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmailRepository implements IEmailRepository {

    private static List<String> listLanguages = new ArrayList<>();

    private static List<String> listSizePages = new ArrayList<>();

    static {
        listLanguages.add("English");
        listLanguages.add("Vietnamese");
        listLanguages.add("Japanese");
        listLanguages.add("Chinese");
    }

    static {
        listSizePages.add("5");
        listSizePages.add("10");
        listSizePages.add("15");
        listSizePages.add("25");
        listSizePages.add("50");
        listSizePages.add("100");
    }

    @Override
    public List<String> languages() {
        return listLanguages;
    }

    @Override
    public List<String> pageSize() {
        return listSizePages;
    }
}
