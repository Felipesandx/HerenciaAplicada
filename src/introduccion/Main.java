package introduccion;
import java.util.Scanner;
import java.time.LocalDate;//libreria para utilizar fechas

import Ejercicio1.Docente;
import Ejercicio1.Estudiante;
import Ejercicio1.Persona;
import Ejercicio2.Cuenta;
import Ejercicio2.CuentaCorriente;
import Ejercicio3.ProductoPerecedero;
import ejercicio10.Cliente;
import ejercicio10.FacturaContado;
import ejercicio10.FacturaCredito;
import ejercicio4.Bus;
import ejercicio4.Transporte;
import ejercicio5.Empleado;
import ejercicio5.Gerente;
import ejercicio6.Animal;
import ejercicio6.Perro;
import ejercicio7.Moto;
import ejercicio7.Vehiculo;
import ejercicio8.Circulo;
import ejercicio8.Rectangulo;
import ejercicio9.Libro;
import ejercicio9.LibroDigital;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n - MENÚ DE EJERCICIOS - ");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Ejercicio 6");
            System.out.println("7. Ejercicio 7");
            System.out.println("8. Ejercicio 8");
            System.out.println("9. Ejercicio 9");
            System.out.println("10. Ejercicio 10");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 6:
                    ejercicio6();
                    break;
                case 7:
                    ejercicio7();
                    break;
                case 8:
                    ejercicio8();
                    break;
                case 9:
                    ejercicio9();
                    break;
                case 10:
                    ejercicio10();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);

        sc.close();
	}
	
	public static void ejercicio1(){
		
		//Caso de pruba para probar el metodo "mostrar"
		Persona p1 = new Persona("Juan", 20);
		Docente doc1 = new Docente ("Felipe", 21, "Ingeniería");
		Estudiante est1 = new Estudiante("Sofia", 19, 10985);
		
		p1.mostrar();
		doc1.mostrar();
		est1.mostrar();
		
		
	}
	public static void ejercicio2() {
		
		Cuenta c1 = new Cuenta(100);
		CuentaCorriente cc1 = new CuentaCorriente(100, 200);

		//retiros desde la cuenta sin sobregiro
		System.out.println("Cuenta normal");
		c1.retirar(50);
		c1.retirar(150);
		System.out.println(c1.getSaldo());
		
		//retiros desde la cuenta con sobregiro y limite
		System.out.println("\nCuenta corriente");
		cc1.retirar(150);
		cc1.retirar(200);
		cc1.retirar(100);
		
	}
	public static void ejercicio3() {
		ProductoPerecedero p = new ProductoPerecedero("Leche",10.5, LocalDate.of(2026, 4, 16));//introduce una fecha

			if (p.estaVencido()) {
			    System.out.println("El producto está vencido");
			} else {
			    System.out.println("El producto está vigente");
			}
	}
	
	public static void ejercicio4() {
		Transporte t1 = new Transporte(50);
		Bus b1 = new Bus(40, "Centro - Universidad");

		t1.descripcion();
		b1.descripcion();
	}
	
	public static void ejercicio5() {
		
		Empleado e1 = new Empleado("Carlos", 3000);
		Gerente g1 = new Gerente("Ana", 5000, 1500);
		//comprobar salario
		System.out.println("Salario empleado: " + e1.calcularSalario());
		System.out.println("Salario gerente: " + g1.calcularSalario());
		
	}
	
	public static void ejercicio6() {
		Animal a = new Animal("Perro");
		Perro p = new Perro("Ted", "Labrador");

		a.hacerSonido();
		p.hacerSonido();
	}
	
	public static void ejercicio7() {
		
		Vehiculo v = new Vehiculo("Toyota", 210);
		Moto m = new Moto("Honda", 190, 110);
		
		v.mostrarInfo();
		m.mostrarInfo();
	}
	
	public static void ejercicio8() {
		Rectangulo r = new Rectangulo(5, 3);
		Circulo c = new Circulo(2);

		System.out.println(r.calcularArea());
		System.out.println(c.calcularArea());
	}
	
	public static void ejercicio9() {
		Libro l1 = new Libro("Vientos de invierno", "George R.R Martin"
				+ "");
		LibroDigital ld1 = new LibroDigital("Clean Code", "Robert C. Martin", 5.2);

		l1.mostrarInfo();
		ld1.mostrarInfo();
	}
	
	public static void ejercicio10() {
        Cliente c1 = new Cliente("Juan Perez", 1234567-8);

        FacturaContado fc = new FacturaContado(1, c1, 1000, 150);

        FacturaCredito fcr = new FacturaCredito(2, c1, 2000, 300, 5);

        // Mostrar resultados
        System.out.println(" - FACTURA CONTADO - ");
        System.out.println("Cliente: " + c1.getNombre());
        System.out.println("Total original: 1000");
        System.out.println("Total con descuento: " + fc.calcularTotal());

        System.out.println("\n - FACTURA CRÉDITO -");
        System.out.println("Cliente: " + c1.getNombre());
        System.out.println("Total original: 2000");
        System.out.println("Total con recargo: " + fcr.calcularTotal());
        System.out.println("Pago por cuota: " + (fcr.valorCuota()));
        
	}
	

}
