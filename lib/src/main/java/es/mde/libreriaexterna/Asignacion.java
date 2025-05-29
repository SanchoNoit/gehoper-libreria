package es.mde.libreriaexterna;

import java.time.LocalDate;

public class Asignacion {

	private LocalDate fecha;
	
	public Asignacion() {}
	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fechaYHora) {
		this.fecha = fechaYHora;
	}

}
