import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaBiblioteca sistema = new SistemaBiblioteca();

        Usuario usuario1 = new Usuario("Jose", 12345678);
        Usuario usuario2 = new Usuario("Ana", 12345656);
        Usuario usuario3 = new Usuario("Luis", 12356321);
        sistema.registrarUsuario(usuario1);
        sistema.registrarUsuario(usuario2);
        sistema.registrarUsuario(usuario3);

        Libro libro1 = new Libro("Cien Anios de Soledad", "Gabriel García Marquez", "123456");
        Libro libro2 = new Libro("Don Quijote", "Miguel de Cervantes", "654321");
        Libro libro3 = new Libro("La Ciudad y los Perros", "Mario Vargas Llosa", "111222");
        sistema.registrarLibro(libro1);
        sistema.registrarLibro(libro2);
        sistema.registrarLibro(libro3);

        int opcion = -1;
        do {
            System.out.println("\n===== SISTEMA DE BIBLIOTECA =====");

            System.out.println("1. Registrar Usuario");
            System.out.println("2. Registrar Libro");
            System.out.println("3. Prestar Libro");
            System.out.println("4. Devolver Libro");
            System.out.println("5. Mostrar todos los libros registrados");
            System.out.println("6. Mostrar todos los usuarios registrados");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opción inválida, ingrese un número.");
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese nombre del usuario: ");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese DNI del usuario: ");
                    int dni;
                    try {
                        dni = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Error: el DNI debe ser un número.");
                        break;
                    }
                    sistema.registrarUsuario(new Usuario(nombre, dni));
                    break;

                case 2:
                    System.out.println("Ingrese titulo del libro: ");
                    String titulo = sc.nextLine();
                    System.out.println("Ingrese autor del libro: ");
                    String autor = sc.nextLine();
                    System.out.println("Ingrese ISBN del libro: ");
                    String isbn = sc.nextLine();
                    sistema.registrarLibro(new Libro(titulo, autor, isbn));
                    break;

                case 3:
                    sistema.mostrarUsuarios();
                    System.out.println("Seleccione índice de usuario: ");
                    int idxUsuarioP;
                    try {
                        idxUsuarioP = Integer.parseInt(sc.nextLine()) - 1;
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida.");
                        break;
                    }
                    sistema.mostrarLibros();
                    System.out.println("Seleccione índice de libro: ");
                    int idxLibroP;
                    try {
                        idxLibroP = Integer.parseInt(sc.nextLine()) - 1;
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida.");
                        break;
                    }
                    sistema.prestarLibro(sistema.getUsuarios().get(idxUsuarioP), sistema.getLibros().get(idxLibroP));
                    break;

                case 4:
                    sistema.mostrarUsuarios();
                    System.out.println("Seleccione índice de usuario: ");
                    int idxUsuarioD;
                    try {
                        idxUsuarioD = Integer.parseInt(sc.nextLine()) - 1;
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida.");
                        break;
                    }
                    sistema.mostrarLibros();
                    System.out.println("Seleccione índice de libro: ");
                    int idxLibroD;
                    try {
                        idxLibroD = Integer.parseInt(sc.nextLine()) - 1;
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida.");
                        break;
                    }
                    sistema.devolverLibro(sistema.getUsuarios().get(idxUsuarioD), sistema.getLibros().get(idxLibroD));
                    break;
                 
                case 5:
                    System.out.println("...Libros registrados:");
                    sistema.mostrarLibros();
                    break;
                    
                case 6:
                	System.out.println("...Usuarios registrados:");
                    sistema.mostrarUsuarios();
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);
    }
}
