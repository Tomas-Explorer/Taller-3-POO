package mundoMagos;

import java.io.File;
import java.util.Scanner;

public class Sistema 
{	
	private static File magos = new File("Magos.txt");
	private static File hechizos = new File("Hechizos.txt");
	
	public static void cargarMagos() 
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
	
	public static void cargarHechizos() 
	{
	
			
	
	}
}
