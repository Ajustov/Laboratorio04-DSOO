public class Usuario {
    private String nombre;
    private int dni;  //Mejora de variable
    private Libro libroPrestado;
    
    public Usuario(String nombre, int dni) {

		this.nombre=nombre;
		this.dni=dni;
		
    }
    
    public void setNombre(String nombre) {
        this.nombre=nombre;
       //hola
        
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

    public Libro getLibroPrestado() {
        return libroPrestado;
    }

    public void setLibroPrestado(Libro libroPrestado) {
        this.libroPrestado = libroPrestado;
    }

    
    public void mostrarEstadoPrestamo() {
        System.out.println("\n--- Estado de préstamo del usuario ---");
        System.out.println("Usuario: " + nombre + " (DNI: " + dni + ")");
        if (libroPrestado != null) {
            System.out.println("Tiene en préstamo: " + libroPrestado.getTitulo());
        } else {
            System.out.println("No tiene ningún libro en préstamo actualmente.");
        }
    }
}   
  