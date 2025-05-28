package es.mde;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Set;

public class TurnoEspecial extends TurnoBaseImpl {

	private TipoEspecial tipoEspecial;
	private Set<DayOfWeek> diasNoPermitidos;
	private boolean asociadoPracticas;
	private LocalTime horaInicio;
	private LocalTime horaFinal;
	
	public TurnoEspecial() {
		super();
	}

	public TipoEspecial getTipoEspecial() {
		return tipoEspecial;
	}

	public void setTipoEspecial(TipoEspecial tipoEspecial) {
		this.tipoEspecial = tipoEspecial;
	}

	public Set<DayOfWeek> getDiasNoPermitidos() {
		return diasNoPermitidos;
	}

	public void setDiasNoPermitidos(Set<DayOfWeek> diasNoPermitidos) {
		this.diasNoPermitidos = diasNoPermitidos;
	}

	public boolean isAsociadoPracticas() {
		return asociadoPracticas;
	}

	public void setAsociadoPracticas(boolean asociadoPracticas) {
		this.asociadoPracticas = asociadoPracticas;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public LocalTime getHoraFinal() {
		return horaFinal;
	}

	public void setHoraFinal(LocalTime horaFinal) {
		this.horaFinal = horaFinal;
	}
	
}
