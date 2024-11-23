package org.example;

import org.example.sum.Calculate;
import org.example.sum.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    Calculator calculator = new Calculate();

    @Test
    public void testingSum(){
        int test1 = calculator.sum(2, 2);
        Assert.assertEquals(4, test1);
    }

    @Test
    public void testingDif(){
        int test1 = calculator.dif(10, 6);
        Assert.assertEquals(4, test1);
    }

    @Test
    public void testingProd(){
        double test1 = calculator.prod(4, 4);
        Assert.assertEquals(16, test1, 0.001);
    }

    @Test
    public void testingDivThrows(){
        Assert.assertThrows(ArithmeticException.class, () -> calculator.div(5, 0));
    }
}