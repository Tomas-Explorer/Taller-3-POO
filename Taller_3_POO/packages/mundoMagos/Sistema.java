package mundoMagos;

import java.io.File;
import java.util.Scanner;

public class Sistema 
{	
	public static void cargarMagos() 
	{
		try {
		File magos = new File("Magos.txt");
		Scanner m = new Scanner(magos);
		
		} 
		
		catch (Exception e) 
		{
			System.out.println("Magos.txt no ha sido encontrado, intente nuevamente");
			
		}
		
	}
}
