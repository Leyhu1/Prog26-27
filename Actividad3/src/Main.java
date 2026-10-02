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
        int billete5 = 1;
        int billete10 = 1;
        int billete20 = 1;
        int billete50 = 1;
        int billete100 = 1;
        int billete200 = 1;
        int billete500 = 1;
        for (int i = 1; i <= euros; i++){
            billete5 /=i;
            billete10 /=i;
            billete20 /=i;
            billete50 /=i;
            billete100 /=i;
            billete200 /=i;
            billete500 /=i;
        }
        System.out.println("billetes 500: "+ billete500);
        System.out.println("billetes 200: "+ billete200);
        System.out.println("billetes 100: "+ billete100);
        System.out.println("billetes 50: "+ billete50);
        System.out.println("billetes 20: "+ billete20);
        System.out.println("billetes 10: "+ billete10);
        System.out.println("billetes 5: "+ billete5);

    }
}
