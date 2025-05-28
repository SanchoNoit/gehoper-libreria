package es.mde.libreriaexterna;

import java.time.LocalDate;

public interface Reportable {

	public String generarReporte(LocalDate fechaInicioReporte, LocalDate fechaFinalReporte);
}
