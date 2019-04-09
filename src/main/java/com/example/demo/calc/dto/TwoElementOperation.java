package com.example.demo.calc.dto;

public class TwoElementOperation {
    private Integer firstValue;
    private Integer secondValue;

    public TwoElementOperation() {
    }

    public TwoElementOperation(Integer firstValue, Integer secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public Integer getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(Integer firstValue) {
        this.firstValue = firstValue;
    }

    public Integer getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(Integer secondValue) {
        this.secondValue = secondValue;
    }
}
