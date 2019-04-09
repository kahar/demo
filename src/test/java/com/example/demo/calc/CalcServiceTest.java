package com.example.demo.calc;

import com.example.demo.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.PostConstruct;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class CalcServiceTest {

    @Autowired
    private OperationsRepository operationsRepository;

    private CalcService calcService;

    @PostConstruct
    public void setup() {
        calcService = new CalcService(operationsRepository);
    }

    @Test
    public void addTest_simple() {
        Integer result = calcService.add(Arrays.asList(1, 1));
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void addTest_addWithZero() {
        Integer result = calcService.add(Arrays.asList(0, 1));
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void addTest_addWithNegativeNumber() {
        Integer result = calcService.add(Arrays.asList(1, -1));
        assertThat(result).isEqualTo(0);
    }

}
