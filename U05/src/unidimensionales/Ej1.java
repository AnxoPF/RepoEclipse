package unidimensionales;

public class Ej1 {
	public static void main(String[] args) {
		int[] numeros = {1,2,3,4,7,8,13};

		int pares=0;
		int impares=0;
		
		for (int n : numeros) {
			if (n % 2 == 0)
				pares++;
			else
				impares++;
		}
		
		System.out.println("Números pares: "+pares);
		System.out.println("Números impares: "+impares);
	}
}
