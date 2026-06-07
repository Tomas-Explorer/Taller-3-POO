package mundoMagos;

public class HechizoDeFuego extends Hechizo
{
	private int duracionQuemadura;

	public HechizoDeFuego(String nombreHechizo, String tipo, int daño, int duracionQuemadura) 
	{
		super(nombreHechizo, tipo, daño);
		this.duracionQuemadura = duracionQuemadura;
		
	}
	
	@Override
	public double calcularPuntaje() 
	{
		return getDaño() * duracionQuemadura;
		
	}

}
