package arraysEj3;

import java.util.Scanner;

public class Agenda {		
	private static final int MAX_CONTACTOS = 20;
    private Contacto[] contactos;
    
    private int cantidadContactos;

    public Agenda() {
        contactos = new Contacto[MAX_CONTACTOS];
        cantidadContactos = 0;

        // Crear algunos contactos de ejemplo
        agregarContacto(new Contacto("Juan", "Perez", "juan@gmail.com", "123456789"));
        agregarContacto(new Contacto("Maria", "Lopez", "maria@gmail.com", "987654321"));
        // Agregar más contactos según sea necesario
    }

    public void mostrarContactos() {
        System.out.println("Contactos en la agenda:");
        for (int i = 0; i < cantidadContactos; i++) {
            System.out.println(contactos[i]);
        }
    }

    public void buscarYActualizarContacto() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el email del contacto a buscar y actualizar: ");
        String emailBusqueda = scanner.nextLine();

        int indice = buscarContactoPorEmail(emailBusqueda);

        if (indice != -1) {
            System.out.println("Contacto encontrado:");
            System.out.println(contactos[indice]);

            // Actualizar el email
            System.out.print("Ingrese el nuevo email: ");
            String nuevoEmail = scanner.nextLine();

            // Validar el nuevo email
            if (validarEmail(nuevoEmail)) {
                contactos[indice].setEmail(nuevoEmail);
                System.out.println("Email actualizado correctamente.");
            } else {
                System.out.println("El nuevo email no es válido.");
            }
        } else {
            System.out.println("Contacto no encontrado.");
        }
       scanner.close();
    }

    private int buscarContactoPorEmail(String email) {
        for (int i = 0; i < cantidadContactos; i++) {
            if (contactos[i].getEmail().equals(email)) {
                return i;
            }
        }
        return -1;
    }

    private boolean validarEmail(String email) {
        // Validar que el email tenga solo una '@'
        int contadorArrobas = 0;
        for (char c : email.toCharArray()) {
            if (c == '@') {
                contadorArrobas++;
            }
        }
        return contadorArrobas == 1;
    }

    public void agregarContacto(Contacto nuevoContacto) {
        if (cantidadContactos < MAX_CONTACTOS) {
            contactos[cantidadContactos++] = nuevoContacto;
        } else {
            System.out.println("La agenda está llena. No se puede agregar más contactos.");
        }
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.mostrarContactos();
        agenda.buscarYActualizarContacto();
        agenda.mostrarContactos();
    }
}