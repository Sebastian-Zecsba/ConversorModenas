import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al sistema de conversión de divisas!");
        boolean continuar = true;

        // Menú de opciones
        while (continuar) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. ARS (Argentina)");
            System.out.println("2. BOB (Bolivia)");
            System.out.println("3. BRL (Brasil)");
            System.out.println("4. CLP (Chile)");
            System.out.println("5. COP (Colombia)");
            System.out.println("6. USD (Dólar)");
            System.out.println("7. Salir");
            System.out.print("Seleccione la moneda de origen: ");
            int entrada = existePais(scanner);

            if (entrada == 7) {
                System.out.println("¡Gracias por usar el sistema de conversión de divisas!");
                break;
            }

            System.out.print("Seleccione la moneda de destino: ");
            int salida = existePais(scanner);
            if (salida == 7) {
                System.out.println("¡Gracias por usar el sistema de conversión de divisas!");
                break;
            }

            System.out.print("Ingrese el monto a convertir: ");
            float monto = obtenerMonto(scanner);

            // Creamos un objeto Moneda y realizamos el cálculo de la conversión
            Moneda moneda = new Moneda();
            moneda.setEntrada(entrada);
            moneda.setSalida(salida);
            moneda.setCantidad(monto);

            // Realizamos la conversión usando la API
            moneda.calculoTransformado();

            System.out.println("\n¿Desea realizar otra conversión? (s/n): ");
            String respuesta = scanner.next().trim().toLowerCase();
            continuar = respuesta.equals("s");
        }

        scanner.close();
    }

    // Método para leer la opción del usuario para seleccionar moneda
    private static int existePais(Scanner scanner) {
        while (true) {
            try {
                int opcion = scanner.nextInt();
                if (opcion >= 1 && opcion <= 7) {
                    return opcion;
                } else {
                    System.out.println("Opción inválida. Intente nuevamente.");
                }
            } catch (Exception e) {
                System.out.println("Entrada no válida. Intente nuevamente.");
                scanner.next();
            }
        }
    }

    // Método para obtener el monto de la conversión
    private static float obtenerMonto(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextFloat();
            } catch (Exception e) {
                System.out.println("Monto no válido. Intente nuevamente.");
                scanner.next();
            }
        }
    }
}
