//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("Bienvenidos a VideoDaw");
    final String dniPattern = "[0-9]{8}[A-Z]{1}";
    final String cifPattern = "[A-Z]{1}[0-9]{8}";
    Scanner scanner = new Scanner(System.in);
    String opcion;
    String [] opciones = {"1. Crear y registrar VideoClub en la franquicia.", "2. Registrar película en videoclub.", "3. Crear y registrar cliente en videoclub.", "4.  Alquilar película.",
                       "5. Devolver película.", "6. Dar de baja cliente.", "7. Dar de baja película.", "8. Salir"};
    do {
        scanner = new Scanner(System.in);
        opcion = MiUtils.generarMenuOpciones(opciones);
        opcion = scanner.nextLine();
        switch (opcion){
            case "1":
                String cif = MiUtils.comprobarPatronRepetidamente(cifPattern, "Introduzca el CIF del Videoclub");

        }

    }while (!opcion.equalsIgnoreCase("8"));

}
