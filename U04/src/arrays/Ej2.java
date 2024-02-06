package arrays;

import java.util.Arrays;

public class Ej2 {
	public static void main(String[] args) {
		int[] array = {3, 5, 1, 2, 3, 7, 1, 5, 2, 8, 4, 6, 7, 8};

		System.out.println("Array original: " + Arrays.toString(array));

			Arrays.sort(array);

		    int nuevoTamano = eliminarDuplicados(array);

		    int[] arraySinDuplicados = Arrays.copyOf(array, nuevoTamano);

		    System.out.println("Array sin duplicados: " + Arrays.toString(arraySinDuplicados));
		    }

		private static int eliminarDuplicados(int[] array) {
		    int n = array.length;
		    if (n == 0 || n == 1) {
		        return n;
		    }

		    int indice = 0;

		    for (int i = 0; i < n - 1; i++) {
		        if (array[i] != array[i + 1]) {
		            array[indice++] = array[i];
		        }
		    }
		    array[indice++] = array[n - 1];

		    return indice;
	}

}
