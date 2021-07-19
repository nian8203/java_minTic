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
public class Libro {
    
    private String ISBN;
    private String titulo;
    private String autor;
    private int numPag;
    
    public Libro(String ISBN, String titulo, String autor, int numPag){
        this.ISBN = ISBN;
        this.autor = autor;
        this.numPag = numPag;
        this.titulo = titulo;
    }
    
    public String getISBN(){
        return ISBN;
    }
    
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }   
    
    
    public String toString(){
        return "===========================================\n"
                + "El libro: "+titulo+""
                + "\nCon ISBN: "+ISBN+""
                + "\nCreado por el autor: "+autor+""
                + "\nTiene: "+numPag+" paginas\n"
                + "===========================================\n";
    }  
    
    
    public static String paginas(int pag1, int pag2){
        
        String msj = "";
        if (pag1>pag2) {
            msj = "El libro 1 tiene mayor numero de paginas"; 
        }else
            msj = "El libro 2 tiene mayor numero de paginas";           
        
        return msj;
    }
    
    
    
}
