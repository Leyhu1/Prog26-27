import java.time.LocalDate;

public class Libro extends Producto{

    private String isbn;
    private String autor;
    private String editorial;
    private LocalDate fechaPublicacion;
    private int nPaginas;

    public Libro(String isbn, String autor, String editorial, LocalDate fechaPublicacion, int nPaginas,
                    String codigo, String nombre, String descripcion, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;

        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.nPaginas = nPaginas;
    }

    @Override
    public double obtenerDescuento() {
        return 20;
    }

    @Override
    public String obtenerCalificacion() {
        return "PARA TODOS LOS PUBLICOS";
    }

    public String getIsbn() {
        return isbn;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("ISBN='").append(isbn).append("\n");
        sb.append("Autor=").append(autor).append("\n");
        sb.append("Editorial='").append(editorial).append("\n");
        sb.append("FechaPublicacion ='").append(fechaPublicacion).append("\n");
        sb.append("nPaginas='").append(nPaginas).append("\n");

        return sb.toString();
    }
}
