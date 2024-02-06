package ej3Polimorfismo;

public class Marinero extends Tripulante{
	
	private int pesoTotalPescado;
	private final float sueldo=90000;
	private float sueldoTotal, bono;
	
	public Marinero() {
	
	}

	public Marinero(int numCarnet, int edad, int posicionGps, int tiempoEmpresa, String nombre, String telefono,
			char sexo, Barco barco, int pesoTotalPescado) {
		super(numCarnet, edad, posicionGps, tiempoEmpresa, nombre, telefono, sexo, barco);
		this.pesoTotalPescado=pesoTotalPescado;
	}
	
	public float calcularBono() {
		if(pesoTotalPescado>=1) {
			bono=0.25f*sueldo;
		}
		return bono;
	}

	@Override
	float calcularSueldo() {
		sueldoTotal=calcularBono()+sueldo;
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
		System.out.println("Peso total del pescado: "+pesoTotalPescado);
		System.out.println("Bono: "+calcularBono());
		System.out.println("Sueldo: "+sueldo);
		System.out.println("Sueldo total: "+calcularSueldo());
		
	}

}
