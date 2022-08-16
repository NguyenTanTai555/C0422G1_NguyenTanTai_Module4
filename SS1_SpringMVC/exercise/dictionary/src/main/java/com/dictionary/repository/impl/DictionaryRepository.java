package com.dictionary.repository.impl;

import com.dictionary.repository.IDictionaryRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DictionaryRepository implements IDictionaryRepository {
    private static Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("hello", "xin chào");
        dictionary.put("bye", "tạm biệt");
        dictionary.put("book", "sách");
        dictionary.put("pen", "bút");
    }

    @Override
    public String change(String eng) {
        if (dictionary.get(eng.toLowerCase()) == null) {
            return "Please input right word";
        }
        return dictionary.get(eng.toLowerCase());
    }
}
