package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    private final PayrollService payroll;
    private double base = 6000;
    private double tax = 1000;

    public Employee(PayrollService payroll) {
        this.payroll = payroll;
    }

    public double netSalary() {
        return payroll.calculate(this);
    }

    public double getBase() {
        return base;
    }

    public double getTax() {
        return tax;
    }
}