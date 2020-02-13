package EjercicioD;
import java.time.LocalDate;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estudiantes estudiante1=new Estudiantes ("Juan", "Rojas", "78936732-0", "Casado", "Filosofia");
		estudiante1.imprimir();
		System.out.println("");
		
		//reasignar Curso de estudiante
		estudiante1.setCurso("Antropologia");
		estudiante1.imprimir();
		System.out.println("");
		
		LocalDate fec = LocalDate.of(2010, 4, 5);
		
		Profesores profe2 = new Profesores("Franklin", "Soto", "2334435345-7", "Soltero", "Filosofia", fec, 22);
		profe2.imprimir();
		
		//Reasignar despacho de profesor
		profe2.setDespacho(23);
		
		System.out.println("");
		profe2.cambiarDepartamento("Sociologia");
		profe2.imprimir();
		System.out.println("");
		
		PersonalServicio aux1=new PersonalServicio("Juan", "Perez", "73532729-0", "Casado", 1990, 34,  "Administracion");
		aux1.imprimir();
		System.out.println("");
		aux1.cambiarSeccion("Biblioteca");
		aux1.imprimir();
	}
}
