package es.mde;

public class TurnoRegular extends TurnoBaseImpl {

	private TipoRegular tipoRegular;
	
	public TurnoRegular() {
		super();
	}

	public TipoRegular getTipoRegular() {
		return tipoRegular;
	}

	public void setTipoRegular(TipoRegular tipoRegular) {
		this.tipoRegular = tipoRegular;
	}
	
	
}
