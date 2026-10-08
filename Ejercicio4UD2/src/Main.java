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
        int mayor = 0;
        int menor = mayor;
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
        for (int i = 0; i < numeros2.length; i++) {
            mayor = Math.max(mayor, numeros2[i]);
            menor = Math.min(menor, numeros2[i]);
        }
        System.out.println("el numero mayor es: "+ mayor);
        System.out.println("el numero menor es: "+ menor);
    }
}