package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.example.Calculate.div;
import static org.example.Calculate.sum;

public class AppTest {
    @Test
    public void testingSum(){
        int test1 = sum(2, 2);
        Assert.assertEquals(4, test1);
    }

    @Test
    public void testingDivThrows(){
        Assert.assertThrows(ArithmeticException.class, () -> div(5, 0));
    }
}
