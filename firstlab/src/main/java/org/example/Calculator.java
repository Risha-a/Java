package org.example;

interface Calculator {
    int sum(int a, int b);
    int dif(int a, int b);
    double prod(double a, double b);
    double div(double a, double b) throws ArithmeticException;
}