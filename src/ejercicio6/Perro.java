package ejercicio6;

public class Perro extends Animal {
	
	private String raza;

	public Perro(String nombre, String raza) {
		super(nombre);
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	
	
	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", getNombre()=" + getNombre() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	@Override
	public void hacerSonido() {
		System.out.println("guau");
	}

}
