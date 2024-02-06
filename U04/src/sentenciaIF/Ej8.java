package sentenciaIF;

import java.util.Scanner;


public class Ej8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x, y, z;
		System.out.println("Introduce un número entero: ");
		x = sc.nextInt();
		System.out.println("Introduce un segundo número entero: ");
		y = sc.nextInt();
		System.out.println("Introduce un tercer número entero: ");
		z = sc.nextInt();
		
		 if (x >= y && x >= z) {
	            System.out.println("El número mayor o igual es: " + x);
	        } 
		 else if (y >= x && y >= z) {
	            System.out.println("El número mayor o igual es: " + y);
	        } 
		 else if (z >= x && z >= y) {
	            System.out.println("El número mayor o igual es: " + z);
	        } 
		 else {
	            System.out.println("Hay al menos dos números iguales.");
	        }

		sc.close();
			
		}
	}