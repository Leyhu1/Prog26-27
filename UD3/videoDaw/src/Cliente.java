import java.time.LocalDate;

public class Cliente {

    //Atributos
    private String dni;
    private String nombre;
    private String numSocio;
    private String direccion;
    private LocalDate fechaNacimiento;
    private LocalDate fechaBajaCliente;
    private Pelicula[] peliculasAlquiladas;
    private int ultPeliculasAlquiladas;
    private final int dimensionInicial = 100;

    //Constructores
    public Cliente(String dni, String nombre, String numSocio, String direccion, LocalDate fechaNacimiento, LocalDate fechaBajaCliente) {
        this.dni = dni;
        this.nombre = nombre;
        this.numSocio = numSocio;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaBajaCliente = fechaBajaCliente;
        this.peliculasAlquiladas = new Pelicula[this.dimensionInicial];
        this.ultPeliculasAlquiladas = 0;
    }


    //Mostrar informacion Clientes
    public String infoClientes() {
        String infoClientes = "";
        infoClientes += "DNI: " + this.dni + "\n";
        infoClientes += "Nombre: " + this.nombre + "\n";
        infoClientes += "numSocio: " + this.numSocio + "\n";
        infoClientes += "Direccion: " + this.direccion + "\n";
        infoClientes += "Fecha de Nacimiento: " + this.fechaNacimiento + "\n";
        infoClientes += "Fecha de Baja: " + this.fechaBajaCliente + "\n";
        infoClientes += "Numero peliculas alquiladas: " + this.ultPeliculasAlquiladas + "\n";

        return infoClientes;

    }
    //Mostrar informacion Peliculas Alquiladas
    public void mostrarPeliculasAlquiladas() {

        if (ultPeliculasAlquiladas == 0) {
            System.out.println("No hay Peliculas Alquiladas.");
            return;
        }

        System.out.println("\n--- HISTORIAL DE Peliculas Alquiladas ---");

        for (int i = 0; i < ultPeliculasAlquiladas; i++) {
            peliculasAlquiladas[i].infoPeliculasAlquiladas();
        }
    }
}
