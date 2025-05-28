package es.mde;

import java.time.LocalTime;

public abstract class TurnoBaseImpl implements Turno {

	private String nombre;
	private LocalTime horaInicio;
	private LocalTime horaFin;
	private boolean activo;
	
	public TurnoBaseImpl() {
		super();
	}
	
	@Override
	public String getNombre() {
		return nombre;
	}
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public LocalTime getHoraInicio() {
		return horaInicio;
	}
	@Override
	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}
	@Override
	public LocalTime getHoraFin() {
		return horaFin;
	}
	@Override
	public void setHoraFin(LocalTime horaFin) {
		this.horaFin = horaFin;
	}
	@Override
	public boolean isActivo() {
		return activo;
	}
	@Override
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
}
