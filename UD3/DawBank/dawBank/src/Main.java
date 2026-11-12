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
        } while (!iban.matches("[A-Z]{2}[0-9]{22}")); //Si no se cumple la condicion, se repetira hasta cumplirla
        System.out.println("IBAN correcto");
        do {
            System.out.println("Por favor, ingrese el Titular");
            titular = scanner.nextLine();
            if (titular == "" && titular == null) {
                System.out.println("el titular es obligatorio");
            }
        } while (titular == "" && titular == null); //Si no se cumple la condicion, se repetira hasta cumplirla
        System.out.println("Titular correcto");

        CuentaBancaria cuenta; //Declara una variable que podra almacenar un objeto de la clase CuentaBancaria
        cuenta = new CuentaBancaria(iban, titular); //Creamos el objeto y lo asignamos a la variable

        System.out.println("Cuenta creada correctamente");

        String opcion;
        do {
            scanner = new Scanner(System.in);

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
            opcion = scanner.nextLine();

            switch (opcion){
                case "1":
                    cuenta.mostrarDatos();
                    break;
                case "2":
                    System.out.println("IBAN: " + cuenta.getIban());
                    break;

                case "3":
                    System.out.println("Titular: " + cuenta.getTitular());
                    break;

                case "4":
                    System.out.println("Saldo: " + cuenta.getSaldo() + " €");
                    break;

                case "5":
                    System.out.print("Cantidad a ingresar: ");
                    if (scanner.hasNextDouble()) { //hace la operacion de ingresar si se ha introducido un numero decimal
                        double ingreso = scanner.nextDouble();
                        cuenta.ingresar(ingreso);
                    }
                    else{
                        System.out.println("Error, no se ha introducido ningun numero, intentelo de nuevo"); //si no se ha introducido un numero decimal, te salta una advertencia en vez de cerrarte el programa de repente
                    }

                    break;
                case "6":
                    System.out.print("Cantidad a retirar: ");
                    if (scanner.hasNextDouble()) {
                        double retirada = scanner.nextDouble();
                        cuenta.retirar(retirada);
                    }
                    else {
                        System.out.println("Error, no se ha introducido ningun numero, intentelo de nuevo");
                    }

                    break;

                case "7":
                    cuenta.mostrarMovimientos();
                    break;

                case "8":
                    System.out.println("Gracias por utilizar DawBank.");
                    break;

                default:
                    System.out.println("ERROR: Opción no válida.");
                    break;
            }
        } while (!opcion.equals("8"));
    }
}