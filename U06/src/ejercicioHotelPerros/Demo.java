package ejercicioHotelPerros;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();

        int opcion;
        do {
            System.out.println("\nMenú del Hotel para Perros:");
            System.out.println("1. Registrar perro");
            System.out.println("2. Mostrar perros");
            System.out.println("3. Número de perros en el hotel");
            System.out.println("4. Alimentar perros");
            System.out.println("5. Sacar perros al patio");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del perro: ");
                    String nombre = scanner.next();
                    System.out.print("Peso del perro: ");
                    double peso = scanner.nextDouble();
                    System.out.print("Color del perro: ");
                    String color = scanner.next();
                    hotel.registrarPerro(nombre, peso, color);
                    break;
                case 2:
                    hotel.mostrarPerros();
                    break;
                case 3:
                    System.out.println("Número de perros en el hotel: " + hotel.obtenerNumeroPerros());
                    break;
                case 4:
                    hotel.alimentarPerros();
                    break;
                case 5:
                    hotel.sacarPerrosAlPatio();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}
