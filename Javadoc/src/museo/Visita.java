package museo;

import java.io.Serializable;

public class Visita implements Serializable {
	
	private String nombre;
	private int cantidad;
	private int [] horaVisita;
	
	public Visita(String nombre, int cantidad, int hora, int minuto) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		horaVisita=new int [2];
		horaVisita [0] = hora;
		horaVisita [1] = minuto;
	}

	public String getNombre() {
		return "";
	}

	public int getCantidad() {
		return -1;
	}

	public void setCantidad(int cantidad) {
		
	}

	public void setHoraVisita(int[] horaVisita) {
		
	}

	public int[] getHoraVisita() {
		return null;
	}

	public String toString() {
		return "";
	}
}
