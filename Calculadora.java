/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Jonathan Fernández López
 * 71891784V
 */
public class Calculadora {
    
    private int operando1;
    private int operando2;
    
    public Calculadora(int operando1, int operando2){
        this.setOperando1(operando1);
        this.setOperando2(operando2);
    }
    
    //set
    public void setOperando1(int operando1){this.operando1=operando1;}
    public void setOperando2(int operando2){this.operando2=operando2;}
    //get
    public int getOperando1(){ return operando1;}
    public int getOperando2(){ return operando2;}
    //metodos
    public int suma(){return getOperando1()+getOperando2();}
    public int resta(){return getOperando1()-getOperando2();}
    public int producto(){return getOperando1()*getOperando2();}
    
    
}
