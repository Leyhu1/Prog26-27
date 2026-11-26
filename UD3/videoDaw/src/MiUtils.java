import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MiUtils {
    public static String generarMenuOpciones(String[] opciones){
        IO.println("Por favor escoja la opción deseada");
        if(opciones.length > 0){
            for(String opcion : opciones){
                IO.println(opcion);
            }
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        }
        return "";
    }
    public static void imprimir(String mensaje){
        System.out.println(mensaje);
    }

    public static String leerTextoPantalla(String mensaje){
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
            isOk = MiUtils.comprobarPatron(patron, texto);
            if(!isOk){
                IO.println("El formato es incorrecto, vuelva a intentarlo");
            }
        }while(!isOk);

        return texto;
    }

    public static LocalDate fechaconformato(){
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        MiUtils.imprimir("\nEscribe la fecha de nacimiento en formato DD/MM/AAAA");
        String dateString = scanner.nextLine();

        LocalDate fechaLocalDate = LocalDate.parse(dateString, formatter);
        return fechaLocalDate;
    }

}
