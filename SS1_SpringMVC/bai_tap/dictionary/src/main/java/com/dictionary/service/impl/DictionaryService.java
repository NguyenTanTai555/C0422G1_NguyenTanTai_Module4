package com.dictionary.service.impl;

import com.dictionary.service.IDictionaryService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DictionaryService implements IDictionaryService {
    private static Map<String, String> map = new HashMap<>();

    static {
        map.put("hello", "xin chào");
        map.put("bye", "tạm biệt");
        map.put("book", "sách");
        map.put("pen", "bút");
    }

    @Override
    public String change(String eng) {
        if (map.get(eng.toLowerCase()) == null ){
            return "Please input right word";
        }
        return map.get(eng.toLowerCase());
    }
}
