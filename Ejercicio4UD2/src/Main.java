import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        /*
        Ejercicio 1: Crea un programa que pida diez números reales por teclado, los almacene en un array,
        y luego muestre todos sus valores.
         */
        System.out.println("Ejercicio 1");
        Scanner scanner = new Scanner(System.in);
        double numeros[] = new double[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzca el numero " +(i+1) + ":");
            numeros[i] = scanner.nextDouble();
            System.out.println(numeros[i]);
        }
        /*
        Ejercicio 2: Crea un programa que pida diez números reales por teclado, los almacene en un array,
        y luego muestre la suma de todos los valores.
         */
        System.out.println("Ejercicio 2");
        scanner = new Scanner(System.in);
        double suma = 0;
        double numeros1[] = new double[10];
        for (int i = 0; i < numeros1.length; i++) {
            System.out.println("Introduzca el numero " +(i+1) + ":");
            numeros1[i] = scanner.nextDouble();
            suma += numeros1[i];
        }
        System.out.println("la suma de los valores es de: "+ suma);
        /*
        Ejercicio 3: Crea un programa que pida diez números reales por teclado, los almacene en un array,
        y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
         */
        System.out.println("Ejercicio 3");
        scanner = new Scanner(System.in);
        double numeros2[] = new double[10];
        double mayor = - Double.MAX_VALUE;
        double menor = Double.MAX_VALUE;
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println("Introduzca el numero " +(i+1) + ":");
            numeros2[i] = scanner.nextDouble();
            mayor =Math.max(numeros2[i], mayor);
            menor =Math.min(numeros2[i], menor);
        }

        System.out.println("el numero mayor es: "+ mayor);
        System.out.println("el numero menor es: "+ menor);

        /*
        Ejercicio 4: Crea un programa que pida veinte números enteros por teclado, los almacene en un
        array y luego muestre por separado la suma de todos los valores positivos y negativos.
         */
        System.out.println("Ejercicio 4");
        scanner = new Scanner(System.in);

        int numeros3[] = new int[20];
        int sumapositivo = 0;
        int sumanegativo = 0;

        for (int i = 0; i < numeros3.length; i++) {
            System.out.println("Introduzca el numero " +(i+1) + ":");
            numeros3[i] = scanner.nextInt();
            if (numeros3[i] > 0){
                sumapositivo += numeros3[i];
            } else if (numeros3[i] < 0){
                sumanegativo += numeros3[i];
            }
        }
        System.out.println("la suma de los valores positivos es de: "+ sumapositivo);
        System.out.println("la suma de los valores negativos es de: "+ sumanegativo);

        /*
        Ejercicio 5: Crea un programa que pida veinte números reales por teclado, los almacene en un array
        y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.
         */
        System.out.println("Ejercicio 5");
        scanner = new Scanner(System.in);

        double numeros4[] = new double[20];
        double suma1 = 0;
        for (int i = 0; i < numeros4.length; i++) {
            System.out.println("Introduzca el numero " +(i+1) + ":");
            numeros4[i] = scanner.nextDouble();
            suma1 += numeros4[i];
        }
        double media = suma1 / numeros4.length;
        System.out.println("la media es de: "+ media);
        /*
        Ejercicio 6: Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño
        N, escriba M en todas sus posiciones y lo muestre por pantalla
         */
        System.out.println("Ejercicio 6:");
        scanner = new Scanner(System.in);
        System.out.println("Introduce el valor N: ");
        int n = scanner.nextInt();
        System.out.println("Introduce el valor M: ");
        int m = scanner.nextInt();

        int vector[] = new int[n];
        for (int i = 0; i < vector.length; i++){
            vector[i] = m;
        }
        System.out.println("Array: ");
        for (int i = 0; i < vector.length; i++){
            System.out.println(vector[i] + " ");
        }
        /*
        Ejercicio 7: Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga
        todos los valores desde P hasta Q, y lo muestre por pantalla.
         */
        System.out.println("Ejercicio 7:");
        scanner = new Scanner(System.in);
        System.out.println("Introduce el valor P: ");
        int p = scanner.nextInt();
        System.out.println("Introduce el valor Q: ");
        int q = scanner.nextInt();

        int vector1[] = new int[Math.abs(p - q) + 1];
        for (int i = 0; i < vector1.length; i++){
            vector1[i] = p + i;
        }
        System.out.println("Array: ");
        for (int i = 0; i < vector1.length; i++){
            System.out.println(vector1[i] + " ");
        }
        /*
        Ejercicio 8: Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
        utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
        cuántos valores del array son igual o superiores a R.
         */
        System.out.println("Ejercicio 8:");
        scanner = new Scanner(System.in);

        double array[] = new double[100];

        for (int i = 0; i < array.length; i++){
            array[i] = Math.random();
        }
        System.out.println("introduzca su valor real del 0.0 al 1.0: ");
        double r = scanner.nextDouble();
        int cuantos = 0;
        for (int i = 0; i < array.length; i++){

            if (array[i] >= r){
                cuantos++;
            }
        }
        System.out.println("Cantidad de numeros mayores o iguales: " + cuantos);

        /*
        Ejercicio 9:  Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
        enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N
        y mostrará en qué posiciones del array aparece N.
         */
        System.out.println("Ejercicio 9:");
        scanner = new Scanner(System.in);

        int array1[] = new int[100];

        for (int i = 0; i < array1.length; i++){
            array1[i] = (int) (1 + Math.random() * 10);
        }
        System.out.println("introduzca su valor N del 1 al 10: ");
        int n1 = scanner.nextInt();
        System.out.println("Posiciones en donde aparece N: ");
        for (int i = 0; i < array1.length; i++){

            if (array1[i] == n1){
                System.out.println(" " + i);
            }
        }
        System.out.println();

        /*
        Ejercicio 10: Crea un programa para realizar cálculos relacionados con la altura (en metros) de
        personas. Pedirá un valor N y luego almacenará en un array N alturas introducidas por
        teclado. Luego mostrará la altura media, máxima y mínima, así como cuántas personas
        miden por encima y por debajo de la media.
         */
        System.out.println("Ejercicio 10:");
        scanner = new Scanner(System.in);

        System.out.println("cuantas alturas vas a introducir");
        int n2 = scanner.nextInt();
        double alturas[] = new double[n2];

        for (int i = 0; i < alturas.length; i++){
            System.out.println("Altura " + i);
            alturas[i] = scanner.nextDouble();
        }

        double suma2 = 0;
        double media1;
        double max = alturas[0];
        double min = alturas[0];
        for (int i = 0; i < alturas.length; i++){

            suma2 += alturas[i];
            if (alturas[i] > max){
                max = alturas[i];
            }
            if (alturas[i] < min){
                min = alturas[i];
            }
        }
        media1 = suma2 / n2;

        int encima = 0;
        int debajo = 0;
        for (int i = 0; i < alturas.length; i++){

            if (alturas[i] > media1){
                encima++;
            }
            if (alturas[i] < media1){
                debajo++;
            }
        }
        System.out.println("Altura Media: " + media1 + "m");
        System.out.println("Altura Maxima: " + max + "m");
        System.out.println("Altura Minima: " + min + "m");
        System.out.println("Personas que miden por encima de la Media: " + encima);
        System.out.println("Personas que miden por debajo de la Media: " + debajo);

        /*
        Ejercicio 11: Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en
        el primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores
        del primer array al segundo array en orden inverso, y mostrar ambos por pantalla.
         */
        System.out.println("Ejercicio 11:");

        int length = 100;
        int primerarray[] = new int[length];
        int segundoarray[] = new int [length];

        System.out.println("Primer array:");
        for (int i = 0; i < length; i++){
            primerarray[i] = i + 1;
            System.out.println(primerarray[i]);
        }
        System.out.println("Segundo array:");
        for (int i = 0; i < length; i++){
            segundoarray[i] = primerarray[length - i - 1];
            System.out.println(segundoarray[i]);
        }
        /*
        Ejercicio 12: Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú
        con distintas opciones:
            a. Mostrar valores.
            b. Introducir valor.
            c. Salir.
        La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una
        posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente hasta
        que el usuario elija la opción ‘c’ que terminará el programa.
         */
        System.out.println("Ejercicio 12: ");
        scanner = new Scanner(System.in);

        int array2[] = new int[10];
        String eleccion;

        do {
            System.out.println("Escoje una opcion:");
            System.out.println("a. Mostrar:");
            System.out.println("b. Introducir Valor:");
            System.out.println("c. Salir:");

            eleccion = scanner.nextLine();

            switch (eleccion){
                case "a":
                    for (int i = 0; i < array2.length; i++){
                        System.out.println(array2[i]);
                    }
                    break;
                case "b":
                    System.out.println("elige la poicion: ");
                    int P = scanner.nextInt();
                    System.out.println("elige el valor: ");
                    int V = scanner.nextInt();
                    if (P < 0 || P >= array2.length){
                        System.out.println("elige una posicion que este dentro del rango");
                    } else {
                        array2[P] = V;
                    }
                    break;
                case "c":
                    System.out.println("El programa se cerrara");
                    break;
                default:
                    System.out.println("Eliga un numero porfavor");
                    break;
            }
        } while (!eleccion.equals("c"));
        /*
        Ejercicio 13: Crea un programa que permita al usuario almacenar una secuencia aritmética en un
        array y luego mostrarla. Una secuencia aritmética es una serie de números que
        comienza por un valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1
        e I=2, la secuencia sería 1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El
        programa solicitará al usuario V, I además de N (nº de valores a crear).
         */
        System.out.println("Ejercicio 13:");
        scanner = new Scanner(System.in);
        System.out.println("Introduce el valor V: ");
        int V1 = scanner.nextInt();
        System.out.println("Introduce el valor I: ");
        int I = scanner.nextInt();
        System.out.println("Introduce el valor N: ");
        int N = scanner.nextInt();

        int vectorE13[] = new int[N];
        vectorE13[0] = V1;
        for (int i = 1; i < vectorE13.length; i++){
            vectorE13[i] = vectorE13[i - 1] + I; //el -1 coge la posicion anterior
        }
        System.out.println("Array: ");
        for (int i = 0; i < vectorE13.length; i++){
            System.out.println(vectorE13[i] + " ");
        }
        /*
        Ejercicio 14: Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
        valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
        muestre por pantalla.
         */
        System.out.println("Ejercicio 14:");

        int numE14 = 10;
        int tamanoarray = numE14 * (numE14 + 1) / 2;
        int vectorE14[] = new int [tamanoarray];
        int indiceactual = 0;

        for (int numero = 1; numero <= numE14; numero++){

            for (int i = 0; i < numero; i++){
                vectorE14[indiceactual] = numero;
                indiceactual++;
            }
        }
        System.out.println(Arrays.toString(vectorE14));
    }
}