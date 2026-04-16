package ejercicio10;

public abstract class Factura {// abstracta por que una factura generica no tiene logica de calculo
	
	private int numero;
	private Cliente cliente;
	protected double total;
	
	public Factura(int numero, Cliente cliente, double total) {
		this.numero = numero;
		this.cliente = cliente;
		setTotal(total);
	}
	
	

	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}


	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public double getTotal() {
		return total;
	}



	public void setTotal(double total) {
		if(total >= 0) {
			this.total = total;
		}else {
			this.total = 0;
		}
	}
	
	public abstract double calcularTotal();{
		
	}
	
}
