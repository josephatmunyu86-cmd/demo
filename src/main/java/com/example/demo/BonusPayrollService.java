package com.example.demo;

import org.springframework.stereotype.Service;

@Service("bonus")
public class BonusPayrollService implements PayrollService {

    @Override
    public double calculate(Employee e) {
        return e.getBase() - e.getTax() + 500;
    }
}