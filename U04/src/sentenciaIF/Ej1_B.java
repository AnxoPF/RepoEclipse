package sentenciaIF;

import java.util.Scanner;
	
public class Ej1_B {

	public static void main(String[] args) {
	 
		Scanner entrada=new Scanner(System.in);
		 int x;
		 int y;
		 System.out.println("Teclea número entero x");
		 x=entrada.nextInt();
		 System.out.println("Teclea número entero y");
		 y=entrada.nextInt();
		 
		 if (x== 10) {
		 System.out.println("x vale 10");
		 System.out.println("x + y vale: " + (x+y));
		 }
		 else
		 System.out.println("x NO vale 10");
	
		 entrada.close();
	}
	
}

