package funcionWhile;

public class Ej5 {
    public static void main(String[] args) {
        int i = 0;

        while (i++ < 3) {
            System.out.println("iteración bucle exterior número " + i);
            int j = 0;
            while (j++ < 2) {
                System.out.println("\titeración bucle interior número " + j);
            }
        }
    }
}
