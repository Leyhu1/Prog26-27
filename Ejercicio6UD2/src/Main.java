import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();

        }
        public static void ejercicio1(){
        /*
        Ejercicio 1: Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
        y luego muestre la matriz por pantalla.
         */
            System.out.println("Ejercicio 1:");
            int xE1 = 1;
            int mE1[][] = new int[5][5];
            for (int i = 0; i < mE1.length; i++){
                for (int j = 0; j < mE1[0].length; j++){
                    mE1[i][j] = xE1++;
                    System.out.print(mE1[i][j] + " ");
                }
                System.out.println(" ");
            }

        }
        public static void ejercicio2(){
        /*
        Ejercicio 2: Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
        multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla.
         */
            System.out.println("Ejercicio 2:");
            int mE2[][] = new int[10][10];
            for (int i = 0; i < mE2.length; i++){
                for (int j = 0; j < mE2[0].length; j++){
                    mE2[i][j] = (i +1)  * (j + 1);
                    System.out.println(mE2[i][j]);
                }
                System.out.println("");
            }
        }
        public static void ejercicio3(){
        /*
        Ejercicio 3:Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
        introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
        matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
        menores que cero y cuántos son igual a cero.
         */
            System.out.println("Ejercicio 3:");
            Scanner scanner = new Scanner(System.in);
            System.out.println("escribe el tamaño N:");
            int tamañoNE3 = scanner.nextInt();
            System.out.println("escribe el tamaño M:");
            int tamañoME3 = scanner.nextInt();
            int menorE3 = 0;
            int mayorE3 = 0;
            int ceroE3 = 0;
            int mE3[][] = new int[tamañoNE3][tamañoME3];
            for (int i = 0; i < mE3.length; i++){
                for (int j = 0; j < mE3[0].length; j++){
                    System.out.println("Introduce valor de la fila: " + (i + 1) + " Columna: " + (j + 1));
                    mE3[i][j] = scanner.nextInt();
                    if (mE3[i][j] < 0){
                        menorE3++;
                    } else if (mE3[i][j] > 0){
                        mayorE3++;
                    } else {
                        ceroE3++;
                    }
                }


                }
            System.out.println("el numero de valores menores que cero son de: " + menorE3);
            System.out.println("el numero de valores mayores que cero son de: " + mayorE3);
            System.out.println("el numero de valores iguales que cero son de: " + ceroE3);

        }
        public static void ejercicio4(){
        /*
        Ejercicio 4: Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno
        1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
        programa mostrará la nota mínima, máxima y media de cada alumno.
         */
            System.out.println("Ejercicio 4:");
            Scanner scanner = new Scanner(System.in);
            double minE4 = Double.MAX_VALUE;
            double maxE4 = - Double.MAX_VALUE;
            double sumaE4 = 0;
            double mediaE4 = 0;
            int mE4[][] = new int[4][5];
            for (int i = 0; i < mE4.length; i++){
                for (int j = 0; j < mE4[0].length; j++){
                    System.out.println("Introduce Nota del Alumno: " + (i + 1) + " Asignatura " + (j + 1));
                    mE4[i][j] = scanner.nextInt();
                    sumaE4 += mE4[i][j];
                    maxE4 = Math.max(mE4[i][j], maxE4);
                    minE4 = Math.min(mE4[i][j], minE4);
                    mediaE4 = sumaE4 / mE4.length;

                }
                System.out.println("la nota de Alumno " + (i +1) + " Minima es de: " + minE4);
                System.out.println("la nota de Alumno " + (i +1) + " Maxima es de: " + maxE4);
                System.out.println("la Media de Alumno " + (i +1) + " es de: " + mediaE4);
            }


        }
        public static void ejercicio5(){
        /*
        Ejercicio 5: Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una empresa
        y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la información
        de N personas distintas (valor también introducido por teclado). Para cada persona, pedirá su
        género (0 para varón y 1 para mujer) y su sueldo. Esta información debe guardarse en una única
        matriz. Luego se mostrará por pantalla el sueldo medio de cada género.
         */
            System.out.println("Ejercicio 5:");
            Scanner scanner = new Scanner(System.in);
            System.out.println("numero de personas");
            int nPersonas = scanner.nextInt();

            int [][] matrizE5 = new int[nPersonas][2];
            double mediaH = 0.0, mediaM = 0.0;
            int contadorH = 0, contadorM = 0;

            for (int i = 0; i < matrizE5.length; i++){
                    System.out.println("ingrese el genero de la persona (0 varon, 1 mujer)");
                    matrizE5[i][0] = scanner.nextInt();
                    System.out.println("ingrese el valñor del salario");
                    matrizE5[i][1] = scanner.nextInt();

                if (matrizE5[i][0] == 0.0)
            }

        }
}