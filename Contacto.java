/**
 * @author Jonathan Fernández López
 * 71891784V
 */
public class Contacto {
    
    
    private String nombre;
    private String apellidos;
    private String telefono;
    private String direccion;
    private int NIF;
    
    public Contacto(String nombre,String apellidos,String telefono,String direccion, int NIF){
        
        this.setNombre(nombre);
        this.setApellidos(apellidos);
        this.setTelefono(telefono);
        this.setDireccion(direccion);
        this.setNIF(NIF);
        
    }
    
    //nombre en mayusculas
   public void setNombre(String nombre){
    
       this.nombre=nombre.toUpperCase();
    
    }
    //
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    //+34 al principio
    public void setTelefono(String telefono){
        this.telefono="+34"+telefono;
    }
    
    public void setDireccion(String direccion){
        this.direccion="C/"+direccion;
    }
    public void setNIF(int NIF){
    
        
                this.NIF=NIF;
    
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public String getTelefono(){
        return telefono;
    
    }
    public int getNIF(){
        return NIF;
    }
    public String getDireccion(){
        return direccion;
    }
    public char calcularLetra(int NIF){
    
        char letras[]={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        return  letras[getNIF()%23];
    }
    
    //devolver cadena de texto
    //nombre: Joni
    //Apellidos: fdez
    //tel.:+34........
   public String getContacto(){
   
       return "Nombre:\t\t"+getNombre()+
               "\nApellidos:\t"+getApellidos()+
               "\nTelefono:\t"+getTelefono()+
               "\nDireccion:\t"+getDireccion()+
               " \nNIF:\t\t"+getNIF()+calcularLetra(getNIF());
   
   }
}
