package ej3Polimorfismo;

public class Barco {
	
	private String nombre,tipo;
	private int capacidadCarga,capacidadPasajero;
	
	
	public Barco(String nombre, String tipo, int capacidadCarga, int capacidadPasajero) {
		
		this.nombre = nombre;
		this.tipo = tipo;
		this.capacidadCarga = capacidadCarga;
		this.capacidadPasajero = capacidadPasajero;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getCapacidadCarga() {
		return capacidadCarga;
	}


	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}


	public int getCapacidadPasajero() {
		return capacidadPasajero;
	}


	public void setCapacidadPasajero(int capacidadPasajero) {
		this.capacidadPasajero = capacidadPasajero;
	}
	
	
	@Override
	public String toString() {
		
		return "Nombre del barco: "+nombre+
				"\nTipo: "+tipo+
				"\nCapacidad de Pasajero: "+capacidadPasajero+
				"\nCapacidad de Carga: "+capacidadCarga;
	}
	
}
