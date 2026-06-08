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
							System.out.print("> ");
							
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
					System.out.println("Mago creado con éxito.");
					
					break;
				
				case 2:					
					System.out.print("Nombre del mago a modificar: ");
					String nombreBuscar = s.nextLine();
				    Mago magoAModificar = sistema.buscarMago(nombreBuscar);
				    
				    if (magoAModificar == null) 
				    {
				    	System.out.println("No se ha encontrado al mago.");
				    	System.out.println();
				    	break;
				    }
				    
				    System.out.println();
				    System.out.println("¿Qué desea hacer?");
				    System.out.println("1. Modificar nombre del mago");
				    System.out.println("2. Modificar hechizos del mago");
				    System.out.println("3. Ambos");
				    System.out.print("> ");
				    
				    int opcion = s.nextInt();
				    s.nextLine();
				    System.out.println();
				    
				    if (opcion == 1 || opcion == 3) 
				    {
				        System.out.print("Nuevo nombre del mago: ");
				        magoAModificar.setNombre(s.nextLine());
				        
				    }
				    
				    if (opcion == 2 || opcion == 3) 
				    {
				        magoAModificar.getHechizos().clear();
				        boolean pararModificar = false;

				        do 
				        {
				            System.out.print("Hechizo a agregar: ");
				            String hechizo = s.nextLine();
				            Hechizo encontrado = sistema.buscarHechizo(hechizo);

				            if (encontrado != null) 
				            {
				                magoAModificar.getHechizos().add(encontrado);
				                System.out.println("Hechizo agregado correctamente.");
				                
				                System.out.println();
				                System.out.println("¿Qué desea hacer?");
				                System.out.println("1. Agregar otro hechizo");
				                System.out.println("2. Salir");
				                System.out.print("> ");
				                
				                int op = s.nextInt();
				                s.nextLine();
				                
				                if (op == 2) pararModificar = true;
				            } 
				            
				            else 
				            {
				                System.out.println("Hechizo no encontrado.");
				                System.out.println();
				            }
				            
				        } while (!pararModificar);
				    }

				    sistema.guardarMago();
				    System.out.println();
				    System.out.println("Mago modificado con éxito.");
				    
					break;
					
				case 3:
					System.out.print("Nombre del mago a eliminar: ");
				    String nombreEliminar = s.nextLine();
				    
				    Mago magoAEliminar = sistema.buscarMago(nombreEliminar);

				    if (magoAEliminar == null) 
				    {
				        System.out.println("No se ha encontrado al mago.");
				        System.out.println();
				        break;
				        
				    }

				    sistema.getListaMagos().remove(magoAEliminar);
				    sistema.guardarMago();
				    System.out.println("Mago eliminado con éxito.");
				    System.out.println();
				    break;
				    
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					continuar = false;
					break;
					
			}
		} while (continuar);
	}
	
	public void mostrarMenuAnalista() 
	{
		Scanner s = new Scanner(System.in);
		boolean continuar = true;
	    int input = 0;

	    System.out.println("Bienvenido al menú analista");
	    do 
	    {
	        System.out.println("¿Qué acción desea realizar?");
	        System.out.println("1. Top 10 Mejores Hechizos");
	        System.out.println("2. Top 3 Mejores Magos");
	        System.out.println("3. Mostrar todos los Hechizos");
	        System.out.println("4. Mostrar todos los Magos");
	        System.out.println("5. Mostrar todos los Hechizos con puntuación");
	        System.out.println("6. Mostrar todos los Magos junto a su puntuación");
	        System.out.println("7. Regresar");
	        System.out.print("> ");

	        try 
	        {
	            input = s.nextInt();
	            s.nextLine();
	            
	        } catch (Exception e) 
	        {
	            System.out.println("Opción inválida.");
	            s.nextLine();
	            System.out.println();
	            
	        }

	        switch(input) {
	        	case 1:
	                break;
	            case 2:
	                break;
	            case 3:
	                sistema.mostrarHechizos();
	                System.out.println();
	                break;
	            case 4:
	                sistema.mostrarMagos();
	                System.out.println();
	                break;
	            case 5:
	                sistema.mostrarHechizosConPuntaje();
	                System.out.println();
	                break;
	            case 6:
	                sistema.mostrarMagosJuntoPuntaje();
	                System.out.println();
	                break;
	            case 7:
	                continuar = false;
	                break;
	        }
	    } while (continuar);
	}
	

	public Menu(Sistema sistema) {
		this.sistema = sistema;
	}
}
