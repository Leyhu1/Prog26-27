import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        /*
        Ejercicio 1: Crea un programa que pida diez números reales por teclado, los almacene en un array,
        y luego muestre todos sus valores.
         */
        System.out.println("Ejercicio 1");
        Scanner scanner = new Scanner(System.in);
        int numeros[] = new int[10];
        System.out.println("Escribe el primer numero");
        numeros[0] = scanner.nextInt();
        System.out.println("Escribe el segundo numero");
        numeros[1] = scanner.nextInt();
        System.out.println("Escribe el tercer numero");
        numeros[2] = scanner.nextInt();
        System.out.println("Escribe el cuarto numero");
        numeros[3] = scanner.nextInt();
        System.out.println("Escribe el quinto numero");
        numeros[4] = scanner.nextInt();
        System.out.println("Escribe el sexto numero");
        numeros[5] = scanner.nextInt();
        System.out.println("Escribe el septimo numero");
        numeros[6] = scanner.nextInt();
        System.out.println("Escribe el octavo numero");
        numeros[7] = scanner.nextInt();
        System.out.println("Escribe el noveno numero");
        numeros[8] = scanner.nextInt();
        System.out.println("Escribe el decimo numero");
        numeros[9] = scanner.nextInt();
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numero "+ i +" : " + numeros[i]);
        }
        /*
        Ejercicio 2: Crea un programa que pida diez números reales por teclado, los almacene en un array,
        y luego muestre la suma de todos los valores.
         */
        System.out.println("Ejercicio 2");
        scanner = new Scanner(System.in);
        int suma = 0;
        int numeros1[] = new int[10];
        System.out.println("Escribe el primer numero");
        numeros1[0] = scanner.nextInt();
        System.out.println("Escribe el segundo numero");
        numeros1[1] = scanner.nextInt();
        System.out.println("Escribe el tercer numero");
        numeros1[2] = scanner.nextInt();
        System.out.println("Escribe el cuarto numero");
        numeros1[3] = scanner.nextInt();
        System.out.println("Escribe el quinto numero");
        numeros1[4] = scanner.nextInt();
        System.out.println("Escribe el sexto numero");
        numeros1[5] = scanner.nextInt();
        System.out.println("Escribe el septimo numero");
        numeros1[6] = scanner.nextInt();
        System.out.println("Escribe el octavo numero");
        numeros1[7] = scanner.nextInt();
        System.out.println("Escribe el noveno numero");
        numeros1[8] = scanner.nextInt();
        System.out.println("Escribe el decimo numero");
        numeros1[9] = scanner.nextInt();
        for (int i = 0; i < numeros1.length; i++) {
            suma += numeros1[i];
        }
        System.out.println("la suma de los valores es de: "+ suma);
        /*
        Ejercicio 3: Crea un programa que pida diez números reales por teclado, los almacene en un array,
        y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
         */
        System.out.println("Ejercicio 3");
        scanner = new Scanner(System.in);
        int numeros2[] = new int[10];

        System.out.println("Escribe el primer numero");
        numeros2[0] = scanner.nextInt();
        System.out.println("Escribe el segundo numero");
        numeros2[1] = scanner.nextInt();
        System.out.println("Escribe el tercer numero");
        numeros2[2] = scanner.nextInt();
        System.out.println("Escribe el cuarto numero");
        numeros2[3] = scanner.nextInt();
        System.out.println("Escribe el quinto numero");
        numeros2[4] = scanner.nextInt();
        System.out.println("Escribe el sexto numero");
        numeros2[5] = scanner.nextInt();
        System.out.println("Escribe el septimo numero");
        numeros2[6] = scanner.nextInt();
        System.out.println("Escribe el octavo numero");
        numeros2[7] = scanner.nextInt();
        System.out.println("Escribe el noveno numero");
        numeros2[8] = scanner.nextInt();
        System.out.println("Escribe el decimo numero");
        numeros2[9] = scanner.nextInt();

        int mayor = numeros2[0];
        int menor = numeros2[0];

        for (int i = 1; i < numeros2.length; i++) {
           if(numeros2[i] > mayor){
               mayor = numeros2[i];
           } else if(numeros2[i] < menor){
                menor = numeros2[i];
            }

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
        System.out.println("Escribe el primer numero");
        numeros3[0] = scanner.nextInt();
        System.out.println("Escribe el segundo numero");
        numeros3[1] = scanner.nextInt();
        System.out.println("Escribe el tercer numero");
        numeros3[2] = scanner.nextInt();
        System.out.println("Escribe el cuarto numero");
        numeros3[3] = scanner.nextInt();
        System.out.println("Escribe el quinto numero");
        numeros3[4] = scanner.nextInt();
        System.out.println("Escribe el sexto numero");
        numeros3[5] = scanner.nextInt();
        System.out.println("Escribe el septimo numero");
        numeros3[6] = scanner.nextInt();
        System.out.println("Escribe el octavo numero");
        numeros3[7] = scanner.nextInt();
        System.out.println("Escribe el noveno numero");
        numeros3[8] = scanner.nextInt();
        System.out.println("Escribe el decimo numero");
        numeros3[9] = scanner.nextInt();

        System.out.println("Escribe el 11 numero");
        numeros3[10] = scanner.nextInt();
        System.out.println("Escribe el 12 numero");
        numeros3[11] = scanner.nextInt();
        System.out.println("Escribe el 13 numero");
        numeros3[12] = scanner.nextInt();
        System.out.println("Escribe el 14 numero");
        numeros3[13] = scanner.nextInt();
        System.out.println("Escribe el 15 numero");
        numeros3[14] = scanner.nextInt();
        System.out.println("Escribe el 16 numero");
        numeros3[15] = scanner.nextInt();
        System.out.println("Escribe el 17 numero");
        numeros3[16] = scanner.nextInt();
        System.out.println("Escribe el 18 numero");
        numeros3[17] = scanner.nextInt();
        System.out.println("Escribe el 19 numero");
        numeros3[18] = scanner.nextInt();
        System.out.println("Escribe el 20 numero");
        numeros3[19] = scanner.nextInt();

        int sumapositivo = 0;
        int sumanegativo = 0;

        for (int i = 0; i < numeros3.length; i++) {
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

        int numeros4[] = new int[20];
        System.out.println("Escribe el primer numero");
        numeros4[0] = scanner.nextInt();
        System.out.println("Escribe el segundo numero");
        numeros4[1] = scanner.nextInt();
        System.out.println("Escribe el tercer numero");
        numeros4[2] = scanner.nextInt();
        System.out.println("Escribe el cuarto numero");
        numeros4[3] = scanner.nextInt();
        System.out.println("Escribe el quinto numero");
        numeros4[4] = scanner.nextInt();
        System.out.println("Escribe el sexto numero");
        numeros4[5] = scanner.nextInt();
        System.out.println("Escribe el septimo numero");
        numeros4[6] = scanner.nextInt();
        System.out.println("Escribe el octavo numero");
        numeros4[7] = scanner.nextInt();
        System.out.println("Escribe el noveno numero");
        numeros4[8] = scanner.nextInt();
        System.out.println("Escribe el decimo numero");
        numeros4[9] = scanner.nextInt();

        System.out.println("Escribe el 11 numero");
        numeros4[10] = scanner.nextInt();
        System.out.println("Escribe el 12 numero");
        numeros4[11] = scanner.nextInt();
        System.out.println("Escribe el 13 numero");
        numeros4[12] = scanner.nextInt();
        System.out.println("Escribe el 14 numero");
        numeros4[13] = scanner.nextInt();
        System.out.println("Escribe el 15 numero");
        numeros4[14] = scanner.nextInt();
        System.out.println("Escribe el 16 numero");
        numeros4[15] = scanner.nextInt();
        System.out.println("Escribe el 17 numero");
        numeros4[16] = scanner.nextInt();
        System.out.println("Escribe el 18 numero");
        numeros4[17] = scanner.nextInt();
        System.out.println("Escribe el 19 numero");
        numeros4[18] = scanner.nextInt();
        System.out.println("Escribe el 20 numero");
        numeros4[19] = scanner.nextInt();

        int suma1 = 0;
        for (int i = 0; i < numeros4.length; i++) {
            suma1 += numeros4[i];
        }
        int media = suma1 / numeros4.length;
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
    }
}