package funcionSwitch;

import java.util.Scanner;

public class Ej5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 int mes, año;
		 System.out.println("Introduce el número de mes");
		 mes = sc.nextInt();
		 System.out.println("Introduce el año");
		 año = sc.nextInt();
		 int numDias = 0;
		 
		 switch (mes) {
         case 1: // Enero
         case 3: // Marzo
         case 5: // Mayo
         case 7: // Julio
         case 8: // Agosto
         case 10: // Octubre
         case 12: // Diciembre
             numDias = 31;
             break;
         case 4: // Abril
         case 6: // Junio
         case 9: // Septiembre
         case 11: // Noviembre
             numDias = 30;
             break;
         case 2: // Febrero
             if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                 numDias = 29; // Año bisiesto
             } else {
                 numDias = 28; // Año no bisiesto
             }
             break;
         default:
             System.out.println("Mes inválido");
             break;
     }
		 System.out.println("Número de días = " + numDias);
		 sc.close();
	}

}
