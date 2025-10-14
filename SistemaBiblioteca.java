import java.util.*;
public class SistemaBiblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;
  
    // Constructor
    public SistemaBiblioteca() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }
    
    //Metodo registrar libro e impresión del Titulo de la unidad
    public void registrarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro registrado: " + libro.getTitulo());
    }

    // Registrar nuevo usuario
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario registrado: " + usuario.getNombre());
    }

    // Mostrar todos los libros
    public void mostrarLibros() {
        System.out.println("\n--- Lista de Libros ---");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    // Mostrar todos los usuarios
    public void mostrarUsuarios() {
        System.out.println("\n--- Lista de Usuarios ---");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }

    // Prestar un libro
    public void prestarLibro(Usuario usuario, Libro libro) {
        if (libro.estaDisponible()) {
            libro.setDisponible(false);
            System.out.println("El usuario " + usuario.getNombre() +
                    " ha tomado prestado: " + libro.getTitulo());
        } else {
            System.out.println("El libro '" + libro.getTitulo() + "' no está disponible.");
        }
    }

    // Devolver un libro
    public void devolverLibro(Usuario usuario, Libro libro) {
        if (!libro.estaDisponible()) {
            libro.setDisponible(true);
            System.out.println("El usuario " + usuario.getNombre() +
                    " ha devuelto: " + libro.getTitulo());
        } else {
            System.out.println("El libro '" + libro.getTitulo() + "' ya esta disponible.");
        }
    }

    // Obtener lista de libros
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    // Obtener lista de usuarios
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
}