public class Usuario {
    private String nombre;
    private int dni;  //Mejora de variable
    public Usuario(String nombre, String dni){
        this.nombre=nombre;
        this.dni=dni;
        
    }
    public String getNombre(){
        return nombre;
    }
    public String getDni(){
        return dni;
    }
    
    //Creacion de setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    	
    public void int setDni(int dni) {
    		this.dni=dni;
    }
    @Override
    public String toString() {
        return "Usuario: " + nombre + " - DNI: " + dni;
    }
}
