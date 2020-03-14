package com.metaring.example.calculator;

import java.util.concurrent.CompletableFuture;

public class SubtractFunctionalityImpl extends SubtractFunctionality {

    @Override
    protected CompletableFuture<Void> preConditionCheck(OperandsModel input) throws Exception {
        return end;
    }

    @Override
    protected CompletableFuture<Double> call(OperandsModel input) throws Exception {
        Double result = input.getFirst();
        result -= input.getSecond();
        return end(result);
    }

    @Override
    protected CompletableFuture<Void> postConditionCheck(OperandsModel input, Double output) throws Exception {
        return end;
    }
}