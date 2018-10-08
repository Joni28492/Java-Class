/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Jonathan Fernández López
 * 71891784V
 */
public class MainCalculadora {
    
    
    
    
    public static void main(String[] args) {
        
        Calculadora operandos = new Calculadora(9,3);
        
        System.out.println("Operando 1: "+ operandos.getOperando1() +
                            " Operando 2: "+ operandos.getOperando2() +"\n");
        
        System.out.println("suma= "+operandos.suma());
        System.out.println("resta= "+operandos.resta());
        System.out.println("producto= "+operandos.producto());
        
        operandos.setOperando1(4);
        operandos.setOperando2(6);
        
        System.out.println("Cambiados");
        
        System.out.println("Operando 1: "+ operandos.getOperando1() +
                            " Operando 2: "+ operandos.getOperando2() +"\n");
        
        System.out.println("suma= "+operandos.suma());
        System.out.println("resta= "+operandos.resta());
        System.out.println("producto= "+operandos.producto());
        
    }
    
    
}
