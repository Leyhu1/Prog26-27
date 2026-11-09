public class Movimiento {

    //Atributos
    private int id; //me aseguro que nadie cambie su valor
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
    public String mostrarInfoMovimiento(){
        String mostrarInfoMovimiento = "";
        mostrarInfoMovimiento += "ID: " + this.id + "\n";
        mostrarInfoMovimiento += "Fecha: " + this.fecha + "\n";
        mostrarInfoMovimiento += "Tipo: " + this.tipo + "\n";
        mostrarInfoMovimiento += "Cantidad: " + this.cantidad + "\n";

        return mostrarInfoMovimiento;
    }
}
