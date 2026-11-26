//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("Bienvenidos a VideoDaw");
    final String dniPattern = "[0-9]{8}[A-Z]{1}";
    final String cifPattern = "[A-Z]{1}[0-9]{8}";
    Scanner scanner = new Scanner(System.in);
    String opcion;

    VideoDaw videoClub = null;
    Cliente nuevoCliente = null;
    Pelicula nuevaPelicula = null;
    do {
        scanner = new Scanner(System.in);
        String [] opciones = {"1. Crear y registrar VideoClub en la franquicia.", "2. Registrar película en videoclub.", "3. Crear y registrar cliente en videoclub.", "4.  Alquilar película.",
                "5. Devolver película.", "6. Dar de baja cliente.", "7. Dar de baja película.", "8. Salir"};

        opcion = MiUtils.generarMenuOpciones(opciones);
        opcion = scanner.nextLine();
        switch (opcion){
            case "1":
                String cif = MiUtils.comprobarPatronRepetidamente(cifPattern, "Introduzca el CIF del Videoclub");
                String direccionVideoDaw = MiUtils.leerTextoPantalla("Añade la direccion");

                videoClub = new VideoDaw(cif, direccionVideoDaw);
                System.out.println(videoClub.infoVideoDaw());
                break;
            case "2":
                if (videoClub != null) {
                    scanner = new Scanner(System.in);
                    String titulo = MiUtils.leerTextoPantalla("Añade el Titulo");
                    for (int i = 0; i < 1; i++) {
                        System.out.println("seleccione el genero de la pelicula:\n" + "1)Comedia\n" + "2)Accion\n" + "3)Romance\n" + "4)Animada\n" + "5)SCIFI\n" + "6)Terror\n" + "7)Biografia\n" + "8)Infantil\n" + "9)Suspense");

                        int tipoGenero = scanner.nextInt();
                        if (tipoGenero == 1) {
                            nuevaPelicula = new Pelicula(titulo, Genero.Comedia);
                        }
                        if (tipoGenero == 2) {
                            nuevaPelicula = new Pelicula(titulo, Genero.Accion);
                        }
                        if (tipoGenero == 3) {
                            nuevaPelicula = new Pelicula(titulo, Genero.Romance);
                        }
                        if (tipoGenero == 4) {
                            nuevaPelicula = new Pelicula(titulo, Genero.Animada);
                        }
                        if (tipoGenero == 5) {
                            nuevaPelicula = new Pelicula(titulo, Genero.SCIFI);
                        }
                        if (tipoGenero == 6) {
                            nuevaPelicula = new Pelicula(titulo, Genero.Terror);
                        }
                        if (tipoGenero == 7) {
                            nuevaPelicula = new Pelicula(titulo, Genero.Biografia);
                        }
                        if (tipoGenero == 8) {
                            nuevaPelicula = new Pelicula(titulo, Genero.Infantil);
                        }
                        if (tipoGenero == 9) {
                            nuevaPelicula = new Pelicula(titulo, Genero.Suspense);
                        } else if (tipoGenero > 9 && tipoGenero < 1) {
                            System.out.println("Porfavor, eliga una de las categorias que se muestren en pantalla");
                        }
                    }
                    if (nuevaPelicula != null) {
                        System.out.println("Se ha registrado la pelicula");
                        System.out.println(nuevaPelicula.infoPelicula());
                        videoClub.registrarPelicula(nuevaPelicula);
                    }
                } else {
                    System.out.println("Registra el videoclub antes de registrar una pelicula");
                }
                break;
            case "3":
                if (videoClub != null) {
                    String dni = MiUtils.comprobarPatronRepetidamente(dniPattern, "Introduzca el DNI del Cliente");
                    String nombre = MiUtils.leerTextoPantalla("Introduzca el Nombre del cliente");
                    String direccion = MiUtils.leerTextoPantalla("Introduzca la direccion del cliente");
                    LocalDate fechaNacimiento = MiUtils.fechaconformato();
                    LocalDate hoy = LocalDate.now();
                    int n = hoy.getYear() - fechaNacimiento.getYear();

                    if (n > 18) {
                        nuevoCliente = new Cliente(dni, nombre, direccion, fechaNacimiento);
                        if (videoClub.registrarCliente(nuevoCliente) == true) {
                            System.out.println("Cliente registrado");
                            System.out.println(nuevoCliente.infoClientes());
                        } else {
                            System.out.println("Ya existe dicho cliente");
                        }
                    } else if (n == 18){
                        int m = hoy.getMonthValue() - fechaNacimiento.getMonthValue();
                        if (m > 0) {
                            nuevoCliente = new Cliente(dni, nombre, direccion, fechaNacimiento);
                            if (videoClub.registrarCliente(nuevoCliente) == true) {
                                System.out.println("Cliente registrado");
                                System.out.println(nuevoCliente.infoClientes());
                            } else {
                                System.out.println("Ya existe dicho cliente");
                            }
                        } else {
                            System.out.println("El cliente no cumple la mayoria de edad por los meses");
                        }
                    } else {
                        System.out.println("El cliente es menor de edad");
                    }
                } else {
                    System.out.println("Registra el videoclub antes de registrar a un Cliente");
                }
                break;
            case "4":

        }

    }while (!opcion.equalsIgnoreCase("8"));

}
