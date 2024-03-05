package recursividad;

public class Recursividad {
	void imprimir(int x) {
		 if(x>0){
			 imprimir(x-1);
			 System.out.println(x);
		 }
	} 
}
