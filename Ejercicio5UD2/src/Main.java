import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        /*
        Ejercicio 1: Crea un programa que pida una cadena de texto por teclado y luego muestre cada
        palabra de la cadena en una línea distinta.
         */
        System.out.println("Ejercicio 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca tu frase");
        String textoE1 = scanner.nextLine();

        for (String s : textoE1.split(" ")){ //el split corta el caracter que indiques
            System.out.println(s);
        }
        /*
        Ejercicio 2: Crea un programa que pida dos cadenas de texto por teclado y luego indique si son
        iguales, además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
         */
        System.out.println("Ejercicio 2");
        scanner = new Scanner(System.in);
        System.out.println("Introduzca primer cadena");
        String texto1E2 = scanner.nextLine();
        System.out.println("Introduzca segunda cadena");
        String texto2E2 = scanner.nextLine();

        if (texto1E2.equals(texto2E2)){
            System.out.println("las frases son iguales");
        } else if (texto1E2.equalsIgnoreCase(texto2E2)){
            System.out.println("las frases son iguales ignorando mayusculas y minusculas");

        } else {
            System.out.println("las frases son distintas");
        }
        /*
        Ejercicio 3: Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos.
        Luego mostrará un código de usuario (en mayúsculas) formado por la concatenación de
        las tres primeras letras de cada uno de ellos. Por ejemplo, si se introduce “Lionel”,
        “Tarazón” y “Alcocer” mostrará “LIOTARALC”.
         */
        System.out.println("Ejercicio 3");
        scanner = new Scanner(System.in);
        System.out.println("Introduzca nombre");
        String nombreE3 = scanner.nextLine();
        System.out.println("Introduzca apellido 1");
        String apellido1E3 = scanner.nextLine();
        System.out.println("Introduzca apellido 2");
        String apellido2E3 = scanner.nextLine();

        String codigo = nombreE3.substring(0,3) + apellido1E3.substring(0,3) + apellido2E3.substring(0,3).toUpperCase(); //el toUpperCase hace convertir el texto en Mayuscula
        System.out.println(codigo);
        /*
        Ejercicio 4: Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas
        ‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre
        mayúsculas y minúsculas. Por ejemplo, dada la frase “Mi mama me mima” dirá que hay:
            Nº de A's: 3
            Nº de E's: 1
            Nº de I's: 2
            Nº de O's: 0
            Nº de U's: 0
         */
        System.out.println("Ejercicio 4");
        scanner = new Scanner(System.in);
        System.out.println("Introduzca la frase");
        String textoE4 = scanner.nextLine();
        int aes = 0, ees = 0, ies = 0, oes = 0, ues = 0;

        for (char c : textoE4.toLowerCase().toCharArray()){
            switch (c){
                case 'a' -> aes++;
                case 'e' -> ees++;
                case 'i' -> ies++;
                case 'o' -> oes++;
                case 'u' -> ues++;
            }
        }
        System.out.println("numero de a: " + aes);
        System.out.println("numero de e: " + ees);
        System.out.println("numero de i: " + ies);
        System.out.println("numero de o: " + oes);
        System.out.println("numero de u: " + ues);
        /*
        Ejercicio 5: Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo
        o no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas).
        Supondremos que el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni
        acentos, etc.). Un palíndromo es un texto que se lee igual de izquierda a derecha que de
        derecha a izquierda.
        Por ejemplo:
            Amigo no gima
            Dabale arroz a la zorra el abad
            Amo la pacífica paloma
            A man a plan a canal Panama
         */
        System.out.println("Ejercicio 5");
        scanner = new Scanner(System.in);
        System.out.println("Introduzca la frase");
        String textoE5 = scanner.nextLine();
        String fraseProcesada = textoE5.replace(" ", "").toLowerCase();

        //Algoritmo para ver si es un palindromo
        boolean isPalindromo = true;
        int izquierda = 0;
        int derecha = fraseProcesada.length() - 1;

        while(izquierda < derecha){
            if(fraseProcesada.charAt(izquierda) != fraseProcesada.charAt(derecha)){
                isPalindromo = false;
                break;
            }
            izquierda++;
            derecha--;
        }
        System.out.println("la frase es un palindromo: "+ isPalindromo);

    }
}