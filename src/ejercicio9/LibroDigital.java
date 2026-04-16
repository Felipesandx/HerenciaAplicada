package ejercicio9;

public class LibroDigital extends Libro {
	private double tamañoMB;

	public LibroDigital(String titulo, String autor, double tamañoMB) {
		super(titulo, autor);
		this.tamañoMB = tamañoMB;
	}
	
	@Override
    public void mostrarInfo() {//sobreescribir el metodo de impresion
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Tamaño: " + tamañoMB + " MB");
    }
	
	

}
