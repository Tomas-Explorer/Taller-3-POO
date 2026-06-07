package mundoMagos;

import java.io.FileNotFoundException;

public class App 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		// Tomás Sabando Jofré.
		// Rut: 22.368.978-7
		// Carrera: I.T.I
		Sistema sistema = new Sistema();
		Menu menu = new Menu(sistema);
		sistema.cargarHechizos();
		sistema.cargarMagos();
		
		System.out.println(sistema.getListaHechizos().size());
		System.out.println(sistema.getListaMagos().size());
		
		menu.elegirMenu();
	}
}
