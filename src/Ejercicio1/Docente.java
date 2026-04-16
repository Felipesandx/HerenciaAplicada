package Ejercicio1;

public class Docente  extends Persona{
	
	protected String especialidad;

	public Docente(String nombre, int edad, String especialidad) {
		super(nombre, edad);
		this.especialidad = especialidad;
	}

	
	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	
	@Override
	public String toString() {
		return "Docente [especialidad=" + especialidad + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}


	@Override
	public void mostrar() {
		System.out.println("Nombre: "+ nombre);
		System.out.println("Edad: "+ edad);
		System.out.println("Especialidad: " + especialidad);
	}
	

}
