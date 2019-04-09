package com.example.demo.calc;

import com.example.demo.calc.dto.TwoElementOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/calc")
public class CalcHandler {

    @PutMapping(value="/add", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> add(@RequestBody TwoElementOperation operation) {
        CalcService calcService = new CalcService();
        Integer result = calcService.add(operation.getFirstValue(), operation.getSecondValue());
        return ResponseEntity.ok(result);
    }
}
