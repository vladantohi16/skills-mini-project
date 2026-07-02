package com.skillspractice;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Skills Mini Project - Calculator Demo");
        System.out.println("--------------------------------------");
        System.out.println("2 + 3 = " + calculator.add(2, 3));
        System.out.println("10 - 4 = " + calculator.subtract(10, 4));
        System.out.println("6 * 7 = " + calculator.multiply(6, 7));
        System.out.println("20 / 4 = " + calculator.divide(20, 4));
        System.out.println("5! = " + calculator.factorial(5));
    }
}
