package sentenciaIF;

import java.util.Scanner;

class Ej10 {
	public static void main(String[] args) {
		 Scanner teclado= new Scanner(System.in);
		 int a,b,s=5;
		 System.out.println("a: ");
		 a=teclado.nextInt();
		 System.out.println("b: ");
		 b=teclado.nextInt();
		
		 if((a==0) && (b!=0))
		 s=s+b;
		 else
		 s=s+a;
		 System.out.println("s: "+s);
		 
		 teclado.close();
 }
}
