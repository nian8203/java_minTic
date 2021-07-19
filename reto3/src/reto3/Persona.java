/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3;

import java.util.Random;

/**
 *
 * @author nian
 */
public class Persona {

    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;
    private static final char sexoDefinido = 'h';
    private static final int pesoBajo = -1;
    private static final int sobrePeso = 1;
    private static final int pesoIdeal = 0;

    public Persona() {

    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexoDefinido;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return 
                "Nombre:\t" + nombre
                + "\nEdad:\t" + edad
                + "\nDNI:\t" + generarDNI()
                + "\nSexo:\t" + comprobarSexo(sexo)
                + "\nPeso:\t" + peso
                + "\nAltura:\t" + altura;
    }

    public static int calcularIMC(double peso, double altura) {
        double imc = peso / (Math.pow(altura, 2));
        int res = 0;
        if (imc < 20) {
            res = pesoBajo;
        } else if (imc >= 20 && imc <= 25) {
            res = pesoIdeal;
        } else {
            res = sobrePeso;
        }

        return res;
    }

    public static boolean mayorEdad(int edad) {
        boolean res = true;
        if (edad < 18) {
            res = false;
        }

        return res;
    }

    public static String comprobarSexo(char sexo) {
        String res;
        if (sexo != sexoDefinido) {
            res = "";
        } else {
            res = "H";
        }

        return res;
    }

    public static String generarDNI() {
        Random r = new Random();
        int num;
        String codigo = "";
        num = (int) (100000000 * Math.random());
        codigo = "" + num;

        for (int i = codigo.length(); i < 8; i++) {
            codigo = "0" + codigo;
        }
        
        String dni = Persona.generarLetra()+codigo;
        return dni;

    }
    
    
    public static String generarLetra(){
        String letra = "";
        int ascii = (int) Math.floor(Math.random() * (90
                    - 65) + 65);
        letra = letra + (char) ascii;
        
        return letra;
    }
    
    public static void msjPeso(int peso){
        if (peso == -1) {
            System.out.println("Esta bajo de peso");
        }else if (peso == 0) {
            System.out.println("Tiene un peso ideal");            
        }else
            System.out.println("Tiene sobrepeso");           
    }
    
    public static void msjMayorEdad(boolean edad){
        if (edad) {
            System.out.println("Es mayor de edad");
        }else
            System.out.println("Es menor de edad");
            
    }
    

    

}
