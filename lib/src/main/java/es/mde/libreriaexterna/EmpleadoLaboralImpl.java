package es.mde.libreriaexterna;

public class EmpleadoLaboralImpl extends EmpleadoBaseImpl implements EmpleadoLaboral {

	private TipoEmpleado tipoEmpleado;
	private int tag;
	
	public EmpleadoLaboralImpl() {
		super();
	}
	
	@Override
	public TipoEmpleado getTipoEmpleado() {
		return tipoEmpleado;
	}
	@Override
	public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}
	@Override
	public int getTag() {
		return tag;
	}
	@Override
	public void setTag(int tag) {
		this.tag = tag;
	}
	
}
