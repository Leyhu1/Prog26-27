import model.Libro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Libro l1 = new Libro("122323nn", "El Señor de los Anillos", "JRR Tolkien");

    System.out.println(l1.getAutor());

    System.out.println(l1.infoLibro());
}