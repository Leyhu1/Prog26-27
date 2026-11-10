import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a DawBank");
        System.out.println("Primero debes crear una cuenta bancaria");
        String iban;
        String titular;
        do {
            System.out.println("Por favor, ingrese el IBAN");
            iban = scanner.nextLine();
            if (!iban.matches("[A-Z]{2}[0-9]{22}")) {
                System.out.println("IBAN incorrecto");
            }
        } while (!iban.matches("[A-Z]{2}[0-9]{22}"));
        System.out.println("IBAN correcto");
        do {
            System.out.println("Por favor, ingrese el Titular");
            titular = scanner.nextLine();
            if (titular == "" && titular == null) {
                System.out.println("el titular es obligatorio");
            }
        } while (titular == "" && titular == null);
        System.out.println("Titular correcto");

        CuentaBancaria cuenta;
        cuenta = new CuentaBancaria(iban, titular);
        System.out.println("Cuenta creada correctamente");

        int opcion;
        do {
            System.out.println("\n========== DAWBANK ==========");
            System.out.println("1. Datos de la cuenta");
            System.out.println("2. IBAN");
            System.out.println("3. Titular");
            System.out.println("4. Saldo");
            System.out.println("5. Ingreso");
            System.out.println("6. Retirada");
            System.out.println("7. Movimientos");
            System.out.println("8. Salir");
            System.out.println("=============================");

            System.out.println("Selecciona una opcion");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    cuenta.mostrarDatos();
                    break;
                case 2:
                    System.out.println("IBAN: " + cuenta.getIban());
                    break;

                case 3:
                    System.out.println("Titular: " + cuenta.getTitular());
                    break;

                case 4:
                    System.out.println("Saldo: " + cuenta.getSaldo() + " euros");
                    break;

                case 5:
                    System.out.print("Cantidad a ingresar: ");
                    double ingreso = scanner.nextDouble();
                    cuenta.ingresar(ingreso);
                    break;

                case 6:
                    System.out.print("Cantidad a retirar: ");
                    double retirada = scanner.nextDouble();
                    cuenta.retirar(retirada);
                    break;

                case 7:
                    cuenta.mostrarMovimientos();
                    break;

                case 8:
                    System.out.println("Gracias por utilizar DawBank.");
                    break;

                default:
                    System.out.println("ERROR: Opción no válida.");
                    break;
            }
        } while (opcion != 8);
    }
}