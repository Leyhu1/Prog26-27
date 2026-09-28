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

        System.out.println("el porcentaje del descuento es: " + ((p - v ) / v) * 100);
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
        System.out.println("Ejercicio 8:");

        scanner = new Scanner(System.in);
        System.out.println("escribe el primer numero:");
        double num1 = scanner.nextDouble();
        System.out.println("escribe el segundo numero:");
        double num2 = scanner.nextDouble();

        double menor = Math.min(num1, num2);
        double mayor = Math.max(num1, num2);

        System.out.println("numeros en orden ascendente: " + menor + ", " + mayor );
        /*
        Ejercicio 9: Escribe un programa que lee dos números y nos dice cuál es el mayor o si son iguales
         */
        System.out.println("Ejercicio 9:");

        scanner = new Scanner(System.in);
        System.out.println("escribe el primer numero:");
        int n1 = scanner.nextInt();
        System.out.println("escribe el segundo numero:");
        int n2 = scanner.nextInt();

        int menor1 = Math.min(n1, n2);
        int mayor1 = Math.max(n1, n2);

        System.out.println("el mayor es: " + mayor1 + " es igual: " + (mayor1 == menor1) );
        /*
        Ejercicio 10: escribe un programa que lea tres números distintos y nos diga cuál es el mayor
         */
        System.out.println("Ejercicio 10:");

        scanner = new Scanner(System.in);
        System.out.println("escribe el primer numero:");
        int nu1 = scanner.nextInt();
        System.out.println("escribe el segundo numero:");
        int nu2 = scanner.nextInt();
        System.out.println("escribe el tercer numero:");
        int nu3 = scanner.nextInt();

        int max1 = Math.max(nu1, nu2);
        int max2 = Math.max(max1, nu3);

        System.out.println("el mayor es: " + max2 );
        /*
        Ejercicio 11: Escribe un programa que lee dos números, calcula y muestra el valor de su suma, resta,
        producto y división. (Ten en cuenta la división por cero).
         */
        System.out.println("Ejercicio 11:");
        scanner = new Scanner(System.in);
        System.out.println("ingrese el primer numero: ");
        double c = scanner.nextDouble();
        System.out.println("ingrese el segundo numero: ");
        double d = scanner.nextDouble();

        double suma1 = c + d;
        double resta1 = c - d;
        double producto1 = c * d;
        double division1 = c / d;

        System.out.println("la suma es: "+ suma1);
        System.out.println("la resta es: "+ resta1);
        System.out.println("el producto es: "+ producto1);
        System.out.println("la division es: "+ division1);
        /*
        Ejercicio 12: Escribe un programa que lee 2 números y muestra el mayor
         */
        System.out.println("Ejercicio 12:");

        scanner = new Scanner(System.in);
        System.out.println("escribe el primer numero:");
        int num6 = scanner.nextInt();
        System.out.println("escribe el segundo numero:");
        int num7 = scanner.nextInt();

        int mayor3 = Math.max(num6, num7);

        System.out.println("el mayor es: " + mayor3);
        /*
        Ejercicio 13: Escribe un programa que lee un número y me dice si es positivo o negativo
        consideraremos el cero como positivo.
         */
        System.out.println("Ejercicio 13:");

        scanner = new Scanner(System.in);
        System.out.println("escribe el numero:");
        double num8 = scanner.nextDouble();

        System.out.println("es positivo?: " + (num8 >= 0));
    }
}
