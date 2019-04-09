package com.example.demo.calc;

import com.example.demo.calc.dto.MultiElementOperation;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
class CalcService {

    private OperationsRepository operationsRepository;

    public CalcService(OperationsRepository operationsRepository) {
        this.operationsRepository = operationsRepository;
    }

    public Integer add(List<Integer> values) {
        Operation operation = new Operation(values.toString(), "ADD");
        operationsRepository.save(operation);
        return values.stream().mapToInt(Integer::intValue).sum();
    }
}
