import java.time.LocalDate;

public class Videojuego extends Producto{

    private String peg;
    private String plataforma;
    private String desarrolladora;

    public Videojuego(String peg, String plataforma, String desarrolladora,
                 String codigo, String nombre, String descripcion, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;

        this.peg = peg;
        this.plataforma = plataforma;
        this.desarrolladora = desarrolladora;
    }

    public String getPeg() {
        return peg;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public String getDesarrolladora() {
        return desarrolladora;
    }

    @Override
    public double obtenerDescuento() {
        return 0;
    }

    @Override
    public String obtenerCalificacion() {
        return this.peg;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("PEG='").append(peg).append("\n");
        sb.append("Plataforma=").append(plataforma).append("\n");
        sb.append("Desarrolladora='").append(desarrolladora).append("\n");

        return sb.toString();
    }
}
