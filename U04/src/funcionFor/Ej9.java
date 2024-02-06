package funcionFor;

public class Ej9 {
	public static void main(String[] args) {
		
		for(int i=50;i>-1;i-=2)
			System.out.println(i+" ");
		
		
		System.out.println();
		int j=50;
		while(j>-1) {
			System.out.println(j+" ");
			j-=2;
		}
		
		
		System.out.println();
		int k=50;
		do{
			System.err.println(k+" ");
			k-=2;
		}while(k>-1);
	}

}
