package EjercicioD;

import java.time.LocalDate;

public class Profesores extends Personas{
	private String departamento;
	private LocalDate fechaincorporacion;
	private int despacho;

	Profesores(String nombre, String apellido, String rut, String estadocivil, String departamento,
			LocalDate fechaincorporacion, int despacho) {
		super(nombre, apellido, rut, estadocivil);
		this.departamento = departamento;
		this.fechaincorporacion = fechaincorporacion;
		this.despacho = despacho;
	}

	public void imprimir() {
		System.out.println("Datos del Profesor");
		System.out.println("==================");
		super.imprimir();
		System.out.println("Departamento		: " + departamento);
		System.out.println("Fecha Incorporacion	: " + fechaincorporacion);
		System.out.println("Despacho		: " + despacho);
		System.out.println(" ");
		
		
		
	}
		
	public String getDepartamento() {
		return departamento;
	}

	public void cambiarDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public LocalDate getFechaincorporacion() {
		return fechaincorporacion;
	}

	public void setFechaincorporacion(LocalDate fechaincorporacion) {
		this.fechaincorporacion = fechaincorporacion;
	}

	public int getDespacho() {
		return despacho;
	}

	public void setDespacho(int despacho) {
		this.despacho = despacho;
	}

	
	public String mostrarProfesor() {
		return "Profesores [departamento=" + departamento + ", fechaincorporacion=" + fechaincorporacion + ", despacho="
				+ despacho + "]";
	}
	
	
	
}
