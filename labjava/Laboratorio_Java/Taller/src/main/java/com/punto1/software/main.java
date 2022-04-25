package com.punto1.software;

import javax.swing.*;
import java.util.Scanner;

import static java.lang.Math.PI;

public class main {
    public static void main(String[] args) {

        MostrarMenu mostrar = new MostrarMenu();
        mostrar.Mostrar();
        Scanner reader = new Scanner(System.in);
        int opcion = 0;
        opcion = reader.nextInt();
        while (opcion != 0) {

            switch (opcion) {

                case 1: {
                    /*
                     1.Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
                     Si son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.
                     */
                    int number1=5;
                    int number2=3;
                    Compare mayor = new Compare(number2,number1);

                    System.out.println("El numero mayor es: "+mayor.greater(number2,number1));

                    break;

                }

                case 2: {
                    /*
                    2.Al ejercicio anterior agregar entrada por consola de dos valores e
                    indicar si son mayores, menores o iguales.
                     */

                    int number1=0;
                    int number2=0;
                    System.out.print("Ingrese un numero: ");
                    reader = new Scanner(System.in);
                    number1 = reader.nextInt();
                    System.out.print("Ingrese otro numero: ");
                    reader = new Scanner(System.in);
                    number2 = reader.nextInt();

                    Compare mayor = new Compare(number2,number1);

                    System.out.println("El numero mayor es: "+mayor.greater(number2,number1));


                    break;

                }

                case 3: {
                    /*
                     3.Haz una aplicación que calcule el área de un círculo(pi*R2).
                    El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
                    Usa la constante PI y el método pow de Math.
                     */

                    System.out.print("Ingrese el radio: ");
                    Scanner captura = new Scanner(System.in);
                    String radio = captura.nextLine();
                    Areas area_circulo = new Areas(Double.parseDouble(radio));
                    System.out.println("El area del circulo es: "+area_circulo.AreaCirculo(Double.parseDouble(radio)));


                    break;

                }
                case 4: {
                    /*
                    4.Lee un número por teclado que pida el precio de un producto (puede tener decimales) y
                    calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
                     */
                    double precio=0;
                    System.out.print("Ingrese el precio del producto: ");
                    reader = new Scanner(System.in);
                    precio = reader.nextDouble();
                    Impuestos precio_final= new Impuestos(precio);
                    System.out.println("El precio final del producto es: "+precio_final.IVA(precio));

                    break;
                }
                case 0:{
                    break;
                }

                default: {

                    System.out.println("Opcion incorrecta");

                }

            }
            mostrar.Mostrar();
            reader = new Scanner(System.in);
            opcion = reader.nextInt();

        }
    }

}
