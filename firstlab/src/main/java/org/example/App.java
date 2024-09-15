package org.example;

import java.io.IOException;
public class App {
    public static void main(String[] args) throws IOException {
        Calculate sum = new Calculate();
        System.out.println(sum.sum(2,2));
    }
}
