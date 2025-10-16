public class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private boolean disponible;
// cosntructores
    public Libro(String titulo, String autor, String ISBN, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.disponible = disponible;
    }
// constructor sobrecargado
    public Libro(String titulo, String autor, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.disponible = true;
    }

    // Método para verificar disponibilidad
    public boolean estaDisponible() {
        return disponible;
    }

    // Método to string 
    @Override
    public String toString() {
        return "Título: " + titulo +
               "\nAutor: " + autor +
               "\nISBN: " + ISBN +
               "\nDisponible: " + (disponible ? "Sí" : "No");
    }
    // setter y geters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }
// set SIBM
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    
}
