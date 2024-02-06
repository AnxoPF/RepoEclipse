package funcionFor;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número del 1 al 100: ");
		int numero = sc.nextInt();
		
		System.out.println("Números naturales del 0 al "+numero+":");
		
		 for (int i = 1; i <= numero; i++) {
	            System.out.println(i);
	        }				
		 sc.close();
	}

}
