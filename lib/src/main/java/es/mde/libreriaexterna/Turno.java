package es.mde.libreriaexterna;

import java.time.LocalTime;

public interface Turno {

	String getNombre();

	void setNombre(String nombre);

	LocalTime getHoraInicio();

	void setHoraInicio(LocalTime horaInicio);

	LocalTime getHoraFin();

	void setHoraFin(LocalTime horaFin);

	boolean isActivo();

	void setActivo(boolean activo);

}