package funcionSwitch;

public class Prueba {
	public static void main(String args[]){
		 int x = 3;
		 switch (x){
		 case 1:
		 System.out.println("x es uno");
		 break;
		 case 2:
		 System.out.println("x es dos");
		 break;
		 case 3:
		 System.out.println("x es tres");
		 //sin break;
		 case 4:
		 System.out.println("x es cuatro");
		 //sin break;
		 case 5:
		 System.out.println("x es cinco");
		 break;
		 default:
		 System.out.println("x no está entre uno y cinco" );
		 }
	}
}
