package es.mde;

import java.time.LocalDate;
import java.util.List;

public interface Empleado {

	String getNombre();

	void setNombre(String nombre);

	boolean isActivo();

	void setActivo(boolean activo);

	List<Asignacion> getAsignaciones();

	void setAsignaciones(List<Asignacion> asignaciones);

	String generarReporte(LocalDate fechaInicioReporte, LocalDate fechaFinalReporte);

}