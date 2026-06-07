package mundoMagos;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu 
{
	private Sistema sistema;
	private Scanner s = new Scanner(System.in);
	
	public void elegirMenu() 
	{
		boolean continuar = true;
		int input = 0;
		
		while (continuar)
		{
			System.out.println("Elija el menú al que desea acceder:");
			System.out.println("1. Menú Administrador.");
			System.out.println("2. Menú Analista.");
			System.out.println("3. Salir.");
			System.out.print("> ");
			try 
			{
				input = s.nextInt();
				System.out.println();
				s.nextLine();
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
					break;
				
				case 2:
					mostrarMenuAnalista();
					break;
				
				case 3:
					continuar = false;
					break;	
					
			}
		}
		
	}
	
	public void mostrarMenuAdministrador() 
	{
		boolean continuar = true;
		int input = 0;
		
		System.out.println("Bienvenido al menú administrador");
		do 
		{
			System.out.println("¿Qué acción desea realizar?");
			System.out.println("1. Agregar Mago");
			System.out.println("2. Modificar Mago");
			System.out.println("3. Eliminar Mago");
			System.out.println("4. Agregar Hechizo");
			System.out.println("5. Modificar Hechizo");
			System.out.println("6. Eliminar Hechizo");
			System.out.println("7. Regresar");
			System.out.print("> ");

			
			try 
			{
				input = s.nextInt();
				s.nextLine();
				System.out.println();
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
					System.out.print("Nombre del nuevo mago: ");
					String nombre = s.nextLine();
					
					boolean parar = false;
					
					ArrayList<Hechizo> listaTemporalHechizos = new ArrayList<>();
						
					do {
						System.out.print("¿Que hechizo desea agregarle? ");
						String hechizo = s.nextLine();
							
						if (sistema.buscarHechizo(hechizo) != null) 
						{
							listaTemporalHechizos.add(sistema.buscarHechizo(hechizo));
							
							System.out.println("¿Desea agregar otro hechizo? ");
							System.out.println("1. Si");
							System.out.println("2. No");
								
							int opcion = s.nextInt();
							s.nextLine();
							
							switch(opcion)
							{
								case 1:
									continue;
									
								case 2:
									parar = true;
									break;
								default:
									System.out.println("Opción inválida, ingrese nuevamente");
									opcion = s.nextInt();
									break;
									
							}
						}
						else 
						{
							System.out.println("Hechizo no encontrado, intente nuevamente.");
							continue;
						}
							
					} while (!parar);
					
					sistema.agregarMago(nombre, listaTemporalHechizos);
					System.out.println(sistema.getListaMagos().size());
					
					
				case 2:
					
				case 3:
					
				case 4:
					
				case 5:
					
				case 6:
					
				case 7:
					continuar = false;
					break;
					
			}
		} while (continuar);
	}
	
	public static void mostrarMenuAnalista() 
	{
	}

	public Menu(Sistema sistema) {
		this.sistema = sistema;
	}
}
