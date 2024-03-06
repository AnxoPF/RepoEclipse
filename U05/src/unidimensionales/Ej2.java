package unidimensionales;

import java.util.Arrays;

public class Ej2 {
	public static void main(String[] args) {
		int[] array = {1,3,5,7,3,1,8,1,4,2};
		Arrays.sort(array);
		Arrays.copyOf(array, 0);
		for (int n : array)
			System.out.println(n);
		
		
		
	}
}
	
