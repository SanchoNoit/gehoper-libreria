package es.mde.libreriaexterna;

import java.time.LocalDate;

public interface EmpleadoPracticas {

	LocalDate getFechaInicioPracticas();

	void setFechaInicioPracticas(LocalDate fechaInicioPracticas);

	LocalDate getFechaFinalPracticas();

	void setFechaFinalPracticas(LocalDate fechaFinalPracticas);

}