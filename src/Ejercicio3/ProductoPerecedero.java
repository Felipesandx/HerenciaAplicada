package Ejercicio3;

import java.time.LocalDate;

public class ProductoPerecedero extends Producto {
	
	protected LocalDate fechaVencimiento;//tipo de dato que podemos utilizar debido a la librería localDate

	public ProductoPerecedero(String nombre, double precio, LocalDate fechaVencimiento) {
		super(nombre, precio);
		this.fechaVencimiento = fechaVencimiento;
	}
	
	public boolean estaVencido() {
		return LocalDate.now().isAfter(fechaVencimiento);//isAfter = es despues
				
	}

}
