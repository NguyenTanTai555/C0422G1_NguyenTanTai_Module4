package com.exemple.service.impl;

import com.exemple.service.ICurrencyService;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService implements ICurrencyService {
    @Override
    public double convert(double usd) {
        return usd*23000;
    }
}
