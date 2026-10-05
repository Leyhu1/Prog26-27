import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        /*
        Ejercicio 1: Realiza un programa que dada una cantidad de euros que el usuario introduce por
        teclado (múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para
        alcanzar dicha cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que
        indicar el mínimo de billetes posible. Por ejemplo, si el usuario introduce 145 el
        programa indicará que será necesario 1 billete de 100 €, 2 billetes de 20 € y 1 billete de
        5 € (no será válido por ejemplo 29 billetes de 5, que aunque sume 145 € no es el mínimo
        número de billetes posible).
         */
        System.out.println("Ejercicio 1:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad de Euros (Billetes)");
        int euros = scanner.nextInt();
        int billete5 = 0;
        int billete10 = 0;
        int billete20 = 0;
        int billete50 = 0;
        int billete100 = 0;
        int billete200 = 0;
        int billete500 = 0;
        while (euros > 0) {
            if (euros >= 500) {
                euros = euros - 500;
                billete500++;
            } else if (euros >= 200) {
                euros = euros - 200;
                billete200++;
            } else if (euros >= 100) {
                euros = euros - 100;
                billete100++;
            } else if (euros >= 50) {
                euros = euros - 50;
                billete50++;
            } else if (euros >= 20) {
                euros = euros - 20;
                billete20++;
            } else if (euros >= 10) {
                euros = euros - 10;
                billete10++;
            } else if (euros >= 5) {
                euros = euros - 5;
                billete5++;
            } else {
                System.out.println("te faltan monedas, es recomendable usar billetes, intentelo de nuevo");
                break;
            }
        }
        System.out.println("billetes 500: "+ billete500);
        System.out.println("billetes 200: "+ billete200);
        System.out.println("billetes 100: "+ billete100);
        System.out.println("billetes 50: "+ billete50);
        System.out.println("billetes 20: "+ billete20);
        System.out.println("billetes 10: "+ billete10);
        System.out.println("billetes 5: "+ billete5);

        /*
        Ejercicio 2: Realiza un programa que muestre un menú de opciones como el siguiente:
            1. Sumar
            2. Restar
            3. Multiplicar
            4. Dividir (incluir manejo de división por 0)
            5. Salir
        El menú debe de repetirse hasta que se escoja la opción 5 (Salir).
         */
        System.out.println("Ejercicio 2: ");
        scanner = new Scanner(System.in);
        System.out.println("Escoje una opcion:");
        int eleccion = scanner.nextInt();

            switch (eleccion) {
                case 1:
                    System.out.println("Suma");
                    break;
                case 2:
                    System.out.println("Resta");
                    break;
                case 3:
                    System.out.println("Multipicacion");
                    break;
                case 4:
                    System.out.println("Division");
                    break;
                case 5:
                    System.out.println("Salir");
                    break;
            }
    }
}
