package com.metaring.example.calculator;

import com.metaring.framework.exception.ManagedException;

public class CalculationException extends ManagedException {

    private static final long serialVersionUID = 4622643125318789278L;

    public CalculationException(String message) {
        super();
        fillPayload(message);
    }
}