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
        System.out.println("Ejercicio 10:");

        scanner = new Scanner(System.in);
        int cantidadnumeros = 10;
        boolean numeronegativo = false;
        System.out.println("por favor, introduce " + cantidadnumeros + " numeros");

        for (int i = 1; i <= cantidadnumeros; i++){

            double num;

            while (true){
                System.out.println("Numero "+ i + ": ");
                num = scanner.nextDouble();

                if (num != 0){
                    break;
                }
                System.out.println("el numero no puede ser cero, intentelo de nuevo");
            }
            if (num < 0){
                numeronegativo = true;
            }
        }
        if (numeronegativo){
            System.out.println("se ha leido algun numero negativo");
        } else {
            System.out.println("no se ha leido ningun numero negativo");
        }

        /*
        Ejercicio 11: Realiza un programa que lea 10 números no nulos y luego muestre un mensaje
        indicando cuántos son positivos y cuantos negativos.
         */
        System.out.println("Ejercicio 11:");

        scanner = new Scanner(System.in);
        int positivo = 0;
        int negativo = 0;
        System.out.println("por favor, introduce " + 10 + " numeros");

        for (int i = 1; i <= 10; i++){

            int num1;

            while (true){
                System.out.println("Numero "+ i + ": ");
                num1 = scanner.nextInt();
                if (num1 != 0){
                    break;
                }
                System.out.println("el numero no puede ser cero, intentelo de nuevo");
            }
            if (num1 > 0){
                positivo++;
            } else {
                negativo++;
            }
        }
        System.out.println("Resultados:");
        System.out.println("numeros positivos: "+ positivo);
        System.out.println("numeros negativos: "+ negativo);

        /*
        Ejercicio 12: Realiza un programa que lea una secuencia de números no nulos hasta que se introduzca
        un 0, y luego muestre si ha leído algún número negativo, cuantos positivos y cuantos
        negativos.
         */
        System.out.println("Ejercicio 12:");

        scanner = new Scanner(System.in);
        int positivo1 = 0;
        int negativo1 = 0;
        System.out.println("por favor, introduce numeros");

        for (int i = 1; i != 0; i++){

            int num2;

            System.out.println("Numero "+ i + ": ");
            num2 = scanner.nextInt();

            if (num2 == 0){
                break;
            }
            if (num2 > 0){
                positivo1++;
            } else {
                negativo1++;
            }
        }
        System.out.println("Resultados:");
        System.out.println("numeros positivos: "+ positivo1);
        System.out.println("numeros negativos: "+ negativo1);

        /*
        Ejercicio 13: Realiza un programa que calcule y escriba la suma y el producto de los 10 primeros
        números naturales.
         */
        System.out.println("Ejercicio 13:");
        int num3 = 0;
        int num4 = 1;
        for (int i = 1; i <= 10; i++){
            num3 += i;
            num4 *= i;
        }
        System.out.println("Suma: "+ num3);
        System.out.println("Producto: "+ num4);

        /*
        Ejercicio 14: Escribe un programa que calcula el salario neto semanal de un trabajador en función del
        número de horas trabajadas y la tasa de impuestos de acuerdo a las siguientes hipótesis:
            • Las primeras 35 horas se pagan a tarifa normal.
            • Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
            • Las tasas de impuestos son:
            • Los primeros 500 euros son libres de impuestos.
            • Los siguientes 400 tienen un 25% de impuestos.
            • Los restantes un 45% de impuestos.
        Escribir nombre, salario bruto, tasas y salario neto.
         */
        System.out.println("Ejercicio 14:");
        scanner = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Escribe tu numero de horas: ");
        double horas = scanner.nextDouble();
        System.out.println("Escribe tu tarifa: ");
        double tarifa = scanner.nextDouble();

        double bruto = 0;
        if (horas <= 35){
            bruto = horas * tarifa;
        } else {
            double hnormal = 35;
            double hextra = horas - 35;
            bruto = (hnormal * tarifa) + (hextra * tarifa * 1.5);
        }
        double impuestos = 0;
        if (bruto <= 500){
            impuestos = 0;
        } else {
            if (bruto <= 900 ){
                impuestos = (bruto - 500) * 0.25;
            } else {
                impuestos = (400 * 0.25) + (bruto - 900) * 0.45;

            }
        }
        double neto = bruto - impuestos;

        System.out.println("Nombre: " + nombre);
        System.out.println("Salario Bruto: "+ bruto + "€");
        System.out.println("Tasas: "+ impuestos +"€");
        System.out.println("Salario Neto: "+ neto +"€");
    }
}
