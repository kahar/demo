package com.example.demo.calc.dto;

import java.util.List;

public class MultiElementOperation {
    private List<Integer> values;

    public MultiElementOperation() {
    }

    public MultiElementOperation(List<Integer> values) {
        this.values = values;
    }

    public List<Integer> getValues() {
        return values;
    }

    public void setValues(List<Integer> values) {
        this.values = values;
    }
}
