import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        /*
        Ejercicio 1: . Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “Eres
        mayor de edad” solo si lo somos.
         */
        System.out.println("Ejercicio 1:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduzca su edad:");
        int edad = scanner.nextInt();
        if (edad >= 18){
            System.out.println("eres mayor de edad");
        }
        /*
        Ejercicio 2: Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “eres
        mayor de edad” o el mensaje de “eres menor de edad”
         */
        System.out.println("Ejercicio 2:");

        scanner = new Scanner(System.in);

        System.out.println("introduzca su edad:");
        int edad1 = scanner.nextInt();

        if (edad1 >= 18){
            System.out.println("eres mayor de edad");
        }
        else {
            System.out.println("no eres mayor de edad");
        }
        /*
        Ejercicio 3: Realiza un programa que muestre por pantalla los 20 primeros números naturales (1, 2,
        3... 20).
         */
        System.out.println("Ejercicio 3:");

        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
        /*
        Ejercicio 4: Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200.
        Para ello utiliza un contador y suma de 2 en 2.
         */
        System.out.println("Ejercicio 4:");

        for (int i = 1; i <= 100; i++) {
            System.out.println( i + i);
        }
        /*
        Ejercicio 5: Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200.
        Esta vez utiliza un contador sumando de 1 en 1.
         */
        System.out.println("Ejercicio 5:");

        for (int i = 1; i <= 200; i++) {
            System.out.println(i);
        }
        /*
        Ejercicio 6: Realiza un programa que muestre los números desde el 1 hasta un número N que se
        introducirá por teclado.
         */
        System.out.println("Ejercicio 6:");
        scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
        /*
        Ejercicio 7: Escribe un programa que lea una calificación numérica entre 0 y 10 y la transforma en
        calificación alfabética, escribiendo el resultado.
            • de 0 a <3 Muy Deficiente.
            • de 3 a <5 Insuficiente.
            • de 5 a <6 Bien.
            • de 6 a <9 Notable
            • de 9 a 10 Sobresaliente
         */
        System.out.println("Ejercicio 7:");
        scanner = new Scanner(System.in);

        int calificacion = scanner.nextInt();

        switch (calificacion){
            case 0, 1, 2:
                System.out.println("Muy deficiente");
                break;
            case 3, 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("bien");
                break;
            case 6, 7, 8:
                System.out.println("Notable");
                break;
            case 9, 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("di un numero del 0 al 10");
        }
        /*
        Ejercicio 8: Realiza un programa que lea un número positivo N y calcule y visualice su factorial N!
        Siendo el factorial:
            • 0! = 1
            • 1! = 1
            • 2! = 2 * 1
            • 3! = 3 * 2* 1
            • N! = N * (N-1) * (N-2)........* 3*2*1

         */
        System.out.println("Ejercicio 8:");

        scanner = new Scanner(System.in);

        System.out.println("introduzca el numero");
        int n = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("el factorial de "+ n + " es: "+ factorial);
        /*
        Ejercicio 9: Escribe un programa que recibe como datos de entrada una hora expresada en horas,
        minutos y segundos que nos calcula y escribe la hora, minutos y segundos que serán,
        transcurrido un segundo.
         */
        System.out.println("Ejercicio 9:");

        scanner = new Scanner(System.in);

        System.out.println("introduzca la hora: ");
        int hora = scanner.nextInt();
        System.out.println("introduzca los minutos: ");
        int minutos = scanner.nextInt();
        System.out.println("introduzca los segundos: ");
        int seg = scanner.nextInt();

        seg++;
        if (seg == 60) {
            seg = 0;
            minutos++;
            if (minutos == 60){
                minutos = 0;
                hora++;
                if (hora == 24){
                    hora = 0;
                }
            }
        }
        System.out.println("la hora actual es: "+ hora + "." + minutos + "." + seg);
        /*
        Ejercicio 10: Realiza un programa que lea 10 números no nulos y luego muestre un mensaje de si ha
        leído algún número negativo o no
         */

    }
}
