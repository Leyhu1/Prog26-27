import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a DawBank");
        System.out.println("Primero debes crear una cuenta bancaria");
        System.out.println("Por favor, ingrese el IBAN");
        String iban = scanner.nextLine();
        if (!iban.matches("[A-Z]{2}[0-9]{22}")) {
            System.out.println("IBAN incorrecto");
        }
        System.out.println("Por favor, ingrese el Titular");
        String titular = scanner.nextLine();
        if (titular == null) {
            System.out.println("el titular es obligatorio");
        }
        CuentaBancaria cuenta;
    }
}