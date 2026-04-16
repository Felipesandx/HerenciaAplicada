package Ejercicio1;

public class Estudiante extends Persona {
	
	protected int carnet;

	public Estudiante(String nombre, int edad, int carnet) {
		super(nombre, edad);
		this.carnet = carnet;
	}

	public int getCarnet() {
		return carnet;
	}

	public void setCarnet(int carnet) {
		this.carnet = carnet;
	}

	@Override
	public String toString() {
		return "Estudiante [carnet=" + carnet + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + "]";
	}
	
	
	@Override
	public void mostrar() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Carnet: " + carnet);
	}
	
	

}
