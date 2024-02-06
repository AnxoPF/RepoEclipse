package ej3Polimorfismo;

public class Capitan extends Tripulante{
	
	private int horasExperiencia;
	private final float sueldo=4500000;
	private float sueldoTotal,bono;
	
	public Capitan() {
		
	}
	
	public Capitan(int numCarnet, int edad, int posicionGps, int tiempoEmpresa, String nombre, String telefono,
			char sexo, Barco barco, int horasExperiencia) {
		super(numCarnet, edad, posicionGps, tiempoEmpresa, nombre, telefono, sexo, barco);
		this.horasExperiencia=horasExperiencia;
	}
	
	public float calcularBono() {
		
		if(horasExperiencia>=5000 && horasExperiencia<150000) {
			bono=0.2f*sueldo;
		}if(horasExperiencia>=150000 && horasExperiencia<300000) {
			bono=0.4f*sueldo;
		}if(horasExperiencia>300000) {
			bono=0.75f*sueldo;
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
		System.out.println("Horas de experiencia: "+horasExperiencia);
		System.out.println("Bono: "+calcularBono());
		System.out.println("Sueldo: "+sueldo);
		System.out.println("Sueldo total: "+calcularSueldo());
		
	}
	
	
	

}
