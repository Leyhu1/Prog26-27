
public class Pelicula extends Producto{

    private String genero;
    private int duracion;
    private String isan;
    private String director;
    private String calificacionEdad;
    private String formato;


    public Pelicula(String genero, int duracion, String isan, String director, String calificacionEdad, String formato,
                    String codigo, String nombre, String descripcion, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;

        this.genero = genero;
        this.duracion = duracion;
        this.isan = isan;
        this.director = director;
        this.calificacionEdad = calificacionEdad;
        this.formato = formato;
    }

    public String getGenero() {
        return this.genero;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public String getIsan() {
        return this.isan;
    }

    public String getDirector() {
        return this.director;
    }

    public String getCalificacionEdad() {
        return this.calificacionEdad;
    }

    public String getFormato() {
        return this.formato;
    }

    public void setCalificacionEdad(String calificacionEdad) {
        this.calificacionEdad = calificacionEdad;
    }

    @Override
    public double obtenerDescuento() {
        return 10;
    }

    @Override
    public String obtenerCalificacion() {
        return this.calificacionEdad;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("genero='").append(genero).append("\n");
        sb.append("duracion=").append(duracion).append("\n");
        sb.append("isan='").append(isan).append("\n");
        sb.append("director='").append(director).append("\n");
        sb.append("calificacionEdad='").append(calificacionEdad).append("\n");
        sb.append("formato='").append(formato).append("\n");

        return sb.toString();
    }


}
