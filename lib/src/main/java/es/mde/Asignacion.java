package es.mde;

import java.time.LocalDate;

public class Asignacion {

	private LocalDate fecha;
	private TurnoBase turno;
	
	public Asignacion() {}
	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fechaYHora) {
		this.fecha = fechaYHora;
	}
	public TurnoBase getTurno() {
		return turno;
	}
	public void setTurno(TurnoBase turno) {
		this.turno = turno;
	}
	
	
}
