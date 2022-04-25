package com.punto1.software;

public class Impuestos {
    private final int IVA = 21;
    private double precio_final=0;
    private double impuesto=0;
    private double precio=0;
    public  Impuestos (double precio){
        this.precio=precio;

    }
    public double IVA(double precio){
        impuesto=(19*precio)/100;
        precio_final= precio-impuesto;
        return precio_final;
    }
}
