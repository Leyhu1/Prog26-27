import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pelicula {

    //Contador
    private static int contadorTotal = 0;

    //Formato para fechas
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    //Atributos
    private final int cod;
    private String titulo;
    private Genero genero;
    private LocalDate fechaRegistro;
    private LocalDate fechaBaja;
    private LocalDateTime fechaAlquiler;
    private boolean isAlquilada;

    //Constructores
    public Pelicula(String titulo, Genero genero) {
        this.cod = contadorTotal;
        this.titulo = titulo;
        this.genero = genero;
        this.fechaRegistro = LocalDate.now();
        this.fechaBaja = LocalDate.now();
        this.fechaAlquiler = LocalDateTime.now();
        this.isAlquilada = false;
        contadorTotal++;
    }


    //getter y setter
    public String getCod(){
        return String.format("P-0%s",this.cod);
    }

    public String getTitulo(){
        return titulo;
    }

    public Genero getGenero(){
        return genero;
    }

    public LocalDate getFechaRegistro(){
        return fechaRegistro;
    }

    public LocalDate getFechaBaja(){
        return fechaBaja;
    }

    public LocalDateTime getFechaAlquiler(){
        return fechaAlquiler;
    }

    public boolean isAlquilada(){
        return isAlquilada;
    }

    //Mostrar informacion peliculas
    public String infoPelicula() {
        StringBuilder sb = new StringBuilder();
        sb.append("Titulo: ").append(this.titulo).append("\n");
        sb.append("Codigo: ").append(this.cod).append("\n");
        sb.append("Genero: ").append(this.genero).append("\n");
        sb.append("Fecha de registro: ").append(this.fechaRegistro).append("\n");
        sb.append("Fecha de Baja: ").append(this.fechaBaja).append("\n");
        sb.append("Fecha Alquiler: ").append(this.fechaAlquiler).append("\n");
        sb.append("Esta alquilada: ").append(this.isAlquilada).append("\n");

        return sb.toString();

    }
    public boolean alquiler(){
        this.isAlquilada = true;
        fechaAlquiler = LocalDateTime.now();
        return isAlquilada;
    }

    public boolean devolver(){
        this.isAlquilada = false;
        return isAlquilada;
    }
}
