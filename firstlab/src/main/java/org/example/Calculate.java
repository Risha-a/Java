package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Calculate implements Calculator {
    private static final Logger logger = LogManager.getLogger(Calculate.class);

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int dif(int a, int b) {
        return a - b;
    }

    @Override
    public double prod(double a, double b) {
        return a * b;
    }

    @Override
    public double div(double a, double b) {
        if (b == 0) {
            ArithmeticException e = new ArithmeticException("На 0 мы не делим");
            logger.error(e.getMessage(), e);
            throw e;
        }
        return a / b;
    }
}