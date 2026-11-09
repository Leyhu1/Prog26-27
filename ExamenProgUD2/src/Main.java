import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         Debe de pedir la cantidad total de números a almacenar al iniciar el programa.
         Debe de generar un menú con la siguiente estructura:
            o Modificar colección:
                ▪ Insertar número.
                ▪ Borrar número de una posición específica
                ▪ Modificar número de una posición específica.
            o Estadísticas de la colección:
                ▪ Media de todos los valores no nulos.
                ▪ Suma de todos los valores.
                ▪ Máximo de la colección
                ▪ Mínimo de la colección
            o Ampliar el valor de la colección.
            o Salir.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Di la cantidad de numeros que quieres almacenar en total:");
        int almacenar = scanner.nextInt();
        int totalNumerosAlmacenados[] = new int[almacenar];
        int eleccion;
        int P;
        int V;
        int eleccionModificar;
        final int coleccionInicial = almacenar;

        System.out.println("Elige una opcion:");
            System.out.println("1. Modificar colección: ");
            System.out.println("2. Estadisticas de la coleccion: ");
            System.out.println("3. Ampliar el valor de la coleccion: ");
            System.out.println("4. Salir: ");
            eleccion = scanner.nextInt();
            do {
                if (eleccion == 1) {
                    do {
                        scanner = new Scanner(System.in);
                        System.out.println("Has elegido modificar la colección: ");
                        System.out.println("Elige una de estas opciones:");
                        System.out.println("I. Insertar numero: ");
                        System.out.println("B. Borrar numero de una posicion especifica: ");
                        System.out.println("M. Modificar numero de una posicion especifica: ");
                        System.out.println("S. Salir: ");

                        eleccionModificar = scanner.nextInt();

                        switch (eleccionModificar) {
                            case 1:
                                System.out.println("Has elegido Insertar numero: ");
                                System.out.println("elige el valor: ");
                                for (int i = 0; i < totalNumerosAlmacenados.length; i++) {
                                    System.out.println("Introduzca el numero " + (i + 1) + ":");
                                    totalNumerosAlmacenados[i] = scanner.nextInt();

                                }
                                break;
                            case 2:
                                System.out.println("Has elegido Borrar numero de una posicion especifica: ");
                                System.out.println("elige la poicion: ");
                                P = scanner.nextInt();
                                if (P < 0 || P >= totalNumerosAlmacenados.length) {
                                    System.out.println("elige una posicion que este dentro del rango");
                                } else {
                                    totalNumerosAlmacenados[P] = totalNumerosAlmacenados[P - 1];
                                }
                                break;
                            case 3:
                                System.out.println("Has elegido Modificar numero de una posicion especifica: ");
                                System.out.println("elige el valor: ");
                                V = scanner.nextInt();
                                System.out.println("elige la poicion: ");
                                P = scanner.nextInt();
                                if (P < 0 || P >= totalNumerosAlmacenados.length) {
                                    System.out.println("elige una posicion que este dentro del rango");
                                } else {
                                    totalNumerosAlmacenados[P] = V;
                                }
                                break;
                            case 4:
                                System.out.println("Salir opcion");
                                break;
                        }
                    }while (eleccionModificar != 4);
                } else if (eleccion == 2) {

                } else if (eleccion == 3) {
                    System.out.println("Has elegido Ampliar la colección: ");
                    int[] coleccionAux = new int[totalNumerosAlmacenados.length + coleccionInicial];
                    for (int i = 0; i < totalNumerosAlmacenados.length; i++) {
                        coleccionAux[i] = totalNumerosAlmacenados[i];
                    }
                    totalNumerosAlmacenados = coleccionAux;
                } else if (eleccion == 4) {

                } else {

                }
            } while (eleccion != 4);
    }
}
