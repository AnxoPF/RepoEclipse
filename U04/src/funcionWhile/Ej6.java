package funcionWhile;

import java.util.Scanner;

public class Ej6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String palabra;
		String ListaPalabras="";
		System.out.println("Palabra: ");
		palabra=sc.next();
		
		while (!palabra.equals("fin")) {
			 System.out.println(sc.next());
		}
		sc.close();
	}
}
