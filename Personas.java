package Cclase16D;

public class Personas {

	private String nombre;
	private String apellido;
	private String rut;
	private String estadocivil;
	
	Personas(String nombre, String apellido, String rut, String estadocivil) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.estadocivil = estadocivil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getRut() {
		return rut;
	}
	
	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}

	@Override
	public String toString() {
		return "Personas [nombre=" + nombre + ", apellido=" + apellido + ", estadocivil=" + estadocivil + "]";
	}
	
}
