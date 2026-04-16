package ejercicio4;

public class Transporte {
	
	protected int capacidad;

	public Transporte(int capacidad) {
		super();
		this.capacidad = capacidad;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Transporte [capacidad=" + capacidad + "]";
	}
	
	public void descripcion() {
	        System.out.println("Capacidad: " + capacidad + "\n");
	    }

}
