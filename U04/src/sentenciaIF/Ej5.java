package sentenciaIF;

import java.util.Scanner;


public class Ej5 {
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		char letra;
		System.out.println("teclea una vocal: ");
		letra = entrada.next().charAt(0);
		
		if (letra=='a' || letra == 'A') 
			System.out.println("A de animal");
		else if (letra=='e' || letra == 'E')
			System.out.println("E de Enemigo");
		else if (letra=='i' || letra == 'I')
			System.out.println("I de Imbécil");
		else if (letra=='o' || letra == 'O')
			System.out.println("O de Odontología");
		else if (letra=='u' || letra == 'U')
			System.out.println("U de Unánime");
		else
			System.out.println("No es vocal");
		
		entrada.close();	
		}
	}
