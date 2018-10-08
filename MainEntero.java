/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno36
 */
public class MainEntero {
    
    
    public static void main(String[] args) {
        
        
        Entero entero1=new Entero(4);
        Entero entero2=new Entero(2);
        
        
        System.out.println("Entero: "+entero1.getEntero());
        System.out.println("Suma: "+entero1.sumar(entero2).getEntero());
        
        
    }
    
    
    
    
}
