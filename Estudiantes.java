package EjercicioD;

public class Estudiantes extends Personas{
	
	private String curso;
	
	
	public Estudiantes(String _nombre, String _apellido, String _rut, String _estadocivil, String curso) {
		super(_nombre, _apellido, _rut, _estadocivil);
		this.curso=curso;
		
	}
	public void imprimir() {
		System.out.println("Datos del Estudiante ");
		System.out.println("====================");
		super.imprimir();
		System.out.println("Curso                   : " + curso);
		System.out.println(" ");
	}
	
	

	@Override
	public String toString() {
		return "Estudiantes "+super.toString()+"[curso=" + curso + "]";
	}




	public String getCurso() {
		return curso;
	}




	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	

}
