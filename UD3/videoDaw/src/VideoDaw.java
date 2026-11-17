import java.time.LocalDate;

public class VideoDaw {

    //Atributos
    private String cif;
    private String direccionVideoDaw;
    private LocalDate fechaAlta;
    private Pelicula[] peliculasRegistradas;
    private Cliente[] clientesRegistrados;
    private int nPeliculasRegistradas;
    private int nClientesRegistrados;
    private final int dimensionInicialPeliculas = 100;
    private final int dimensionInicialClientes = 100;

    //Constructores
    public VideoDaw(String cif, String direccionVideoDaw, LocalDate fechaAlta) {
        this.cif = cif;
        this.direccionVideoDaw = direccionVideoDaw;
        this.fechaAlta = fechaAlta;
        this.peliculasRegistradas = new Pelicula[this.dimensionInicialPeliculas];
        this.clientesRegistrados = new Cliente[this.dimensionInicialClientes];
        this.nPeliculasRegistradas = 0;
        this.nClientesRegistrados = 0;
    }

    //Mostrar informacion VideoDaw
    public String infoVideoDaw() {
        String infoVideoDaw = "";
        infoVideoDaw += "CIF: " + this.cif + "\n";
        infoVideoDaw += "Direccion: " + this.direccionVideoDaw + "\n";
        infoVideoDaw += "Fecha Alta: " + this.fechaAlta + "\n";
        infoVideoDaw += "Numero de Peliculas Registradas: " + this.nPeliculasRegistradas + "\n";
        infoVideoDaw += "Numero de Clientes Registrados: " + this.nClientesRegistrados + "\n";

        return infoVideoDaw;
    }

    //Mostrar peliculas registradas
    public void mostarPeliculasRegistradas(){

        if (nPeliculasRegistradas == 0) {
            System.out.println("No hay Peliculas Registradas.");
            return;
        }

        System.out.println("\n---Peliculas Registradas ---");

        for (int i = 0; i < nPeliculasRegistradas; i++) {
            peliculasRegistradas[i].infoPelicula();
        }
    }

    //Mostrar Clientes registrados
    public void mostarClientesRegistrados(){

        if (nClientesRegistrados == 0) {
            System.out.println("No hay Clientes Registrados.");
            return;
        }

        System.out.println("\n--- Clientes Registrados ---");

        for (int i = 0; i < nClientesRegistrados; i++) {
            clientesRegistrados[i].infoClientes();
        }
    }

    //Metodo alquilar una pelicula

}
