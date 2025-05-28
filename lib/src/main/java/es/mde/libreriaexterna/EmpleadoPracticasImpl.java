package es.mde.libreriaexterna;

import java.time.LocalDate;

public class EmpleadoPracticasImpl extends EmpleadoBaseImpl implements EmpleadoPracticas {
	
	private LocalDate fechaInicioPracticas;
	private LocalDate fechaFinalPracticas;
	
	public EmpleadoPracticasImpl() {
		super();
	}
	
	@Override
	public LocalDate getFechaInicioPracticas() {
		return fechaInicioPracticas;
	}
	@Override
	public void setFechaInicioPracticas(LocalDate fechaInicioPracticas) {
		this.fechaInicioPracticas = fechaInicioPracticas;
	}
	@Override
	public LocalDate getFechaFinalPracticas() {
		return fechaFinalPracticas;
	}
	@Override
	public void setFechaFinalPracticas(LocalDate fechaFinalPracticas) {
		this.fechaFinalPracticas = fechaFinalPracticas;
	}
	
	
}
