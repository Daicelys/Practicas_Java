package persona;
import java.util.Scanner;
public class Estudiante extends Persona{
	private  double promedio;
	Scanner entrada = new Scanner(System.in);
	public Estudiante(String nombre, int edad) {
		super(nombre, edad);
		this.promedio= promedio; 	
	}
	
	public double devolverProm() {
		return promedio;	
	}
	
	public String dameDescripcion() {
		return "El profesor " +" nombre "+ nombre +" edad: "+ edad + " promedio "+ promedio;
	}
	
}


