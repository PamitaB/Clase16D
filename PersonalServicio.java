package EjercicioD;

public class PersonalServicio extends Personas{

	private int anoCorporacion;
	private int numeroDespacho;
	private String seccion;
	
	PersonalServicio (String nombre, String apellido, String rut, String estadocivil, int anoCorporacion, int numeroDespacho, String seccion){
		super(nombre, apellido, rut, estadocivil);
		this.anoCorporacion = anoCorporacion;
		this.numeroDespacho = numeroDespacho;
		this.seccion = seccion;
			
	}

	public int getAnoCorporacion() {
		return anoCorporacion;
	}

	public void setAnoCorporacion(int anoCorporacion) {
		this.anoCorporacion = anoCorporacion;
	}

	public int getNumeroDespacho() {
		return numeroDespacho;
	}

	public void setNumeroDespacho(int numeroDespacho) {
		this.numeroDespacho = numeroDespacho;
	}

	public String getSeccion() {
		return seccion;
	}

	public void cambiarSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public void reasignacionDespacho(int numeroDespacho) {
		this.numeroDespacho = numeroDespacho;
	}
	
	public void trasladoSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public void imprimir() {
		System.out.println("Datos del Personal de Servicio");
		System.out.println("==============================");
		super.imprimir();
		System.out.println("Año			: "+ anoCorporacion);
		System.out.println("Numero			: "+ numeroDespacho);
		System.out.println("Seccion			: "+ seccion);
		System.out.println(" ");
	}
}
