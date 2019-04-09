package com.example.demo.calc;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
class CalcService {

    private OperationsRepository operationsRepository;

    public CalcService(OperationsRepository operationsRepository) {
        this.operationsRepository = operationsRepository;
    }

    public Integer add(int a, int b){
        Operation operation = new Operation(Arrays.asList(a,b).toString(), "ADD");
        operationsRepository.save(operation);
        return a + b;
    }
}
