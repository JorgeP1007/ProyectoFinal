import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;

public class ConsolaApicola {

public static void main(String[] args) {
        SistemaApicola sistema = new SistemaApicola();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== Sistema de Gestión de Colmenas ===");
            System.out.println("1. Registrar Colmena");
            System.out.println("2. Registrar Apicultor");
            System.out.println("3. Registrar Inspección");
            System.out.println("4. Ver Colmenas");
            System.out.println("5. Ver Apicultores");
            System.out.println("6. Ver Historial de Inspecciones de una Colmena");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    // Registrar Colmena
                    System.out.print("ID de la colmena (e.g., ABC123): ");
                    String idColmena = scanner.nextLine();
                    System.out.print("Ubicación de la colmena: ");
                    String ubicacion = scanner.nextLine();
                    System.out.print("Estado de salud de la colmena (malo, regular, excelente): ");
                    String estadoSalud = scanner.nextLine();
                    System.out.print("Cantidad de abejas: ");
                    int cantidadAbejas = scanner.nextInt();
                    System.out.print("Producción de miel (en kg): ");
                    double produccionMiel = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("ID de la abeja reina: ");
                    String idAbejaReina = scanner.nextLine();
                    System.out.print("Estado de salud de la abeja reina (malo, regular, excelente): ");
                    String estadoSaludAbeja = scanner.nextLine();
                    System.out.print("Edad de la abeja reina: ");
                    int edadAbeja = scanner.nextInt();
                    System.out.print("Productividad de la abeja reina (en funcion a los huevos que pone): ");
                    double productividadAbeja = scanner.nextDouble();

                    AbejaReina abejaReina = new AbejaReina(idAbejaReina, estadoSaludAbeja, edadAbeja, productividadAbeja);
                    Colmena colmena = new Colmena(idColmena, ubicacion, estadoSalud, cantidadAbejas, produccionMiel, abejaReina);
                    sistema.registrarColmena(colmena);
                    System.out.println("Colmena registrada con éxito.");
                    break;

                case 2:
                    // Registrar Apicultor
                    System.out.print("ID del apicultor: ");
                    String idApicultor = scanner.nextLine();
                    System.out.print("Nombre del apicultor: ");
                    String nombreApicultor = scanner.nextLine();
                    System.out.print("Teléfono del apicultor: ");
                    String telefonoApicultor = scanner.nextLine();

                    Apicultor apicultor = new Apicultor(idApicultor, nombreApicultor, telefonoApicultor);
                    sistema.registrarApicultor(apicultor);
                    System.out.println("Apicultor registrado con éxito.");
                    break;

                case 3:
                    // Registrar Inspección
                    System.out.print("ID de la colmena a inspeccionar: ");
                    String idColmenaInspeccion = scanner.nextLine();
                    System.out.print("Fecha de la inspección (YYYY-MM-DD): ");
                    String fecha = scanner.nextLine();
                    System.out.print("Resultado de la inspección: ");
                    String resultado = scanner.nextLine();
                    System.out.print("Acciones tomadas: ");
                    String acciones = scanner.nextLine();

                    Inspeccion inspeccion = new Inspeccion(LocalDate.parse(fecha), resultado, acciones);
                    try {
                        sistema.registrarInspeccion(idColmenaInspeccion, inspeccion);
                        System.out.println("Inspección registrada con éxito.");
                    } catch (RegistroException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 4:
                    // Ver Colmenas
                    List<Colmena> colmenas = sistema.getColmenas();
                    System.out.println("=== Lista de Colmenas ===");
                    for (Colmena c : colmenas) {
                        System.out.println("ID: " + c.getId() + ", Ubicación: " + c.getUbicacion() +
                                ", Estado de Salud: " + c.getEstadoSalud() +
                                ", Producción de Miel: " + c.getProduccionMiel() + "kg");
                    }
                    break;

                case 5:
                    // Ver Apicultores
                    List<Apicultor> apicultores = sistema.getApicultores();
                    System.out.println("=== Lista de Apicultores ===");
                    for (Apicultor a : apicultores) {
                        System.out.println("ID: " + a.getNombre() + ", Nombre: " + a.getNombre() +
                                ", Teléfono: " + a.getTelefono());
                    }
                    break;

                case 6:
                    // Ver Historial de Inspecciones de una Colmena
                    System.out.print("ID de la colmena: ");
                    String idColmenaHistorial = scanner.nextLine();
                    Colmena colmenaHistorial = sistema.buscarColmena(idColmenaHistorial);
                    System.out.println("=== Historial de Inspecciones ===");
                    List<Inspeccion> historial = colmenaHistorial.obtenerHistorialInspecciones();
                    for (Inspeccion i : historial) {
                        System.out.println("Fecha: " + i.getFecha() + ", Resultado: " + i.getResultado() +
                                ", Acciones: " + i.getAcciones());
                    }
                    break;

                case 7:
                    // Salir
                    continuar = false;
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
                    break;
            }
        }
        scanner.close();
    }
}
