/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Español
 */
public class Persona {
    
    int edad=25;
    
    public void suma(){
    
        System.out.println("Probando suma sin argumento");
    
    }
    
    public void suma(int numero1){
    
        System.out.println(numero1);
    
    }
    
    
    public static void main(String[] args){
    
    int numero = 350;
    Persona juan = new Persona();
    
    juan.suma();
    juan.suma(juan.edad);
    
    
    
    }
}
