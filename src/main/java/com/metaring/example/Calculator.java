package com.metaring.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.metaring.framework.ext.spring.boot.MetaRingSpringBootApplication;

@SpringBootApplication
public class Calculator {
    public static void main(String[] args) {
        MetaRingSpringBootApplication.run(args, Calculator.class);
    }
}