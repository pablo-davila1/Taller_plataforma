package com.impares.software;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Electrodomestico {
    private Integer precio_base=100;
    private double peso = 5;
    private String color="blanco";
    private String consumo="F";
    private String [] colores = {"blanco","negro","rojo","azul","gris"};

    public  Electrodomestico(){

    }
    public  Electrodomestico(Integer precio_base, double peso){
        this.precio_base = precio_base;
        this.peso = peso;
    }
    public  Electrodomestico(Integer precio_base, double peso, String color, String consumo){
        this.precio_base = precio_base;
        this.peso = peso;
        this.setColor(color);
        this.setConsumo(consumo);
    }

    void comprobarConsumoEnergetico(String letra){
        if(letra != "A" && letra != "B" &&letra != "C" &&letra != "D" &&letra != "E" &&letra != "F" )
            setConsumo("F");
    }

    void comprobarColor(String color){
        boolean flag = false;
        for (int i = 0 ; i<colores.length ; i++){
           if (colores[i].toLowerCase() == color.toLowerCase())
               flag = true;
        }
        if(flag == false)
            setColor("blanco");

    }
    Integer precioFinal(){
        Map<String, Integer> consumo_precio = new HashMap<String, Integer>();
        consumo_precio.put("A",100);
        consumo_precio.put("B",80);
        consumo_precio.put("C",60);
        consumo_precio.put("D",50);
        consumo_precio.put("E",30);
        consumo_precio.put("F",10);
        Integer precio_final = consumo_precio.get(consumo);

        if(peso <= 19)
            precio_final += 10;
        else if(20<peso && peso<49)
            precio_final += 50;
        else if (50 < peso && peso < 79)
            precio_final += 80;
        else if ( peso >= 80)
            precio_final += 100;


        return precio_final;
    }

    public Integer getPrecio_base() {
        return precio_base;
    }

    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
