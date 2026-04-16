package ejercicio10;

public class FacturaContado extends Factura{
	private double descuento;

	public FacturaContado(int numero, Cliente cliente, double total, double descuento) {
		super(numero, cliente, total);
		this.descuento = descuento;
	}
	
	 @Override
	    public double calcularTotal() {//sobrescribir el calculo del total
	        double totalFinal = total - descuento;
	        return Math.max(totalFinal, 0); //para evitar negativos
	    }

}
