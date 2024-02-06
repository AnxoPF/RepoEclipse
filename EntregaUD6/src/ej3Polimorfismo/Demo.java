package ej3Polimorfismo;

public class Demo {

	public static void main(String[] args) {
		
		Barco barco = new Barco("El Victory","Cerquero",20,300);
		
		Tripulante[] lista = new Tripulante[7];
		
		lista[0]= new Capitan(1,35,30,5,"Juan","673649062",'M',barco,152000);
		lista[1]= new Capitan(2,35,32,3,"Jose","675148761",'M',barco,10000);
		lista[2]= new Capitan(3,35,26,2,"Luis","673239085",'M',barco,4000);
		lista[3]= new Capitan(4,35,40,10,"Daniel","673649860",'M',barco,303000);
		lista[4]= new Jefe(5,35,38,9,"Hugo","673649832",'M',barco,10,20);
		lista[5]= new Marinero(6,35,34,7,"Samuel","673559811",'M',barco,30);
		lista[6]= new Marinero(7,35,29,4,"Jaime","690649832",'M',barco,0);
		
		
		for(Tripulante a: lista) {
			a.mostrarDatos();
			System.out.println("----------------------");
		}

	}

}
