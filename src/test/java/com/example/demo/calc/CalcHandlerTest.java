package com.example.demo.calc;

import com.example.demo.DemoApplication;
import com.example.demo.calc.dto.TwoElementOperation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class CalcHandlerTest {
    @Autowired
    private CalcHandler calcHandler;

    @Test
    public void addTest_simple() {
        Integer result = calcHandler.add(new TwoElementOperation(1,1)).getBody();
        assertThat(result).isEqualTo(2);
    }
}
