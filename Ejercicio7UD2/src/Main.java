import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        System.out.println("Piedra papel o tijera");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Como se juega: jugaras contra la maquina que eligira una opcion aleatoria, tu tendras que elegir Piedra : P, papel : L o tijera : T.");
        int maquina[] = new int[1];
        String juego;
        do {
            System.out.println("P. Piedra");
            System.out.println("L. Papel");
            System.out.println("T. Tijera");
            System.out.println("S. Salir");
            juego = scanner.nextLine();
            for (int i = 0; i < maquina.length; i++) {
                maquina[i] = (int) (Math.random() * 3);
                System.out.println("La Maquina ha sacado: ");
                if (maquina[i] == 0){
                    System.out.println("Piedra");
                }
                if (maquina[i] == 1){
                    System.out.println("Papel");
                }
                if (maquina[i] == 2){
                    System.out.println("Tijera");
                }
            }
                switch (juego) {
                    case "P","p":
                        System.out.println("Has elegido Piedra");
                        for (int i = 0; i < maquina.length; i++){
                            if (maquina[i] == 0) {
                                System.out.println("Has Empatado");
                            }
                            if (maquina[i] == 1) {
                                System.out.println("Has Perdido");
                            }
                            if (maquina[i] == 2) {
                                System.out.println("Has Ganado");
                            }
                        }
                        break;
                    case "L", "l":
                        System.out.println("Has elegido Papel");
                        for (int i = 0; i < maquina.length; i++){
                            if (maquina[i] == 0) {
                                System.out.println("Has Ganado");
                            }
                            if (maquina[i] == 1) {
                                System.out.println("Has Empatado");
                            }
                            if (maquina[i] == 2) {
                                System.out.println("Has Perdido");
                            }
                        }
                        break;
                    case "T", "t":
                        System.out.println("Has elegido Tijeras");
                        for (int i = 0; i < maquina.length; i++){
                            if (maquina[i] == 0) {
                                System.out.println("Has Perdido");
                            }
                            if (maquina[i] == 1) {
                                System.out.println("Has Ganado");
                            }
                            if (maquina[i] == 2) {
                                System.out.println("Has Empatado");
                            }
                        }
                        break;
                    case "S":
                        System.out.println("Has elegido Salir");
                        break;
                    case "s":
                        System.out.println("Si quieres salir, dale a la S en mayuscula");
                        break;
                    default:
                        System.out.println("Tienes que elegir una de las opciones, porfavor intentelo de nuevo");
                }

        } while (!juego.equals("S"));
    }
}