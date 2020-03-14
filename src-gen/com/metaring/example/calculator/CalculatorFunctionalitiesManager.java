package com.metaring.example.calculator;

import com.metaring.framework.functionality.FunctionalityInfo;
import com.metaring.framework.functionality.FunctionalitiesManager;
import com.metaring.framework.functionality.GeneratedFunctionalitiesManager;
import com.metaring.framework.functionality.Functionality;
import java.util.concurrent.CompletableFuture;
import com.metaring.example.calculator.OperandsModel;
import java.lang.Double;
import com.metaring.example.calculator.OperationModel;
import com.metaring.framework.type.series.TextSeries;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class CalculatorFunctionalitiesManager extends FunctionalitiesManager implements GeneratedFunctionalitiesManager {

    public static final FunctionalityInfo DIVIDE = DivideFunctionality.INFO;

    public static final FunctionalityInfo DO_OPERATION = DoOperationFunctionality.INFO;

    public static final FunctionalityInfo LIST_OPERATORS = ListOperatorsFunctionality.INFO;

    public static final FunctionalityInfo MULTIPLY = MultiplyFunctionality.INFO;

    public static final FunctionalityInfo SUBTRACT = SubtractFunctionality.INFO;

    public static final FunctionalityInfo SUM = SumFunctionality.INFO;

    public static final CompletableFuture<Double> divide(OperandsModel operandsModel) {
        return call(DIVIDE, DivideFunctionality.class, getCallingFunctionality(), operandsModel, result -> result.asRealDigit());
    }

    public static final CompletableFuture<Double> divide(Functionality functionality, OperandsModel operandsModel) {
        return call(DIVIDE, DivideFunctionality.class, functionality, operandsModel, result -> result.asRealDigit());
    }

    public static final CompletableFuture<Double> divideFromJson(String operandsModelJson) {
        return callFromJson(DIVIDE, DivideFunctionality.class, getCallingFunctionality(), operandsModelJson, result -> result.asRealDigit());
    }

    public static final CompletableFuture<Double> divideFromJson(Functionality callingFunctionality, String operandsModelJson) {
        return callFromJson(DIVIDE, DivideFunctionality.class, callingFunctionality, operandsModelJson, result -> result.asRealDigit());
    }

    public static final CompletableFuture<Double> doOperation(OperationModel operationModel) {
        return call(DO_OPERATION, DoOperationFunctionality.class, getCallingFunctionality(), operationModel, result -> result.asRealDigit());
    }

    public static final CompletableFuture<Double> doOperation(Functionality functionality, OperationModel operationModel) {
        return call(DO_OPERATION, DoOperationFunctionality.class, functionality, operationModel, result -> result.asRealDigit());
    }

    public static final CompletableFuture<Double> doOperationFromJson(String operationModelJson) {
        return callFromJson(DO_OPERATION, DoOperationFunctionality.class, getCallingFunctionality(), operationModelJson, result -> result.asRealDigit());
    }

    public static final CompletableFuture<Double> doOperationFromJson(Functionality callingFunctionality, String operationModelJson) {
        return callFromJson(DO_OPERATION, DoOperationFunctionality.class, callingFunctionality, operationModelJson, result -> result.asRealDigit());
    }

    public static final CompletableFuture<TextSeries> listOperators() {
        return call(LIST_OPERATORS, ListOperatorsFunctionality.class, getCallingFunctionality(), null, result -> result.asTextSeries());
    }

    public static final CompletableFuture<TextSeries> listOperators(Functionality functionality) {
        return call(LIST_OPERATORS, ListOperatorsFunctionality.class, functionality, null, result -> result.asTextSeries());
    }

    public static final CompletableFuture<Double> multiply(OperandsModel operandsModel) {
        return call(MULTIPLY, MultiplyFunctionality.class, getCallingFunctionality(), operandsModel, result -> result.asRealDigit());
    }

    public static final CompletableFuture<Double> multiply(Functionality functionality, OperandsModel operandsModel) {
        return call(MULTIPLY, MultiplyFunctionality.class, functionality, operandsModel, result -> result.asRealDigit());
    }

    public static final CompletableFuture<Double> multiplyFromJson(String operandsModelJson) {
        return callFromJson(MULTIPLY, MultiplyFunctionality.class, getCallingFunctionality(), operandsModelJson, result -> result.asRealDigit());
    }

    public static final CompletableFuture<Double> multiplyFromJson(Functionality callingFunctionality, String operandsModelJson) {
        return callFromJson(MULTIPLY, MultiplyFunctionality.class, callingFunctionality, operandsModelJson, result -> result.asRealDigit());
    }

    public static final CompletableFuture<Double> subtract(OperandsModel operandsModel) {
        return call(SUBTRACT, SubtractFunctionality.class, getCallingFunctionality(), operandsModel, result -> result.asRealDigit());
    }

    public static final CompletableFuture<Double> subtract(Functionality functionality, OperandsModel operandsModel) {
        return call(SUBTRACT, SubtractFunctionality.class, functionality, operandsModel, result -> result.asRealDigit());
    }

    public static final CompletableFuture<Double> subtractFromJson(String operandsModelJson) {
        return callFromJson(SUBTRACT, SubtractFunctionality.class, getCallingFunctionality(), operandsModelJson, result -> result.asRealDigit());
    }

    public static final CompletableFuture<Double> subtractFromJson(Functionality callingFunctionality, String operandsModelJson) {
        return callFromJson(SUBTRACT, SubtractFunctionality.class, callingFunctionality, operandsModelJson, result -> result.asRealDigit());
    }

    public static final CompletableFuture<Double> sum(OperandsModel operandsModel) {
        return call(SUM, SumFunctionality.class, getCallingFunctionality(), operandsModel, result -> result.asRealDigit());
    }

    public static final CompletableFuture<Double> sum(Functionality functionality, OperandsModel operandsModel) {
        return call(SUM, SumFunctionality.class, functionality, operandsModel, result -> result.asRealDigit());
    }

    public static final CompletableFuture<Double> sumFromJson(String operandsModelJson) {
        return callFromJson(SUM, SumFunctionality.class, getCallingFunctionality(), operandsModelJson, result -> result.asRealDigit());
    }

    public static final CompletableFuture<Double> sumFromJson(Functionality callingFunctionality, String operandsModelJson) {
        return callFromJson(SUM, SumFunctionality.class, callingFunctionality, operandsModelJson, result -> result.asRealDigit());
    }

    @Bean
    static final DivideFunctionality divideFunctionality() {
        return DivideFunctionality.INSTANCE;
    }

    @Bean
    static final DoOperationFunctionality doOperationFunctionality() {
        return DoOperationFunctionality.INSTANCE;
    }

    @Bean
    static final ListOperatorsFunctionality listOperatorsFunctionality() {
        return ListOperatorsFunctionality.INSTANCE;
    }

    @Bean
    static final MultiplyFunctionality multiplyFunctionality() {
        return MultiplyFunctionality.INSTANCE;
    }

    @Bean
    static final SubtractFunctionality subtractFunctionality() {
        return SubtractFunctionality.INSTANCE;
    }

    @Bean
    static final SumFunctionality sumFunctionality() {
        return SumFunctionality.INSTANCE;
    }

}
