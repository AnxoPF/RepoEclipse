package recursividad;

public class Potencia {
	public static void main(String[] args) {
		int base = 2;
		int exponente = 5;
		System.out.println(base + " elevado a la " + exponente + ": " + calcularPotencia(base, exponente));		
	}
	
	static int calcularPotencia(int base, int exponente) {
		if (exponente==0) {
			return 1;
		} else {
			return base * calcularPotencia(base, exponente -1);
		}
	}
}
