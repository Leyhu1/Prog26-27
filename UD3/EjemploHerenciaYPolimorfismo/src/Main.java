//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String [] modulos = {"Frenada","Paso por curva","adelantamiento","el ultimo en pie"};

    Persona pp = new Persona("Pepe", "Garcia", LocalDate.now(), "12345678H");
    Alumno a1 = new Alumno("Marc", "Marquez", LocalDate.now(), "62543129O",
            "MotoGP", 2026, modulos);

//    IO.println(pp);
//    IO.println(a1);

    Persona[] decrolyComunidad = new Persona[100];

    decrolyComunidad[0] = pp;
    decrolyComunidad[1] = a1;

    for (int i = 0; i < decrolyComunidad.length; i++){
        if (decrolyComunidad[i] != null){
            if (decrolyComunidad[i] instanceof Alumno){
                IO.println("Soy un Alumno");
            }
            IO.println(decrolyComunidad[i]);
        }
    }

}
