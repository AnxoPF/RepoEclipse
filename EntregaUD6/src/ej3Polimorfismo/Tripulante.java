package ej3Polimorfismo;

abstract class Tripulante {
	
	int nCarnet,edad,posGps,tEmpresa;
	String nombre,telefono;
	Barco barco;
	char sexo;

	public Tripulante() {
		
	}
	
	public Tripulante(int numCarnet, int edad, int posicionGps, int tiempoEmpresa, String nombre, String telefono,
			char sexo, Barco barco) {
		
		this.nCarnet = numCarnet;
		this.edad = edad;
		this.posGps = posicionGps;
		this.tEmpresa = tiempoEmpresa;
		this.nombre = nombre;
		this.telefono = telefono;
		this.sexo = sexo;
		this.barco = barco;
	}
	
	abstract float calcularSueldo();
	abstract void mostrarDatos();

}
