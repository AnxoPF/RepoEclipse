package ej3Polimorfismo;

public class Gps {
	
	private String coorX,coorY,fecha,hora;
	private int diasTripulados;
	
	
	public Gps(String coorX, String coorY, String fecha, String hora, int diasTripulados) {
		
		this.coorX = coorX;
		this.coorY = coorY;
		this.fecha = fecha;
		this.hora = hora;
		this.diasTripulados = diasTripulados;
	}


	public String getCoorX() {
		return coorX;
	}


	public void setCoorX(String coorX) {
		this.coorX = coorX;
	}


	public String getCoorY() {
		return coorY;
	}


	public void setCoorY(String coorY) {
		this.coorY = coorY;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getHora() {
		return hora;
	}


	public void setHora(String hora) {
		this.hora = hora;
	}


	public int getDiasTripulados() {
		return diasTripulados;
	}


	public void setDiasTripulados(int diasTripulados) {
		this.diasTripulados = diasTripulados;
	}
	
	

}
