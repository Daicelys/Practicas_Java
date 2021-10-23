package persona;

import java.util.Scanner;

public class Profesor extends Persona{
	Scanner entrada = new Scanner(System.in);
	private double salario;

	public Profesor(String nombre, int edad) {
		super(nombre, edad);
		this.salario= salario;
	}

	public double devolverSalario() {
		return salario;
	}

	public String dameDescripcion() {
		return " El profesor " +" nombre "+ nombre +" edad: " +edad + " salario "+ salario;
	}
	
}

