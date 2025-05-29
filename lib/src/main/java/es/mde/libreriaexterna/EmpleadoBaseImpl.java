package es.mde.libreriaexterna;

public abstract class EmpleadoBaseImpl implements Empleado {

	private String nombre;
	private boolean activo;

	public EmpleadoBaseImpl() {
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
	public boolean isActivo() {
		return activo;
	}

	@Override
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
}
