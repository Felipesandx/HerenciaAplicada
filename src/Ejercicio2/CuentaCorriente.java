package Ejercicio2;

public class CuentaCorriente extends Cuenta{
	
	protected double limiteSobregiro;

	public CuentaCorriente(double saldo, double limiteSobregiro) {
		super(saldo);
		this.limiteSobregiro = limiteSobregiro;
	}
	
	@Override
    public void retirar(double monto) {
        if (saldo - monto >= -limiteSobregiro) {
            saldo -= monto;
            System.out.println("Retiro realizado. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Límite de sobregiro excedido");
        }
	}
	

}
