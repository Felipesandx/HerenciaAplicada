package Ejercicio2;

public class Cuenta {
	protected double saldo;

	public Cuenta(double saldo) {
		super();
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + "]";
	}

	public void retirar(double monto) {
	    if (saldo >= monto) {
	        saldo -= monto;
	    } else {
	        System.out.println("Saldo insuficiente");
	    }
	}
	
	

}
