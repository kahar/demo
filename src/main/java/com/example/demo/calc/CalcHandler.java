package com.example.demo.calc;

import com.example.demo.calc.dto.MultiElementOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/calc")
public class CalcHandler {

    @Autowired
    private CalcService calcService;

    @PutMapping(value="/add", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> add(@RequestBody MultiElementOperation operation) {
        Integer result = calcService.add(operation.getValues());
        return ResponseEntity.ok(result);
    }
}
