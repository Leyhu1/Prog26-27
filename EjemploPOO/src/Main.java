//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // Mi primer objeto de Persona
    Persona pp = new Persona("Pepe", "Blanco", 43);

    // Mi segundo objeto
    Persona paco = new Persona("Paco", "Garcia", 45);

    Persona ans = new Persona("Fernando", "Alonso", 45, "12345678A");

    System.out.println(pp.getNombre());

    pp.setNombre("Don Jose");
    pp.setEdad(44);

    System.out.println(pp.getNombre());

    System.out.println(pp.personaToString());

}