package com.metaring.example.calculator;

import java.util.concurrent.CompletableFuture;

public class MultiplyFunctionalityImpl extends MultiplyFunctionality {

    @Override
    protected CompletableFuture<Void> preConditionCheck(OperandsModel input) throws Exception {
        return end;
    }

    @Override
    protected CompletableFuture<Double> call(OperandsModel input) throws Exception {
        return end(input.getFirst() * input.getSecond());
    }

    @Override
    protected CompletableFuture<Void> postConditionCheck(OperandsModel input, Double output) throws Exception {
        if(input.getFirst() < 0 && input.getSecond() < 0 && output < 0) {
            throw new CalculationException("Something went wrong during Multiply operation!");
        }
        return end;
    }
}