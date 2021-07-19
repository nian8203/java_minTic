/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;

import java.util.Scanner;

/**
 *
 * @author nian
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (true) {
            System.out.println("\n================================");
            System.out.println("Seleccione el ejercicio a ejecutar");
            System.out.println("Ejercicio 1");
            System.out.println("Ejercicio 2");
            System.out.println("Ejercicio 3");
            System.out.println("'0' para salir");
            System.out.println("================================\n");
            System.out.print("Digite una opcion = ");
            opcion = sc.nextInt();
            

            if (opcion == 1) {
                System.out.println("\n================================");
                System.out.println("Numero es par o impar");
                System.out.print("Ingrese un numero = ");
                int num = sc.nextInt();
                Ejercicio1(num);
                System.out.println("================================\n");
            } else if (opcion==2) {
                System.out.println("\n================================");
                System.out.println("valor de ingreso por edad");
                System.out.print("Ingrese su edad = ");
                int num = sc.nextInt();
                Ejercicio2(num);
                System.out.println("================================\n");
            }else if (opcion==3) {
                System.out.println("\n================================");
                System.out.println("Tablas de multiplicar");
                System.out.print("Ingrese un mumero = ");
                int num = sc.nextInt();
                System.out.println("");
                Ejercicio3(num);
                System.out.println("================================\n");
            }
            else 
                break;
            

        }

    }

    public static void Ejercicio1(int num) {
        if (num % 2 == 0) {
            System.out.println("El numero ingresado es par");
        } else {
            System.out.println("El numero ingresado es impar");
        }
    }
    
    public static void Ejercicio2(int edad){
        if (edad<4) {
            System.out.println("El usuario inresa gratis");
        }else if (edad>=4 && edad<=18) {
            System.out.println("El usuario debe pagar $5.000");
        }else if (edad>18) {
            System.out.println("El usuario debe pagar $10.000");
        }
    }
    
    public static void Ejercicio3(int num){
        for (int i = 1; i < 11; i++) {
            int res = num*i;
            System.out.println(num+" X "+i+" = "+res);
        }
    }

}
