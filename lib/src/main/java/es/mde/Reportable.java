package es.mde;

import java.time.LocalDate;

public interface Reportable {

	public String generarReporte(LocalDate fechaInicioReporte, LocalDate fechaFinalReporte);
}
