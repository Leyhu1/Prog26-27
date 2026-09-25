//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println("Hola mundo!!");


}*/
public class Main {

    public static void main(String[] args){
        //Imprimir por pantalla
        System.out.println("hello world");
        int edad = 20, edad2, edad3;
        long edadLong = 123L;

        double precio = 59.99;
        float precioFloat = 59.99f;

        if (edad == edadLong){
            int edad4 = 13;
            edad4++; //edad4 = edad4 + 1
        }
        int a = 23;
        double b = 33.5;
        char c = 'a';
        String texto = "soy un texto";
        boolean estado = false;
        System.out.println("Mi salario es: " + edad);
        System.out.println(texto);

        Scanner scan = new Scanner(System.in);
        System.out.println("mi edad es: ");
        edad = scan.nextInt();
        System.out.println("su edad es: " + edad);

    }

}