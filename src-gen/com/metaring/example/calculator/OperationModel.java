package com.metaring.example.calculator;

import com.metaring.example.calculator.OperandsModel;
import com.metaring.example.calculator.OperatorEnumerator;
import com.metaring.framework.Tools;
import com.metaring.framework.type.DataRepresentation;
import com.metaring.framework.GeneratedCoreType;

public class OperationModel implements GeneratedCoreType {

    public static final String FULLY_QUALIFIED_NAME = "com.metaring.example.calculator.operation";

    private OperandsModel operands;
    private OperatorEnumerator operator;

    private OperationModel(OperandsModel operands, OperatorEnumerator operator) {
        this.operands = operands;
        this.operator = operator;
    }

    public OperandsModel getOperands() {
        return this.operands;
    }

    public OperatorEnumerator getOperator() {
        return this.operator;
    }

    public static OperationModel create(OperandsModel operands, OperatorEnumerator operator) {
        return new OperationModel(operands, operator);
    }

    public static OperationModel fromJson(String jsonString) {

        if(jsonString == null) {
            return null;
        }

        jsonString = jsonString.trim();
        if(jsonString.isEmpty()) {
            return null;
        }

        if(jsonString.equalsIgnoreCase("null")) {
            return null;
        }

        DataRepresentation dataRepresentation = Tools.FACTORY_DATA_REPRESENTATION.fromJson(jsonString);

        OperandsModel operands = null;
        if(dataRepresentation.hasProperty("operands")) {
            try {
                operands = dataRepresentation.get("operands", OperandsModel.class);
            } catch (Exception e) {
            }
        }

        OperatorEnumerator operator = null;
        if(dataRepresentation.hasProperty("operator")) {
            try {
                operator = dataRepresentation.get("operator", OperatorEnumerator.class);
            } catch (Exception e) {
            }
        }

        OperationModel operationModel = create(operands, operator);
        return operationModel;
    }

    public static OperationModel fromObject(Object object) {

        if(object == null) {
            return null;
        }

        DataRepresentation dataRepresentation = Tools.FACTORY_DATA_REPRESENTATION.fromObject(object);

        OperandsModel operands = null;
        if(dataRepresentation.hasProperty("operands")) {
            try {
                operands = dataRepresentation.get("operands", OperandsModel.class);
            } catch (Exception e) {
            }
        }

        OperatorEnumerator operator = null;
        if(dataRepresentation.hasProperty("operator")) {
            try {
                operator = dataRepresentation.get("operator", OperatorEnumerator.class);
            } catch (Exception e) {
            }
        }

        OperationModel operationModel = create(operands, operator);
        return operationModel;
    }

    public DataRepresentation toDataRepresentation() {
        DataRepresentation dataRepresentation = Tools.FACTORY_DATA_REPRESENTATION.create();
        if (operands != null) {
            dataRepresentation.add("operands", operands);
        }

        if (operator != null) {
            dataRepresentation.add("operator", operator);
        }

        return dataRepresentation;
    }

    @Override
    public String toJson() {
        return toDataRepresentation().toJson();
    }

    @Override
    public String toString() {
        return this.toJson();
    }
}