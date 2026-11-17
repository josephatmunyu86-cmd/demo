package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class StandardPayrollService implements PayrollService {

    @Override
    public double calculate(Employee e) {
        return e.getBase() - e.getTax();
    }
}