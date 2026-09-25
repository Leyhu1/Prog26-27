import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        /*
        Ejercicio 1: Escribe un programa que dé los “buenos días”
         */
        System.out.println("Ejercicio 1:");
        System.out.println("Buenos dias");
        /*
        Ejercicio 2: Escribe un programa que calcule y muestre el área de un cuadrado de lado igual a 5
         */
        System.out.println("Ejercicio 2: ");
        int lado = 5;
        int area = lado * lado;
        System.out.println("el area es: " + area);
        /*
        Ejercicio 3: Escribe un programa que calcule el área de un cuadrado cuyo lado se introduce por
        teclado.
         */
        System.out.println("Ejercicio 3:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("escribe el lado:");
        int lado2 = scanner.nextInt();
        int area2 = lado2 * lado2;
        System.out.println("el area es: " + area2);
        /*
        Ejercicio 4: Escribe un programa que lea dos números, calcule y muestre el valor de sus suma, resta,
        producto y división
         */
        System.out.println("Ejercicio 4:");
        scanner = new Scanner(System.in);
        System.out.println("ingrese el primer numero: ");
        double a = scanner.nextDouble();
        System.out.println("ingrese el segundo numero: ");
        double b = scanner.nextDouble();

        double suma = a + b;
        double resta = a - b;
        double producto = a * b;
        double division = a / b;

        System.out.println("la suma es: "+ suma);
        System.out.println("la resta es: "+ resta);
        System.out.println("el producto es: "+ producto);
        System.out.println("la division es: "+ division);
        /*
        Ejercicio 5: Escribe un programa que toma como dato de entrada un número que corresponde a la
        longitud de un radio y nos escribe la longitud de la circunferencia, el área del círculo y el
        volumen de la esfera que corresponden con dicho radio
         */
        System.out.println("Ejercicio 5:");
        scanner = new Scanner(System.in);
        System.out.println("escribe el radio:");
        double r = scanner.nextDouble();
        System.out.println("la longitud de la circunferencia es: " + 2 * Math.PI * r);
        System.out.println("la longitud de la circunferencia es: " + Math.PI * r * r);
        System.out.println("el volumen de la esfera es: " + 4/3.0 * Math.PI * Math.pow(r, 3));
        /*
        Ejercicio 6: Escribe un programa que dado el precio de un artículo y el precio de venta real nos
        muestre el porcentaje de descuento realizado.
         */
        System.out.println("Ejercicio 6:");

        scanner = new Scanner(System.in);
        System.out.println("escribe el precio del producto:");
        double p = scanner.nextDouble();
        System.out.println("escribe el precio de venta real:");
        double v = scanner.nextDouble();

        System.out.println("el porcentaje del descuento es: " + (p / v - 1) * 100 );
        /*
        Ejercicio 7: Escribe un programa que lea un valor correspondiente a una distancia en millas marinas
        y escriba la distancia en metros. Sabiendo que una milla marina equivale a 1.852 metros
         */
        System.out.println("Ejercicio 7:");

        scanner = new Scanner(System.in);
        System.out.println("escribe la distancia en millas:");
        double millas = scanner.nextDouble();

        System.out.println("el la distancia en metros es: " + millas * 1852 );
        /*
        Ejercicio 8: Escribe un programa que lee dos números y los visualiza en orden ascendente.
         */

    }
}
