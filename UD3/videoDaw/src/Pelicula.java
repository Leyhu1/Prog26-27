import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pelicula {

    //Contador
    private static int contadorTotal = 0;

    //Formato para fechas
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    //Atributos
    private final int id;
    private String cod;
    private String titulo;
    private Genero genero;
    private LocalDate fechaRegistro;
    private LocalDate fechaBaja;
    private LocalDateTime fechaAlquiler;
    private boolean isAlquilada;

    //Constructores
    public Pelicula(String cod, String titulo) {
        this.cod = cod;
        this.titulo = titulo;
        this.genero = Genero.Accion;
        this.fechaRegistro = LocalDate.now();
        this.fechaBaja = LocalDate.now();
        this.fechaAlquiler = LocalDateTime.now();
        this.isAlquilada = false;
        this.id = contadorTotal;
        contadorTotal++;
    }

    public Pelicula(String cod, String titulo, Genero genero, LocalDate fechaRegistro, LocalDate fechaBaja, LocalDateTime fechaAlquiler, boolean isAlquilada) {
        this.cod = cod;
        this.titulo = titulo;
        this.genero = genero;
        this.fechaRegistro = fechaRegistro;
        this.fechaBaja = fechaBaja;
        this.fechaAlquiler = fechaAlquiler;
        this.isAlquilada = isAlquilada;
        this.id = contadorTotal;
        contadorTotal++;
    }

    //Mostrar informacion peliculas
    public String infoPelicula() {
        String infoPelicula = "";
        infoPelicula += "ID: " + this.id + "\n";
        infoPelicula += "Titulo: " + this.titulo + "\n";
        infoPelicula += "Codigo: " + this.cod + "\n";
        infoPelicula += "Genero: " + this.genero.name() + "\n";
        infoPelicula += "Fecha de Registro: " + this.fechaRegistro.format(formatter) + "\n";
        infoPelicula += "Fecha de Baja: " + this.fechaBaja.format(formatter) + "\n";
        infoPelicula += "Fecha de Alquiler: " + this.fechaAlquiler.format(formatter) + "\n";
        infoPelicula += "Esta Alquilada: " + this.isAlquilada + "\n";

        return infoPelicula;

    }

    //Mostrar info Peliculas alquiladas
    public String infoPeliculasAlquiladas(){
        String infoPeliculasAlquiladas = "";
        infoPeliculasAlquiladas += "ID: " + this.id + "\n";
        infoPeliculasAlquiladas += "Titulo: " + this.titulo + "\n";
        infoPeliculasAlquiladas += "Codigo: " + this.cod + "\n";
        infoPeliculasAlquiladas += "Genero: " + this.genero.name() + "\n";
        infoPeliculasAlquiladas += "Fecha de Alquiler: " + this.fechaAlquiler.format(formatter) + "\n";

        return infoPeliculasAlquiladas;
    }
}
