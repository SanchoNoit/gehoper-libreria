package es.mde.libreriaexterna;

public class TurnoRegularImpl extends TurnoBaseImpl implements TurnoRegular {

	private TipoRegular tipoRegular;
	
	public TurnoRegularImpl() {
		super();
	}

	@Override
	public TipoRegular getTipoRegular() {
		return tipoRegular;
	}

	@Override
	public void setTipoRegular(TipoRegular tipoRegular) {
		this.tipoRegular = tipoRegular;
	}
	
	
}
