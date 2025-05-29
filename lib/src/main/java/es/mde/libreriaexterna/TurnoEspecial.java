package es.mde.libreriaexterna;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Set;

public interface TurnoEspecial {

	TipoEspecial getTipoEspecial();

	void setTipoEspecial(TipoEspecial tipoEspecial);

	Set<DayOfWeek> getDiasNoPermitidos();

	void setDiasNoPermitidos(Set<DayOfWeek> diasNoPermitidos);

	boolean isAsociadoPracticas();

	void setAsociadoPracticas(boolean asociadoPracticas);

	LocalDate getFechaInicio();

	void setFechaInicio(LocalDate fechaInicio);

	LocalDate getFechaFinal();

	void setFechaFinal(LocalDate fechaFinal);

}