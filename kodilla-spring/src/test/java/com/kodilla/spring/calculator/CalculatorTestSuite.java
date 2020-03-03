package com.kodilla.spring.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest

public class CalculatorTestSuite {

    @Test
    public void testCalculations() {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        double addResult = calculator.add(0, 5);
        double subResult = calculator.sub(10, 5);
        double mulResult = calculator.mul(1, 5);
        double divResult = calculator.div(5, 1);

        assertThat(5.0).isEqualTo(addResult);
        assertThat(5.0).isEqualTo(subResult);
        assertThat(5.0).isEqualTo(mulResult);
        assertThat(5.0).isEqualTo(divResult);
    }
}