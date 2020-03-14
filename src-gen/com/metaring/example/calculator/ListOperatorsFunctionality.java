package com.metaring.example.calculator;

import java.util.concurrent.CompletableFuture;
import com.metaring.framework.functionality.AbstractFunctionality;
import com.metaring.framework.functionality.GeneratedFunctionality;
import com.metaring.framework.functionality.FunctionalityInfo;
import com.metaring.framework.type.series.TextSeries;

abstract class ListOperatorsFunctionality extends AbstractFunctionality implements GeneratedFunctionality {

    static final FunctionalityInfo INFO = FunctionalityInfo.create("com.metaring.example.calculator.listOperators", false, false, false, null, "com.metaring.framework.type.series.TextSeries");

    static final ListOperatorsFunctionality INSTANCE = new ListOperatorsFunctionalityImpl();

    protected ListOperatorsFunctionality() {
        super(INFO, TextSeries.class);
    }

    @Override
    protected final CompletableFuture<Void> beforePreConditionCheck(Object input) throws Exception {
        CompletableFuture<Void> response = beforePreConditionCheck();
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> beforePreConditionCheck() throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Void> preConditionCheck(Object input) throws Exception {
        CompletableFuture<Void> response = preConditionCheck();
        return response == null ? end : response;
    }

    protected abstract CompletableFuture<Void> preConditionCheck() throws Exception;

    @Override
    protected final CompletableFuture<Void> afterPreConditionCheck(Object input) throws Exception {
        CompletableFuture<Void> response = afterPreConditionCheck();
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> afterPreConditionCheck() throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Void> beforeCall(Object input) throws Exception {
        CompletableFuture<Void> response = beforeCall();
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> beforeCall() throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Object> call(Object input) throws Exception {
        CompletableFuture<TextSeries> call = call();
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

    protected abstract CompletableFuture<TextSeries> call() throws Exception;

    @Override
    protected final CompletableFuture<Void> afterCall(Object input, Object output) throws Exception {
        CompletableFuture<Void> response = afterCall(output == null ? null : (TextSeries) output);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> afterCall(TextSeries output) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Void> beforePostConditionCheck(Object input, Object output) throws Exception {
        CompletableFuture<Void> response = beforePostConditionCheck(output == null ? null : (TextSeries) output);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> beforePostConditionCheck(TextSeries output) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Void> postConditionCheck(Object input, Object output) throws Exception {
        CompletableFuture<Void> response = postConditionCheck(output == null ? null : (TextSeries) output);
        return response == null ? end : response;
    }

    protected abstract CompletableFuture<Void> postConditionCheck(TextSeries output) throws Exception;

    @Override
    protected final CompletableFuture<Void> afterPostConditionCheck(Object input, Object output) throws Exception {
        CompletableFuture<Void> response = afterPostConditionCheck(output == null ? null : (TextSeries) output);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> afterPostConditionCheck(TextSeries output) throws Exception {
        return end;
    }
}