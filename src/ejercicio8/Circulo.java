package ejercicio8;

public class Circulo extends Figura{
	
	protected double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}
	
	@Override
    public double calcularArea() {//sobrescribir el metodo abstracto
        return Math.PI * radio * radio;//formula para el area del circulo

    }
	

}
