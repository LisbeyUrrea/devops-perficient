package org.example;

public class Calculator {

    public int add(int num1, int num2){
        return num1 + num2;
    }

    public int subtract(int minuend, int subtrahend){
        return minuend - subtrahend;
    }

    public int multiplication(int number1, int number2){
        return number1 * number2;
    }

    public int division(int divider, int divisor){
        if(divisor <= 0) throw new IllegalArgumentException("We can divide by 0");
        return divider / divisor;
    }

    @Override
    public String toString() {
        return "This value has a true";
    }
}
