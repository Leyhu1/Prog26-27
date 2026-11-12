import java.time.LocalDate;

public class Movimiento {

    //Atributos
    private final int id; //me aseguro que nadie cambie su valor
    private String fecha;
    private String tipo;
    private double cantidad;

    //Constructor
    public Movimiento(int id, String fecha, String tipo, double cantidad){
        this.id = id;
        this.fecha = fecha;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    //Mostrar la informacion
    public void mostrarInfoMovimiento(){

        System.out.println("ID: " + id);
        System.out.println("Fecha: " + fecha);
        System.out.println("Tipo: " + tipo);
        System.out.println("Cantidad: " + cantidad + " €");
        System.out.println("-------------------------");

    }
}
