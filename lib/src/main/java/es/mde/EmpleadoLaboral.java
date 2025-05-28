package es.mde;

public class EmpleadoLaboral extends EmpleadoBaseImpl {

	private TipoEmpleado tipoEmpleado;
	private int tag;
	
	public EmpleadoLaboral() {
		super();
	}
	
	public TipoEmpleado getTipoEmpleado() {
		return tipoEmpleado;
	}
	public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}
	public int getTag() {
		return tag;
	}
	public void setTag(int tag) {
		this.tag = tag;
	}
	
}
