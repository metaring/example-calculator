package com.metaring.example.calculator;

import java.util.concurrent.CompletableFuture;

public class DivideFunctionalityImpl extends DivideFunctionality {

    @Override
    protected CompletableFuture<Void> preConditionCheck(OperandsModel input) throws Exception {
        if(input.getSecond() == 0) {
            throw new CalculationException("Cannot divide by zero");
        }
        return end;
    }

    @Override
    protected CompletableFuture<Double> call(OperandsModel input) throws Exception {
        return end(input.getFirst() / input.getSecond());
    }

    @Override
    protected CompletableFuture<Void> postConditionCheck(OperandsModel input, Double output) throws Exception {
        return end;
    }
}