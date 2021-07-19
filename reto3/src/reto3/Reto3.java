/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nian
 */
public class Reto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat();
        formato.setMaximumFractionDigits(2); //Con esta Linea.

        String nombre = "";
        int edad = 0;
        char sexo = ' ';
        double peso = 0;
        double altura = 0;

        Persona per1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona per2 = new Persona(nombre, edad, sexo);
        Persona per3 = new Persona();
        per3.setNombre(nombre);
        per3.setEdad(edad);
        per3.setPeso(peso);
        per3.setAltura(altura);
        per3.setPeso(peso);
        per3.setSexo(sexo);

        boolean mayor3 = false, mayor1 = false, mayor2 = false;
        int imc3 = 0, imc1 = 0, imc2 = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("\n\nDigite nombre No." + i + ": ");
            nombre = sc.next();
            System.out.print("Digite edad No." + i + ": ");
            edad = sc.nextInt();
            System.out.print("Digite sexo No." + i + ": ");
            sexo = sc.next().charAt(0);
            System.out.print("Digite peso No." + i + ": ");
            peso = sc.nextDouble();
            System.out.print("Digite altura No." + i + ": ");
            altura = sc.nextDouble();

            
            if (i==1) {
                per1 = new Persona(nombre, edad, sexo, peso, altura);
                mayor1 = per1.mayorEdad(edad);
                imc1 = per1.calcularIMC(peso, altura);
            }else if (i==2) {
                per2 = new Persona(nombre, edad, sexo);
                mayor2 = per2.mayorEdad(edad);
                imc2 = per2.calcularIMC(peso, altura);
                per2.setPeso(peso);
                per2.setAltura(altura);
            }else if (i==3) {
                per3.setNombre(nombre);
                per3.setEdad(edad);
                per3.setPeso(peso);
                per3.setAltura(altura);
                per3.setSexo(sexo);
                mayor3 = per3.mayorEdad(edad);
                imc3 = per3.calcularIMC(peso, altura);
            }
           
        }
        
        
         
                System.out.println("\n=========================================");
                System.out.println("                 Persona 1");
                System.out.println("_________________________________________\n");
                per1.comprobarSexo(sexo);
                System.out.println(per1);
                System.out.println("_________________________________________\n");
                per1.msjPeso(imc1);
                per1.msjMayorEdad(mayor1);
                System.out.println("=========================================\n");
                
            
                System.out.println("\n\n=========================================");
                System.out.println("                 Persona 2");
                System.out.println("_________________________________________\n");
                per2.comprobarSexo(sexo);
                System.out.println(per2);
                System.out.println("_________________________________________\n");
                per2.msjPeso(imc2);
                per2.msjMayorEdad(mayor2);
                System.out.println("=========================================\n");
                
            
                System.out.println("\n\n=========================================");
                System.out.println("                 Persona 3");
                System.out.println("_________________________________________\n");
                per3.comprobarSexo(sexo);
                System.out.println(per3);
                System.out.println("_________________________________________\n");
                per2.msjPeso(imc3);
                per2.msjMayorEdad(mayor3);
                System.out.println("=========================================\n");

    }

}
