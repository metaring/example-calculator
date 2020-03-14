package com.metaring.example.calculator;

import java.util.concurrent.CompletableFuture;
import com.metaring.framework.functionality.AbstractFunctionality;
import com.metaring.framework.functionality.GeneratedFunctionality;
import com.metaring.framework.functionality.FunctionalityInfo;
import com.metaring.example.calculator.OperationModel;

abstract class DoOperationFunctionality extends AbstractFunctionality implements GeneratedFunctionality {

    static final FunctionalityInfo INFO = FunctionalityInfo.create("com.metaring.example.calculator.doOperation", false, false, false, "com.metaring.example.calculator.OperationModel", "java.lang.Double");

    static final DoOperationFunctionality INSTANCE = new DoOperationFunctionalityImpl();

    protected DoOperationFunctionality() {
        super(INFO, Double.class);
    }

    @Override
    protected final CompletableFuture<Void> beforePreConditionCheck(Object input) throws Exception {
        CompletableFuture<Void> response = beforePreConditionCheck(input == null ? null : (OperationModel) input);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> beforePreConditionCheck(OperationModel input) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Void> preConditionCheck(Object input) throws Exception {
        CompletableFuture<Void> response = preConditionCheck(input == null ? null : (OperationModel) input);
        return response == null ? end : response;
    }

    protected abstract CompletableFuture<Void> preConditionCheck(OperationModel input) throws Exception;

    @Override
    protected final CompletableFuture<Void> afterPreConditionCheck(Object input) throws Exception {
        CompletableFuture<Void> response = afterPreConditionCheck(input == null ? null : (OperationModel) input);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> afterPreConditionCheck(OperationModel input) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Void> beforeCall(Object input) throws Exception {
        CompletableFuture<Void> response = beforeCall(input == null ? null : (OperationModel) input);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> beforeCall(OperationModel input) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Object> call(Object input) throws Exception {
        CompletableFuture<Double> call = call((OperationModel) input);
        if(call == null) {
            return end(null);
        }
        final CompletableFuture<Object> response = new CompletableFuture<>();
        call.whenCompleteAsync((result, error) -> {
            if(error != null) {
                response.completeExceptionally(error);
                return;
            }
            response.complete(result);
        }, EXECUTOR);
        return response;
    }

    protected abstract CompletableFuture<Double> call(OperationModel input) throws Exception;

    @Override
    protected final CompletableFuture<Void> afterCall(Object input, Object output) throws Exception {
        CompletableFuture<Void> response = afterCall(input == null ? null : (OperationModel) input, output == null ? null : (Double) output);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> afterCall(OperationModel input, Double output) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Void> beforePostConditionCheck(Object input, Object output) throws Exception {
        CompletableFuture<Void> response = beforePostConditionCheck(input == null ? null : (OperationModel) input, output == null ? null : (Double) output);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> beforePostConditionCheck(OperationModel input, Double output) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Void> postConditionCheck(Object input, Object output) throws Exception {
        CompletableFuture<Void> response = postConditionCheck(input == null ? null : (OperationModel) input, output == null ? null : (Double) output);
        return response == null ? end : response;
    }

    protected abstract CompletableFuture<Void> postConditionCheck(OperationModel input, Double output) throws Exception;

    @Override
    protected final CompletableFuture<Void> afterPostConditionCheck(Object input, Object output) throws Exception {
        CompletableFuture<Void> response = afterPostConditionCheck(input == null ? null : (OperationModel) input, output == null ? null : (Double) output);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> afterPostConditionCheck(OperationModel input, Double output) throws Exception {
        return end;
    }

    @Override
    protected final Object getInputFromJsonWork(String inputJson) {
        return OperationModel.fromJson(inputJson);
    }
}