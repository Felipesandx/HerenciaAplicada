package ejercicio7;

public class Moto extends Vehiculo{
	
	protected int cilindrada;

	public Moto(String marca, double velocidad, int cilindrada) {
		super(marca, velocidad);
		this.cilindrada = cilindrada;
	}
	
	@Override
	public void mostrarInfo() { //sobrescribir para mostrar la cilindrada
		System.out.println("-Motocicleta-");
		System.out.println("Marca: " + marca + ", Velocidad: " + velocidad + ", Cilindrada: " + cilindrada);
	}
	

}
