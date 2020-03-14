package com.metaring.example.calculator;

import java.util.concurrent.CompletableFuture;

import com.metaring.framework.type.series.TextSeries;

public class ListOperatorsFunctionalityImpl extends ListOperatorsFunctionality {

    @Override
    protected CompletableFuture<Void> preConditionCheck() throws Exception {
        return end;
    }

    @Override
    protected CompletableFuture<TextSeries> call() throws Exception {
        return end(newTextSeries(OperatorEnumerator.listAll().asEnumerable().select(OperatorEnumerator::getTextualValue).toList()));
    }

    @Override
    protected CompletableFuture<Void> postConditionCheck(TextSeries output) throws Exception {
        return end;
    }
}