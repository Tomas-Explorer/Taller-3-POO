package mundoMagos;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema 
{	
	private static File magos = new File("Magos.txt");
	private static File hechizos = new File("Hechizos.txt");
	private ArrayList<Hechizos> listaHechizos = new ArrayList<>();
	
	public void cargarMagos() 
	{		
		try 
		{
			Scanner m = new Scanner(magos);

			while(m.hasNextLine())
			{
				String linea = m.nextLine();
				
				
			}
		} 
		
		catch (Exception e) 
		{
			System.out.println("Magos.txt no ha sido encontrado, intente nuevamente");
			
		}
	}
	
	public void cargarHechizos() 
	{
		try 
		{
			Scanner h = new Scanner(hechizos);

			while(h.hasNextLine())
			{
				String linea = h.nextLine();
				String[] partes = linea.split(";");
				
				String nombre = partes[0];
				String tipo = partes[1];
				int daño = Integer.parseInt(partes[2]);
				
				switch(tipo) 
				{
					case "Fuego":
						int duracionQuemadura = Integer.parseInt(partes[3]);
						
						listaHechizos.add(new HechizoDeFuego(nombre, tipo, daño, duracionQuemadura));
						break;
						
					case "Tierra":
						int mejoraDefensa = Integer.parseInt(partes[3]);
					
						listaHechizos.add(new HechizoDeTierra(nombre, tipo, daño, mejoraDefensa));
						break;
						
					case "Planta":
						String[] partesPlanta = partes[3].split(",");
						int duracionStun = Integer.parseInt(partesPlanta[0]);
						int cantPlantas = Integer.parseInt(partesPlanta[1]);
						
						listaHechizos.add(new HechizoDePlanta(nombre, tipo, daño, duracionStun, cantPlantas));
						break;
						
					case "Agua":
						String[] partesAgua = partes[3].split(",");
						int cantidadHeal = Integer.parseInt(partesAgua[0]);
						int presionAgua = Integer.parseInt(partesAgua[1]);

						listaHechizos.add(new HechizoDeAgua(nombre, tipo, daño, cantidadHeal, presionAgua));
						break;
				}
			}
		} 
		
		catch (Exception e) 
		{
			System.out.println("Magos.txt no ha sido encontrado, intente nuevamente");
			
		}
	}
}
