/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno36
 */
public class Entero {
    
    
    private int entero;
    
    //constructor
    public Entero(int entero){this.setEntero(entero);}
    //get y set
    public int getEntero(){return this.entero;}
    public void setEntero(int entero){this.entero=entero;}
    //metodos
    public Entero sumar(Entero entero) {
       Entero entero1= new Entero(this.entero + entero.getEntero());    
       return entero1;
    }   
}
