package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Manager {

    private final PayrollService payroll;
    private final Employee employee;

    public Manager(@Qualifier("bonus") PayrollService payroll, Employee employee) {
        this.payroll = payroll;
        this.employee = employee;
    }

    public double approvedSalary() {
        return payroll.calculate(employee);
    }
}