package ejercicio4;

public class Bus extends Transporte {
	
	protected String ruta;

	public Bus(int capacidad, String ruta) {
		super(capacidad);
		this.ruta = ruta;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	@Override
	public String toString() {
		return "Bus [ruta=" + ruta + ", getCapacidad()=" + getCapacidad() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + "]";
	}
	
	@Override
	public void descripcion() {//sobreescribir descripcion para que salga ruta tambien
		super.descripcion();//toma el metodo de descripcion anterior, se usó para reutilizar codigo
		System.out.println("Ruta: " + ruta);
	}

}
