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

    //Getter y Setter
    public String getCif() {
        return cif;
    }

    public String getDireccionVideoDaw() {
        return direccionVideoDaw;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public Pelicula[] getPeliculasRegistradas() {
        return peliculasRegistradas;
    }

    public Cliente[] getClientesRegistrados() {
        return clientesRegistrados;
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
    public String mostarPeliculasRegistradas(){

        StringBuilder sb = new StringBuilder();
        if(this.nPeliculasRegistradas > 0){
            for(int i=0; i<this.nPeliculasRegistradas;i++){
                sb.append(this.peliculasRegistradas[i].infoPelicula()).append("\n");
            }
        }else{
            sb.append("No hay Peliculas Registradas");
        }

        return sb.toString();
    }

    //Mostrar Clientes registrados
    public String mostarClientesRegistrados(){

        StringBuilder sb = new StringBuilder();
        if(this.nClientesRegistrados > 0){
            for(int i=0; i<this.nClientesRegistrados;i++){
                sb.append(this.clientesRegistrados[i].infoClientes()).append("\n");
            }
        }else{
            sb.append("No hay Clientes Registrados");
        }

        return sb.toString();
    }

    //Metodo registrar una pelicula
    public boolean registrarPelicula(Pelicula p){

       boolean isAdd = false;
        if(p != null){
            this.peliculasRegistradas[nPeliculasRegistradas] = p;
            nPeliculasRegistradas++;
            p.isAlquilada();
        }
        return isAdd;
    }

    //Metodo registrar un Cliente
    public boolean registrarCliente(Cliente c){

        boolean isAdd = false;
        if(c != null){
            this.clientesRegistrados[nClientesRegistrados] = c;
            nClientesRegistrados++;
        }
        return isAdd;
    }

    //Posiciones
    public Cliente posicionCliente(int i){
        return this.clientesRegistrados[i];
    }

    public Pelicula posicionPelicula(int i){
        return this.peliculasRegistradas[i];
    }

    //alquilar pelicula
    public boolean alquilarPelicula(int c, int p){
        this.posicionCliente(c);
        this.posicionPelicula(p).alquiler();
        boolean isAdd = false;
        return isAdd;
    }

    //Devolver Pelicula
    public boolean devolverPelicula(int c, int p){
        this.posicionCliente(c);
        this.posicionPelicula(p).devolver();
        boolean isRemove = false;
        return isRemove;
    }

    //Metodo dar de baja a un cliente
    public boolean darBajaCliente(Cliente cliente, int c){
        boolean quitarCliente = false;
        if (cliente != null){
            this.clientesRegistrados[nClientesRegistrados] = null;
            for (int i = 0; i < nClientesRegistrados; i++){
                this.clientesRegistrados[nClientesRegistrados - 1] = this.clientesRegistrados[i];

            }
            this.clientesRegistrados[nClientesRegistrados - 1] = null;
            nClientesRegistrados--;
            quitarCliente = true;
        }
        return quitarCliente;
    }

    //Metodo dar de baja a una pelicula
    public boolean darBajaPelicula(Pelicula pelicula, int p){
        boolean quitarPelicula = false;
        if (p >= 0 && p < nPeliculasRegistradas){
            this.peliculasRegistradas[nPeliculasRegistradas] = null;
            for (int i = 0; i < nPeliculasRegistradas; i++){
                this.peliculasRegistradas[nPeliculasRegistradas - 1] = this.peliculasRegistradas[i];

            }
            this.peliculasRegistradas[nPeliculasRegistradas - 1] = null;
            nPeliculasRegistradas--;
            quitarPelicula = true;
        }
        return quitarPelicula;
    }
}
