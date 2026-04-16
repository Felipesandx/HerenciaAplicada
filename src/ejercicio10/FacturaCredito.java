package ejercicio10;

public class FacturaCredito extends Factura {
	
	private double recargo;
	private int cuotas;
	
	public FacturaCredito(int numero, Cliente cliente, double total, double recargo, int coutas) {
		super(numero, cliente, total);
		this.recargo = recargo;
		this.cuotas = coutas;
	}
	
	@Override
    public double calcularTotal() {//sobrescribir el total
        return total + recargo;
    }
	
	public double valorCuota() {
	    return calcularTotal() / cuotas;
	}

}
