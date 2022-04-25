package com.punto1.software;

import static java.lang.Math.*;

public class Areas {
    private static final double pi = PI ;
    private double radio = 0;

    public Areas(double radio){
        this.radio=radio;
    }

    public double AreaCirculo(double radio){
        return pi*pow(radio,2);
    }

}
