package com.impares.software;

import java.util.ArrayList;
import java.lang.Math;

public class Persona {
    private String nombre="juan";
    private Integer edad=5;
    private String DNI="1234";
    private char sexo='H';
    private double peso= 60;
    private double altura = 1.60;

    public Persona(){

    }
    public Persona(String nombre, Integer edad, char sexo){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setSexo(sexo);
    }
    public Persona(String nombre, Integer edad, char sexo, String DNI, double peso, double altura){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setSexo(sexo);
        this.setDNI(DNI);
        this.setPeso(peso);
        this.setAltura(altura);
    }

    Integer calcularIMC(){
        double metrica_corporal = getPeso() / (getAltura() * getAltura());
        if ( metrica_corporal < 20){
            return -1;
        }
        else if (20 < metrica_corporal && metrica_corporal>25){
            return 0;
        }
        return 1;
    }
    boolean esMayorDeEdad(){
        if(getEdad() <17)
            return true;
        return false;
    }
    void comprobarSexo(char sexo){
        if(sexo != getSexo())
            setSexo('H');
    }
    public ArrayList<String> to_String(){
        ArrayList<String> numbers = new ArrayList<String>();
        numbers.add(getNombre());
        numbers.add(String.valueOf(getEdad()));
        numbers.add(getDNI());
        numbers.add(String.valueOf(getSexo()));
        numbers.add(String.valueOf(getPeso()));
        numbers.add(String.valueOf(getAltura()));
        return numbers;
    }
    String generaDNI(){

        String NewDNI = "";
        for(int i = 0; i<9 ; i++){
            NewDNI += String.valueOf(Math.floor(Math.random()*9+1));
        }
        return NewDNI;
    }



    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
