package ejercicio10;

public class Cliente {
	
	private String nombre;
	private int NIT;
	
	public Cliente(String nombre, int nIT) {
		super();
		this.nombre = nombre;
		NIT = nIT;
	}

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getNIT() {
		return NIT;
	}



	public void setNIT(int nIT) {
		NIT = nIT;
	}



	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", NIT=" + NIT + "]";
	}
	
	
	
	
}
