package ejercicioHotelPerros;

public class Perro {
	
	 private String nombre;
	    private double peso;
	    private String color;

	    public Perro(String nombre, double peso, String color) {
	        this.nombre = nombre;
	        this.peso = peso;
	        this.color = color;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public double getPeso() {
	        return peso;
	    }

	    public String getColor() {
	        return color;
	    }

	    public void alimentar() {
	        System.out.println("Alimentando a " + nombre);
	        peso += 0.5; // Aumentar medio kilo
	    }

	    public void sacarAlPatio() {
	        System.out.println("Sacando a " + nombre + " al patio");
	        peso -= 0.5; // Reducir medio kilo
	    }

	    @Override
	    public String toString() {
	        return "Perro{" +
	                "nombre='" + nombre + '\'' +
	                ", peso=" + peso +
	                ", color='" + color + '\'' +
	                '}';
	    }
	}

