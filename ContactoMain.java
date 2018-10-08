/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno36
 */
public class ContactoMain {
    
    
    
    public static void main(String[] args) {
        
        
        Contacto contacto1=new Contacto("pepe", "garcia", "654258753", "La Camara",745865123);
        
        System.out.println("Contacto principal");
        System.out.println();
        System.out.println(contacto1.getContacto());
        
        contacto1.setApellidos("Díaz");
        contacto1.setNombre("Juan");
        contacto1.setTelefono("673492312");
        contacto1.setDireccion("Quirinal");
        contacto1.setNIF(74215368);
        
        System.out.println();
        System.out.println("Contacto modificado");
        System.out.println();
        System.out.println(contacto1.getContacto());
    }
    
    
}
