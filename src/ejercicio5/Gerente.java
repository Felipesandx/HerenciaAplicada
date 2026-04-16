package ejercicio5;

public class Gerente extends Empleado{
	
	protected double bonoAdicional;

	public Gerente(String nombre, double salario, double bonoAdicional) {
		super(nombre, salario);
		this.bonoAdicional = bonoAdicional;
	}

	public double getBonoAdicional() {
		return bonoAdicional;
	}

	public void setBonoAdicional(double bonoAdicional) {
		this.bonoAdicional = bonoAdicional;
	}

	@Override
	public String toString() {
		return "Gerente [bonoAdicional=" + bonoAdicional + ", getNombre()=" + getNombre() + ", getSalario()="
				+ getSalario() + ", toString()=" + super.toString() + ", calcularSalario()=" + calcularSalario()
				+ ", getClass()=" + getClass() + "]";
	}
	
	@Override
	public double calcularSalario() {//Sobrescribir el metodo para sumar el bono
		return salario + bonoAdicional;
	}

}
