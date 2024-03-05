package recursividad;

import java.util.Scanner;

public class Ej1Main {
	public static void main(String[] args) {
		Ej1Funcion f = new Ej1Funcion();
		Scanner sc = new Scanner(System.in);
		System.out.println("Teclea número entero para calcular factorial: ");
		int n = sc.nextInt();
		System.out.println("Su factorial es: "+f.factorial(n));
	}
}
	