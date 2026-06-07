package mundoMagos;

import java.util.Scanner;

public class Menu 
{
	
	public static void elegirMenu() 
	{
		boolean continuar = true;
		Scanner s = new Scanner(System.in);
		int input = 0;
		
		do 
		{
			System.out.println("Elija el menú al que desea acceder:");
			System.out.println("1. Menú Administrador.");
			System.out.println("2. Menú Analista.");
			System.out.println("3. Salir.");
			System.out.print("> ");
			try 
			{
				input = s.nextInt();
			
			} 
			
			catch (Exception e) 
			{
				System.out.println("Opción inválida, intente nuevamente.");
				System.out.println();
				s.nextLine();

			}
			
			switch(input) 
			{
				case 1:
					mostrarMenuAdministrador();
					
				case 2:
					mostrarMenuAnalista();
				
				case 3:
					continuar = false;
								
			}
		} while (continuar);
		
	}
	
	public static void mostrarMenuAdministrador() 
	{
		boolean continuar = true;
		Scanner s = new Scanner(System.in);
		int input = 0;
		
		do 
		{
			System.out.println("Bienvenido al menú administrador");
			System.out.println("¿Qué acción desea realizar?");
			System.out.println("1. Agregar Mago");
			System.out.println("2. Modificar Mago");
			System.out.println("3. Eliminar Mago");
			System.out.println("4. Agregar Hechizo");
			System.out.println("5. Modificar Hechizo");
			System.out.println("6. Eliminar Hechizo");
			System.out.println("7. Regresar");
			System.out.println("> ");

			
			try 
			{
				input = s.nextInt();
			
			} 
			
			catch (Exception e) 
			{
				System.out.println("Opción inválida, intente nuevamente.");
				System.out.println();
				s.nextLine();
				
			}
			
			switch(input) 
			{
				case 1:
					
				case 2:
					
				case 3:
					
				case 4:
					
				case 5:
					
				case 6:
					
				case 7:
					elegirMenu();
					break;
					
			}
		} while (continuar);
	}
	
	public static void mostrarMenuAnalista() 
	{
		
	}
}
