import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SistemaBiblioteca sistema = new SistemaBiblioteca();
        //Inicializar usuarios
        Usuario usuario1 = new Usuario("Jose", 12345678);
        Usuario usuario2 = new Usuario("Ana", 12345656);
        Usuario usuario3 = new Usuario("Luis", 12356321);
        
        sistema.registrarUsuario(usuario1);
        sistema.registrarUsuario(usuario2);
        sistema.registrarUsuario(usuario3);
        //Inicializar libros
        Libro libro1 = new Libro("Cien Anios de Soledad", "Gabriel García Marquez", "123456");
        Libro libro2 = new Libro("Don Quijote", "Miguel de Cervantes", "654321");
        Libro libro3 = new Libro("La Ciudad y los Perros", "Mario Vargas Llosa", "111222");

        sistema.registrarLibro(libro1);
        sistema.registrarLibro(libro2);
        sistema.registrarLibro(libro3);
        //Sistema iterativo con diferentes opciones
        int opcion;
        do {
            System.out.println("\n===== SISTEMA DE BIBLIOTECA =====");
            System.out.println("1. Registrar Usuario");
            System.out.println("2. Registrar Libro");
            System.out.println("3. Prestar Libro");
            System.out.println("4. Devolver Libro");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1: // Registrar usuario
                    System.out.print("Ingrese nombre del usuario: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese DNI del usuario: ");
                    int dni = sc.nextInt();
                    sistema.registrarUsuario(new Usuario(nombre, dni));
                    break;
                case 2: // Registrar libro
                    System.out.print("Ingrese titulo del libro: ");
                    String titulo = sc.nextLine();
                    System.out.print("Ingrese autor del libro: ");
                    String autor = sc.nextLine();
                    System.out.print("Ingrese ISBN del libro: ");
                    String isbn = sc.nextLine();
                    sistema.registrarLibro(new Libro(titulo, autor, isbn));
                    break;

                case 3: // Prestar libro
                    sistema.mostrarUsuarios();
                    System.out.print("Seleccione indice de usuario");
                    int idxUsuarioP = sc.nextInt()-1;
                    sc.nextLine();

                    sistema.mostrarLibros();
                    System.out.print("Seleccione indice de libro: ");
                    int idxLibroP = sc.nextInt()-1;
                    sc.nextLine();
                    sistema.prestarLibro(
                                sistema.getUsuarios().get(idxUsuarioP),
                                sistema.getLibros().get(idxLibroP)
                        );
                    break;

                case 4: // Devolver libro
                    sistema.mostrarUsuarios();
                    System.out.print("Seleccione índice de usuario: ");
                    int idxUsuarioD = sc.nextInt()-2;
                    sistema.mostrarLibros();
                    System.out.print("Seleccione índice de libro: ");
                    int idxLibroD = sc.nextInt()-2;
                    sistema.devolverLibro(
                            sistema.getUsuarios().get(idxUsuarioD),
                            sistema.getLibros().get(idxLibroD)
                    );
                    break;

                case 0:
                    System.out.println("Saliendo del sistema");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 0);
    }
}
