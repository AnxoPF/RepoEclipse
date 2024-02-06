package sentenciaIF;

import java.util.Scanner;


public class Ej6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("introduce un número entero: ");
		numero = sc.nextInt();
		
		if (numero%2==0) 
			System.out.println("Es par");
		else 
			System.out.println("No es par");

		sc.close();
			
		}
	}
