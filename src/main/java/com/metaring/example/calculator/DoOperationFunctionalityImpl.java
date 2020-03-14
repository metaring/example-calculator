package com.metaring.example.calculator;

import java.lang.reflect.Method;
import java.util.concurrent.CompletableFuture;

public class DoOperationFunctionalityImpl extends DoOperationFunctionality {

    @Override
    protected CompletableFuture<Void> preConditionCheck(OperationModel input) throws Exception {
        return end;
    }

    @Override
    @SuppressWarnings("unchecked")
    protected CompletableFuture<Double> call(OperationModel input) throws Exception {
        String methodToCall = input.getOperator().getTextualValue();
        Method method = CalculatorFunctionalitiesManager.class.getDeclaredMethod(methodToCall, OperandsModel.class);
        Object result = method.invoke(null, input.getOperands());
        CompletableFuture<Double> castedResult = (CompletableFuture<Double>) result;
        return castedResult;
    }

    @Override
    protected CompletableFuture<Void> postConditionCheck(OperationModel input, Double output) throws Exception {
        return end;
    }
}