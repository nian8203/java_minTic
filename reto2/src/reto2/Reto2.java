/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

/**
 *
 * @author nian
 */
public class Reto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Libro l1 = new Libro("84-344-8023-9", "El cuerpo como delito", "Toro, Josep", 353);
        Libro l2 = new Libro("84-270-1013-3", "Estrés y procesos cognitivos", "Lazarus, Richard S.", 468);

        System.out.println("Detalles libro 1\n" + l1);
        System.out.println("Detalles libro 2\n" + l2);

        String res = Libro.paginas(l1.getNumPag(), l2.getNumPag());
        System.out.println("\n===========================================");
        System.out.println(res);
        System.out.println("===========================================\n");

    }

}
