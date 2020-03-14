package com.metaring.example.calculator;

import com.metaring.framework.Tools;
import com.metaring.framework.type.DataRepresentation;
import com.metaring.framework.GeneratedCoreType;

public class OperatorEnumerator implements GeneratedCoreType {

    public static final OperatorEnumerator SUM = new OperatorEnumerator("SUM", 0l, "sum");
    public static final OperatorEnumerator SUB = new OperatorEnumerator("SUB", 1l, "subtract");
    public static final OperatorEnumerator MUL = new OperatorEnumerator("MUL", 2l, "multiply");
    public static final OperatorEnumerator DIV = new OperatorEnumerator("DIV", 3l, "divide");

    private String name;
    private Long numericValue;
    private String textualValue;

    private OperatorEnumerator(String name, Long numericValue, String textualValue) {
        this.name = name;
        this.numericValue = numericValue;
        this.textualValue = textualValue;
    }

    public String getName() {
        return this.name;
    }

    public Long getNumericValue() {
        return this.numericValue;
    }

    public String getTextualValue() {
        return this.textualValue;
    }

    public static final OperatorEnumeratorSeries listAll() {
        return OperatorEnumeratorSeries.create(SUM, SUB, MUL, DIV);
    }

    public static OperatorEnumerator getByNumericValue(Long numericValue) {
        if(numericValue == null) {
            return null;
        }
        switch(numericValue.intValue()) {

            case 0 : return SUM;

            case 1 : return SUB;

            case 2 : return MUL;

            case 3 : return DIV;

            default: return null;
        }
    }

    public static OperatorEnumerator getByTextualValue(String textualValue) {
        if(textualValue == null) {
            return null;
        }
        switch(textualValue) {

            case "sum" : return SUM;

            case "subtract" : return SUB;

            case "multiply" : return MUL;

            case "divide" : return DIV;

            default: return null;
        }
    }

    public static OperatorEnumerator getByName(String operatorEnumeratorName) {
        if(operatorEnumeratorName == null) {
            return null;
        }
        switch(operatorEnumeratorName) {

            case "SUM" : return SUM;

            case "SUB" : return SUB;

            case "MUL" : return MUL;

            case "DIV" : return DIV;

            default: return null;
        }
    }

    public static OperatorEnumerator fromJson(String json) {
        if(json == null) {
            return null;
        }
        if(json.startsWith("\"")) {
            json = json.substring(1);
        }
        if(json.endsWith("\"")) {
            json = json.substring(0, json.length() - 1);
        }
        try {
            return getByNumericValue(Long.parseLong(json));
        } catch(Exception e) {
        }
        OperatorEnumerator result = getByTextualValue(json);
        return result != null ? result : getByName(json);
    }

    @Override
    public String toJson() {
        return "\"" + this.name + "\"";
    }

    public DataRepresentation toDataRepresentation() {
        return Tools.FACTORY_DATA_REPRESENTATION.fromJson(toJson());
    }

    @Override
    public String toString() {
        return toJson();
    }
}