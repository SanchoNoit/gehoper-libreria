package es.mde;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class EmpleadoBase implements Reportable {

	private String nombre;
	private boolean activo;
	private List<Asignacion> asignaciones = new ArrayList<Asignacion>();

	public EmpleadoBase() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public List<Asignacion> getAsignaciones() {
		return asignaciones;
	}

	public void setAsignaciones(List<Asignacion> asignaciones) {
		this.asignaciones = asignaciones;
	}
	
	@Override
	public String generarReporte(LocalDate fechaInicioReporte, LocalDate fechaFinalReporte) {		
		List<Asignacion> asignacionesDelPeriodoSolicitado = getAsignaciones().stream()
																			 .filter(a -> (a.getFecha().isAfter(fechaInicioReporte)
																								&& a.getFecha().isBefore(fechaFinalReporte))
																							|| (a.getFecha().equals(fechaInicioReporte)
																							  	|| a.getFecha().isEqual(fechaFinalReporte))).toList();
		
		int horasTrabajadas = extraerHorasTrabajadasDeAsignaciones(asignacionesDelPeriodoSolicitado);
				
		return String.format("En el periodo solicitado se han trabajado %d horas", horasTrabajadas);
	}

	private int extraerHorasTrabajadasDeAsignaciones(List<Asignacion> asignacionesDelPeriodoSolicitado) {
		int resultado = 0;
		
		for(Asignacion asignacion : asignacionesDelPeriodoSolicitado) {
			resultado += Duration.between(asignacion.getTurno().getHoraInicio(), asignacion.getTurno().getHoraFin()).toHours();
		}

		return resultado;
	}

}
