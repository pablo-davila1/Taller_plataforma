package com.impares.software;

import com.punto1.software.MostrarMenu;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import  java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MostrarMenu mostrar = new MostrarMenu();
        mostrar.Mostrar2();
        Scanner reader = new Scanner(System.in);
        int opcion = 0;
        opcion = reader.nextInt();
        while (opcion != 0) {
            switch (opcion) {
                case 5: {
                    /*
                    5.Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while.
                     */
                    int controlador = 0;
                    while (controlador <= 100) {
                        if (controlador % 2 == 0)
                            System.out.println("Numero par -> " + controlador);
                        else
                            System.out.println("Numero impar -> " + controlador);
                        controlador++;
                    }
                    break;
                }
                case 6: {
                    /*
                    6.Realiza el ejercicio anterior usando un ciclo for.
                     */
                    for (int i = 0; i <= 100; i++) {
                        if (i % 2 == 0)
                            System.out.println("Numero par -> " + i);
                        else
                            System.out.println("Numero impar -> " + i);
                    }
                    break;
                }
                case 7: {
                    /*
                    7.Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
                    si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
                    */
                    Scanner reader2 = new Scanner(System.in);
                    int numero = -1;
                    do {
                        System.out.println("El numero " + numero + " es menor que 0");
                        System.out.print("Ingrese un numero: ");
                        numero = reader.nextInt();
                    } while (numero < 0);
                    System.out.println("El numero " + numero + " es mayor o igual que 0");
                }
                case 8:
                {
                    /*
                    Crea una aplicación por consola que nos pida un día de la semana y que nos diga si es
                    un día laboral o no. Usa un switch para ello.
                    */
                    MostrarMenu menu8 = new MostrarMenu();
                    menu8.MostrarPunto8();
                    System.out.print("Ingrese una opcion correspodiente a la semana: ");
                    int semana = 0;
                    semana = reader.nextInt();
                    switch (semana){
                        case 1:
                        {
                          System.out.println("Es un dia laboral");
                          break;
                        }
                        case 2:
                        {
                            System.out.println("Es un dia laboral");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Es un dia laboral");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Es un dia laboral");
                            break;
                        }
                        case 5:
                        {
                            System.out.println("Es un dia laboral");
                            break;
                        }
                        case 6:
                        {
                            System.out.println("No es un dia laboral");
                            break;
                        }
                        case 7:
                        {
                            System.out.println("No es un dia laboral");
                            break;
                        }
                        default:
                        {
                            System.out.println("Opccion incorrecta.");
                            break;
                        }

                    }


                }
                case 9:
                {
                    /*
                    Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza todas las a del
                    String anterior por una e, adicionalmente concatenar a esta frase una adicional que
                    ustedes quieran incluir por consola y las muestre luego unidas.
                     */
                    String frase = "La sonrisa sera la mejor arma contra la tristeza";
                    String frase_remplazo = "";
                    for(int i = 0; i<frase.length() ; i++){
                        if(frase.charAt(i) == 'a')
                            frase_remplazo += 'e';
                        else
                            frase_remplazo += frase.charAt(i);
                    }
                    System.out.print("Ingrese la frase a concatenar: ");
                    Scanner text = new Scanner(System.in);
                    String adicional = text.nextLine();
                    System.out.println(frase_remplazo+" "+adicional);
                    break;
                }
                case 10:
                {
                    /*
                    10. Realizar una aplicación de consola, que al ingresar una frase por teclado
                    elimine los espacios que esta contenga.
                     */
                    System.out.print("Ingrese una frase: ");
                    Scanner text = new Scanner(System.in);
                    String adicional = text.nextLine();

                    for(int i = 0; i<adicional.split(" ").length ; i++){
                        System.out.println(adicional.split(" ")[i]);
                    }

                    break;
                }
                case 11:
                {
                    /*
                    11.Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por consola,
                    indicar cual es la longitud de esta frase, adicionalmente cuantas vocales tiene
                    de “a,e,i,o,u”.
                     */
                    System.out.print("Ingrese una frase: ");
                    Scanner frase = new Scanner(System.in);
                    String texto = frase.nextLine();
                    System.out.println("La longitud de la frase es:"+texto.length());
                    List<String> vocales;
                    vocales = new ArrayList<String>();
                    int numvocales =0;
                    vocales.add("a");
                    vocales.add("e");
                    vocales.add("i");
                    vocales.add("o");
                    vocales.add("u");
                    for(int i = 0; i<texto.length() ; i++){
                        if(texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i' || texto.charAt(i) == 'o' || texto.charAt(i) == 'u')
                            numvocales++;
                    }
                    System.out.println("La cantidad de vocales es: "+numvocales);
                    break;

                }
                case 12:{
                    /*
                    12. Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar
                    sus diferencias.
                     */
                    System.out.print("Ingrese una frase: ");
                    Scanner frase = new Scanner(System.in);
                    String frase1 = frase.nextLine();
                    System.out.print("Ingrese otra frase: ");
                    String frase2 = frase.nextLine();

                    if(!frase1.equals(frase2)){
                        System.out.println("No son iguales");
                        for(Integer i = 0; i<frase1.length(); i++){
                            if(frase1.charAt(i) != frase2.charAt(i) && frase1.length() >= i && frase2.length() >= i){
                                System.out.println("En la posicion "+i+" "+frase1+" tiene una "+frase1.charAt(i)+" y "+frase2+" tiene una "+frase2.charAt(i));
                            }
                        }
                    }
                    else
                        System.out.println("Las frases son iguales");
                    break;

                }
                case 13:{
                    /*
                    13. Realizar un algoritmo que permita consulta la fecha y hora actual en el
                    formato (AAAA/MM/DD) (HH:MM:SS)
                     */
                    DateTimeFormatter punto13 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    System.out.println("Tiempo actual= "+punto13.format(LocalDateTime.now()));

                    break;
                }
                case 14:{
                    /*
                    14. Crear un programa que pida un numero por teclado y que imprima por pantalla los números
                    desde el numero introducido hasta 1000 con saldos de 2 en 2.
                     */
                    Scanner reader2 = new Scanner(System.in);
                    System.out.println("Ingrese un numero: ");
                    Integer numero = reader2.nextInt();
                    for (Integer num=numero; num<=1000; num+=2) {
                        System.out.println(num);
                    }
                    break;
                }
                case 15:{
                    MostrarMenu punto15 = new MostrarMenu();
                    Scanner reader2 = new Scanner(System.in);
                    Integer option15 = 0;
                    while (option15 != 8){
                        switch (option15){
                            case 1:{
                                break;
                            }
                            case 2:{
                                break;
                            }
                            case 3:{
                                break;
                            }
                            case 4:{
                                break;
                            }
                            case 5:{
                                break;
                            }
                            case 6:{
                                break;
                            }
                            case 7:{
                                break;
                            }
                            default:{
                                System.out.println("La opcion: "+option15+" no existe.");
                                break;
                            }

                        }
                        punto15.MostrarMenuPunto15();
                        option15  = reader2.nextInt();
                    }
                    break;
                }
                case 16:{
                    Scanner reader2 = new Scanner(System.in);
                    Scanner reader3 = new Scanner(System.in);
                    System.out.print("Ingrese su nombre: ");
                    Scanner text = new Scanner(System.in);
                    String nombre = text.nextLine();

                    System.out.println("Ingrese su uedad: ");
                    Integer edad = reader2.nextInt();
                    System.out.print("Ingrese su sexo: ");
                    String sexochar = text.nextLine();
                    char sexo = sexochar.charAt(0);

                    System.out.println("Ingrese su peso: ");
                    double peso = reader3.nextDouble();

                    System.out.println("Ingrese su altura: ");
                    double altura = reader3.nextDouble();

                    Persona persona1 = new Persona();
                    Persona persona2 = new Persona( nombre, edad, sexo);
                    Persona persona3 = new Persona(nombre, edad, sexo,"100445418" ,peso,   altura);
                    if(persona1.calcularIMC() == 0)
                        System.out.println("Esta en su peso ideal");
                    else if (persona1.calcularIMC() == -1)
                        System.out.println("Tiene bajo peso");
                    else
                        System.out.println("Tiene sobrepeso");

                    if(persona2.calcularIMC() == 0)
                        System.out.println("Esta en su peso ideal");
                    else if (persona2.calcularIMC() == -1)
                        System.out.println("Tiene bajo peso");
                    else
                        System.out.println("Tiene sobrepeso");

                    if(persona3.calcularIMC() == 0)
                        System.out.println("Esta en su peso ideal");
                    else if (persona3.calcularIMC() == -1)
                        System.out.println("Tiene bajo peso");
                    else
                        System.out.println("Tiene sobrepeso");

                    if(persona1.esMayorDeEdad())
                        System.out.println("Es mayor de edad");
                    else
                        System.out.println("Es menor de edad");
                    if(persona2.esMayorDeEdad())
                        System.out.println("Es mayor de edad");
                    else
                        System.out.println("Es menor de edad");
                    if(persona3.esMayorDeEdad())
                        System.out.println("Es mayor de edad");
                    else
                        System.out.println("Es menor de edad");

                    ArrayList<String> informacion = new ArrayList<String>();
                    informacion = persona3.to_String();
                    for(int i = 0; i< informacion.size() ; i++) {
                        System.out.print(informacion.get(i));
                        System.out.print(" ");
                    }
                    System.out.println();

                    break;

                }
                case 17:{
                    String electrodomesticos[]= {"lavadora","nevera","horno","estufa","cafetera","plancha","microondas","lavaplatos","freidora" };
                    break;
                }
                case 0:{
                    break;
                }

                default: {
                    System.out.println("Opcion incorrecta");
                }
            }
            mostrar.Mostrar2();
            reader = new Scanner(System.in);
            opcion = reader.nextInt();

        }
    }
}
