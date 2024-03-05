package recursividad;

public class Ej1Funcion {
	int b = 1;
	int factorial(int n) {
		if(n==0)
			return 1;
		if(n>0)
			for (int i = 1; i <= n; i++) {
	            b = b * i;
	        }
			return b;
	}
}
