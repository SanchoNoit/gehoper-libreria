package es.mde;

import java.time.LocalDate;

public class EmpleadoPracticas extends EmpleadoBase {
	
	private LocalDate fechaInicioPracticas;
	private LocalDate fechaFinalPracticas;
	
	public EmpleadoPracticas() {
		super();
	}
	
	public LocalDate getFechaInicioPracticas() {
		return fechaInicioPracticas;
	}
	public void setFechaInicioPracticas(LocalDate fechaInicioPracticas) {
		this.fechaInicioPracticas = fechaInicioPracticas;
	}
	public LocalDate getFechaFinalPracticas() {
		return fechaFinalPracticas;
	}
	public void setFechaFinalPracticas(LocalDate fechaFinalPracticas) {
		this.fechaFinalPracticas = fechaFinalPracticas;
	}
	
	
}
