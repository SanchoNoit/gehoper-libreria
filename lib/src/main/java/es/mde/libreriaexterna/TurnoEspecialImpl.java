package es.mde.libreriaexterna;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Set;

public class TurnoEspecialImpl extends TurnoBaseImpl implements TurnoEspecial {

	private TipoEspecial tipoEspecial;
	private Set<DayOfWeek> diasNoPermitidos;
	private boolean asociadoPracticas;
	private LocalDate fechaInicio;
	private LocalDate fechaFinal;
	
	public TurnoEspecialImpl() {
		super();
	}

	@Override
	public TipoEspecial getTipoEspecial() {
		return tipoEspecial;
	}

	@Override
	public void setTipoEspecial(TipoEspecial tipoEspecial) {
		this.tipoEspecial = tipoEspecial;
	}

	@Override
	public Set<DayOfWeek> getDiasNoPermitidos() {
		return diasNoPermitidos;
	}

	@Override
	public void setDiasNoPermitidos(Set<DayOfWeek> diasNoPermitidos) {
		this.diasNoPermitidos = diasNoPermitidos;
	}

	@Override
	public boolean isAsociadoPracticas() {
		return asociadoPracticas;
	}

	@Override
	public void setAsociadoPracticas(boolean asociadoPracticas) {
		this.asociadoPracticas = asociadoPracticas;
	}

	@Override
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	@Override
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Override
	public LocalDate getFechaFinal() {
		return fechaFinal;
	}

	@Override
	public void setFechaFinal(LocalDate fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	
}
