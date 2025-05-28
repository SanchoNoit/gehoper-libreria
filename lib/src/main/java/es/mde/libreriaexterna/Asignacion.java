package es.mde.libreriaexterna;

import java.time.LocalDate;

public class Asignacion {

	private LocalDate fecha;
	private Turno turno;
	
	public Asignacion() {}
	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fechaYHora) {
		this.fecha = fechaYHora;
	}
	public Turno getTurno() {
		return turno;
	}
	public void setTurno(Turno turno) {
		this.turno = turno;
	}
	
	
}
