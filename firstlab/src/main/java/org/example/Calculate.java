package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculate implements Calculator {
    static Logger logger = LogManager.getLogger();
    public static int sum(int a, int b){
        return a + b;
    }
    public static double div(double a, double b) {
        if (b == 0) {
            ArithmeticException e = new ArithmeticException("На 0 мы не делим");
            logger.info(e.getMessage());
            throw e;
        }
        return a / b;
    }
    public static int
}
