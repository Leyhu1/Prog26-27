import java.util.Scanner;

public class MiUtils {
    private static String Sysytem;

    public static leerDoublePantalla(String mensaje){
        Scanner scanner = new Scanner(System.in);
        IO.println(mensaje);
        return scanner.nextDouble();
    }
    public static String leerTextoPantalla (String mensaje){
        Scanner scanner = new Scanner(System.in);
        IO.println(mensaje);
        return scanner.nextLine();
    }

    public static boolean comprobarPatron(String patron, String texto){
        boolean isOk = false;
        isOk = texto.matches(patron);
        return isOk;
    }

    public static String comprobarPatronRepetidamente(String patron, String mensaje){
        boolean isOk = false;
        String texto = "";

        do{
            texto = MiUtils.leerTextoPantalla(mensaje);
            isOk = MiUtils.comprobarPatron((patron, texto);
            if (!isOk){
                IO.println("El formato es incorrecto");
            }
        } while (!isOk);
        isOk = texto.matches(patron);
        return texto;
    }
}
