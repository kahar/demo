package com.example.demo.calc;

import com.example.demo.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.PostConstruct;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class CalcServiceTest {

    private CalcService calcService;

    @PostConstruct
    public void setup() {
        calcService = new CalcService();
    }

    @Test
    public void addTest() {
        Integer result = calcService.add(1, 1);
        assertThat(result).isEqualTo(2);
    }
}
