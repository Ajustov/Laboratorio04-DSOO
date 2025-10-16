public class Usuario {
    private String nombre;
    private int dni;  //Mejora de variable
    
    //Constructor
    public Usuario(String nombre, String dni){
        this.nombre=nombre;
        this.dni=dni;
    
        
    //metodos setters y getters para atributos setters y getters
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
    	
    //save
    public void int setDni(int dni) {
    		this.dni=dni;
    }
    @Override
    public String toString() {
        return "Usuario: " + nombre + " - DNI: " + dni;
    }
}
