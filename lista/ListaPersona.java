package lista;

import java.util.Scanner;
import persona.Persona;
import persona.Estudiante;
import persona.Persona;

public class ListaPersona{

	public ListaPersona() {
		Scanner entrada = new Scanner(System.in);
		int ocupacion;
		String nombre;
		int edad;
		double salario;
		double promedio;	
		int cantPersona;
		System.out.println("Digite el nombre");
		nombre = entrada.nextLine();
		System.out.println("Digite la edad");
		edad = entrada.nextInt();
		System.out.println("Digite 1 si es estudiante o 2 profesor");
		ocupacion = entrada.nextInt();
		if(ocupacion == 1) {
			System.out.println("Digite el promedio");
			promedio = entrada.nextDouble();
		}
		if (ocupacion ==2) {
			System.out.println("Digite el salario");
			salario = entrada.nextDouble();
		}
		
		
	}
	
	
	
	public String dameDescripcion() {
		return "";
	}

	
	
	
	

}
