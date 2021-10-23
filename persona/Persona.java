package persona;

public abstract class Persona {
	protected String nombre;
	protected int edad;

	public Persona(String nombre,  int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String devolverNombre() {
		return nombre;
	}
	public int devolverEdad() {
			return edad;	
	}
	
	public abstract String dameDescripcion();
}