//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Astros[] sistemaSolar = new Astros[10];

    Planetas tierra = new Planetas(64e6, 24600, 5.98e24, 25, 9.8, 365, 32, true);
    sistemaSolar[0] = tierra;
    Satelites luna = new Satelites(1, 1, 1, 1, 1, 1, 1, tierra);
    sistemaSolar[1] = luna;

    for (int i = 0; i < sistemaSolar.length; i++){
        if (sistemaSolar[i] != null){
            IO.println(sistemaSolar[i].muestra());
        }
    }
}
