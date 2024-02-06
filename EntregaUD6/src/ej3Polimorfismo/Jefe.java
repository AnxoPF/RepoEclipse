package ej3Polimorfismo;

public class Jefe extends Tripulante{
	
	private int pesoPescado,pesoMarisco;
	private final float sueldo=350000000;
	private float bonoPescado,bonoMarisco,sueldoTotal;
	
	public Jefe() {
		
	}

	public Jefe(int numCarnet, int edad, int posicionGps, int tiempoEmpresa, String nombre, String telefono, char sexo,
			Barco barco, int pesoPescado, int pesoMarisco) {
		super(numCarnet, edad, posicionGps, tiempoEmpresa, nombre, telefono, sexo, barco);
		this.pesoPescado=pesoPescado;
		this.pesoMarisco=pesoMarisco;
	}

	public float calcularBonos() {
		bonoPescado=pesoPescado;
		bonoMarisco=pesoMarisco*2;
		return bonoPescado+bonoMarisco;
	}

	@Override
	float calcularSueldo() {
		sueldoTotal=calcularBonos()+sueldo;
		return sueldoTotal;
	}

	@Override
	void mostrarDatos() {
		System.out.println("Numero de carnet: "+nCarnet);
		System.out.println("Edad: "+edad);
		System.out.println("Posicion GPS: "+posGps);
		System.out.println("Tiempo en la empresa: "+tEmpresa);
		System.out.println("Nombre: "+nombre);
		System.out.println("Telefono: "+telefono);
		System.out.println("Sexo: "+sexo);
		System.out.println("Barco: "+barco.toString());
		System.out.println("Peso del pescado: "+pesoPescado);
		System.out.println("Peso del marisco: "+pesoMarisco);
		System.out.println("Bonos: "+calcularBonos());
		System.out.println("Sueldo: "+sueldo);
		System.out.println("Sueldo total: "+calcularSueldo());
		
		
	}

}
