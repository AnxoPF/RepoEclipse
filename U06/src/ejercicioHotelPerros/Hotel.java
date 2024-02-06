package ejercicioHotelPerros;

import java.util.ArrayList;

public class Hotel {
	private ArrayList<Perro> perros;

    public Hotel() {
        this.perros = new ArrayList<>();
    }

    public void registrarPerro(String nombre, double peso, String color) {
        Perro perro = new Perro(nombre, peso, color);
        perros.add(perro);
        System.out.println("Perro registrado: " + perro);
    }

    public void mostrarPerros() {
        System.out.println("Perros en el hotel:");
        for (Perro perro : perros) {
            System.out.println(perro);
        }
    }

    public int obtenerNumeroPerros() {
        return perros.size();
    }

    public void alimentarPerros() {
        System.out.println("Alimentando a todos los perros en el hotel");
        for (Perro perro : perros) {
            perro.alimentar();
        }
    }

    public void sacarPerrosAlPatio() {
        System.out.println("Sacando a todos los perros al patio");
        for (Perro perro : perros) {
            perro.sacarAlPatio();
        }
    }
}