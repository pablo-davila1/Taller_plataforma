package com.punto1.software;

public class Compare {
    private int number1=0;
    private int number2=0;
    public Compare(int number1, int number2){
        this.number1=number1;
        this.number2=number2;

    }
    public int greater(int number1, int number2){
        if(number1 > number2)
            return number1;
        return number2;
    }
}
