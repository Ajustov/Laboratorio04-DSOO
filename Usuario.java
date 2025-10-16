public class Usuario {
    private String nombre;
    private int dni;  //Mejora de variable
    
    public Usuario(String nombre, int dni) {

		this.nombre=nombre;
		this.dni=dni;
		
    }
    
    public void setNombre(String nombre) {
        this.nombre=nombre;
       
    }
    
    public String getNombre() {
    		return nombre;
    }
    
    
    public void setDni(int dni) {
        this.dni=dni;
       
    }
    
    public int getDni()	{
    		return dni;
		
}
}   
  