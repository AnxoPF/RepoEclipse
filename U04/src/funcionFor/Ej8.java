package funcionFor;

public class Ej8 {
	public static void main(String[] args) {
		
		System.out.println();
		for(int i=0;i<128;i++) {
			System.out.println(i+"\t"+Integer.toBinaryString(i)+"\t"+Integer.toOctalString(i)+"\t"+Integer.toHexString(i));
		}
	}

}
