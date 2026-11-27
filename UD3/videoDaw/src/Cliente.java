import java.time.LocalDate;


public class Cliente {

    //Contador
    private static int contadorSocio = 0;
    //Atributos
    private String dni;
    private String nombre;
    private final int numSocio;
    private String direccion;
    private LocalDate fechaNacimiento;
    private LocalDate fechaBajaCliente;
    private Pelicula[] peliculasAlquiladas;
    private int ultPeliculasAlquiladas;
    private final int dimensionInicial = 100;

    //Constructores
    public Cliente(String dni, String nombre, String direccion, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.numSocio = contadorSocio;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.peliculasAlquiladas = new Pelicula[this.dimensionInicial];
        this.ultPeliculasAlquiladas = 0;
        contadorSocio++;
    }

    //Getter y Setter

    public String getDni(){
        return dni;
    }

    public String getNombre(){
        return nombre;
    }

    public String getNumSocio(){
        return String.format("S-0%s",this.numSocio);
    }

    public String getDireccion(){
        return direccion;
    }

    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }

    public LocalDate getFechaBajaCliente(){
        return fechaBajaCliente;
    }

    public int getUltPeliculasAlquiladas(){
        return ultPeliculasAlquiladas;
    }

    //Mostrar informacion Clientes
    public String infoClientes() {
        StringBuilder sb = new StringBuilder();
        sb.append("DNI: ").append(this.dni).append("\n");
        sb.append("Nombre: ").append(this.nombre).append("\n");
        sb.append("Direccion: ").append(this.direccion).append("\n");
        sb.append("Fecha de Nacimiento: ").append(this.fechaNacimiento).append("\n");
        sb.append("Fecha de Baja del cliente: ").append(this.fechaBajaCliente).append("\n");
        sb.append("Peliculas Alquiladas: ").append(this.ultPeliculasAlquiladas).append("\n");
        sb.append("Numero de Socio: ").append(this.numSocio).append("\n");

        return sb.toString();

    }
    //Mostrar informacion Peliculas Alquiladas
    public String mostrarPeliculasAlquiladas() {

        StringBuilder sb = new StringBuilder();
        if(this.ultPeliculasAlquiladas > 0){
            for(int i=0; i<this.ultPeliculasAlquiladas;i++){
                sb.append(this.peliculasAlquiladas[i].infoPelicula()).append("\n");
            }
        }else{
            sb.append("No hay Peliculas alquiladas");
        }

        return sb.toString();
    }
    //Alquilar pelicula
    public boolean addPelicula(Pelicula p1){
        boolean isAdd = false;
        if(p1 != null){
            this.peliculasAlquiladas[ultPeliculasAlquiladas] = p1;
            ultPeliculasAlquiladas++;
            isAdd = true;
        }
        return isAdd;
    }

    //Devolver Pelicula
    public boolean quitarPelicula(Pelicula p1){
        boolean isRemove = false;
        if(p1 != null){
            ultPeliculasAlquiladas--;
        }
        return isRemove;
    }


}
