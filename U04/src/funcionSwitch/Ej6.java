package funcionSwitch;

public class Ej6 {
	
	public static void main(String[] args) {
	    System.out.println(Ej6.obtenerTipoDiaDeLaSemana("L"));
	    System.out.println(obtenerTipoDiaDeLaSemana("S"));
	    System.out.println(obtenerTipoDiaDeLaSemana("R"));
	}
	
	private static String obtenerTipoDiaDeLaSemana(String day) {
	    return switch (day) {
	        case "L", "M", "X", "J", "V" -> "Laborable";
	        case "S", "D" -> "Fin de semana";
	        default -> "Día no reconocido";
	    };
	}

}
