import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CuentaBancaria {


    //Atributos
    private String iban;
    private String titular;
    private double saldo;
    private Movimiento[] movimientos;
    private int numMovimientos;

    //Identificador unico de los movimientos
    private static int contadorID = 1;

    //Constructor
    public CuentaBancaria(String iban, String titular){

        if (!iban.matches("[A-Z]{2}[0-9]{22}")){
            System.out.println("IBAN incorrecto");
        }
        if (titular == null){
            System.out.println("el titular es obligatorio");
        }
        this.iban = iban;
        this.titular = titular;
        this.saldo = 0;
        this.movimientos = new Movimiento[100];
        this.numMovimientos = 0;

    }

    //Getters y Setters
    public String getIban() {
        return this.iban;
    }

    public String getTitular() {
        return this.titular;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    //Mostrar los datos
    public void mostrarDatos(){
        System.out.println("IBAN: " + iban);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo + " €");
    }

    //Crear metodo para registrar Movimientos
    private void registrarMovimiento(String tipo, double cantidad) {

        String fecha = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));


        Movimiento movimiento = new Movimiento(
                contadorID,
                fecha,
                tipo,
                cantidad
        );

        movimientos[numMovimientos] = movimiento;

        numMovimientos++;
        contadorID++;
    }

    //Metodo para que el usuario ingrese dinero
    public boolean ingresar(double cantidad) {

        if (cantidad <= 0) {
            System.out.println("ERROR: La cantidad debe ser mayor que cero.");
            return false;
        }

        if (numMovimientos >= movimientos.length) {
            System.out.println("ERROR: Historial de movimientos completo.");
            return false;
        }

        saldo += cantidad;

        registrarMovimiento("Ingreso", cantidad);

        if (saldo < 0) {
            System.out.println("AVISO: Saldo negativo");
        }

        if (cantidad > 3000) {
            System.out.println("AVISO: Notificar a hacienda");
        }

        System.out.println("Ingreso realizado correctamente.");

        return true;
    }

    //Metodo retirar dinero
    public boolean retirar(double cantidad) {

        if (cantidad <= 0) {
            System.out.println("ERROR: La cantidad debe ser mayor que cero.");
            return false;
        }

        if (numMovimientos >= movimientos.length) {
            System.out.println("ERROR: Historial de movimientos completo.");
            return false;
        }

        if (saldo - cantidad < -50) {
            System.out.println("ERROR: Saldo insuficiente."); //el saldo nunca puede bajar de -50€
            return false;
        }

        saldo -= cantidad;

        registrarMovimiento("Retirada", cantidad);

        if (saldo < 0) {
            System.out.println("AVISO: Saldo negativo");
        }

        if (cantidad > 3000) {
            System.out.println("AVISO: Notificar a hacienda");
        }

        System.out.println("Retirada realizada correctamente.");

        return true;
    }

    //Metodo para mostrar los movimientos
    public void mostrarMovimientos() {

        if (numMovimientos == 0) {
            System.out.println("No hay movimientos registrados.");
            return;
        }

        System.out.println("\n--- HISTORIAL DE MOVIMIENTOS ---");

        for (int i = 0; i < numMovimientos; i++) {
            movimientos[i].mostrarInfoMovimiento();
        }
    }

}
