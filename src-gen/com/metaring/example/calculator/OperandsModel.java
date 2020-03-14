package com.metaring.example.calculator;

import com.metaring.framework.Tools;
import com.metaring.framework.type.DataRepresentation;
import com.metaring.framework.GeneratedCoreType;

public class OperandsModel implements GeneratedCoreType {

    public static final String FULLY_QUALIFIED_NAME = "com.metaring.example.calculator.operands";

    private Double first;
    private Double second;

    private OperandsModel(Double first, Double second) {
        this.first = first;
        this.second = second;
    }

    public Double getFirst() {
        return this.first;
    }

    public Double getSecond() {
        return this.second;
    }

    public static OperandsModel create(Double first, Double second) {
        return new OperandsModel(first, second);
    }

    public static OperandsModel fromJson(String jsonString) {

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

        Double first = null;
        if(dataRepresentation.hasProperty("first")) {
            try {
                first = dataRepresentation.getRealDigit("first");
            } catch (Exception e) {
            }
        }

        Double second = null;
        if(dataRepresentation.hasProperty("second")) {
            try {
                second = dataRepresentation.getRealDigit("second");
            } catch (Exception e) {
            }
        }

        OperandsModel operandsModel = create(first, second);
        return operandsModel;
    }

    public static OperandsModel fromObject(Object object) {

        if(object == null) {
            return null;
        }

        DataRepresentation dataRepresentation = Tools.FACTORY_DATA_REPRESENTATION.fromObject(object);

        Double first = null;
        if(dataRepresentation.hasProperty("first")) {
            try {
                first = dataRepresentation.getRealDigit("first");
            } catch (Exception e) {
            }
        }

        Double second = null;
        if(dataRepresentation.hasProperty("second")) {
            try {
                second = dataRepresentation.getRealDigit("second");
            } catch (Exception e) {
            }
        }

        OperandsModel operandsModel = create(first, second);
        return operandsModel;
    }

    public DataRepresentation toDataRepresentation() {
        DataRepresentation dataRepresentation = Tools.FACTORY_DATA_REPRESENTATION.create();
        if (first != null) {
            dataRepresentation.add("first", first);
        }

        if (second != null) {
            dataRepresentation.add("second", second);
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