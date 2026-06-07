package mundoMagos;

public class HechizoDeTierra extends Hechizo
{
	private int mejoraDefensa;

	public HechizoDeTierra(String nombreHechizo, String tipo, int daño, int mejoraDefensa) {
		super(nombreHechizo, tipo, daño);
		this.mejoraDefensa = mejoraDefensa;
	}

	public double calcularPuntaje() 
	{
		return (getDaño() * mejoraDefensa)/2;
		
	}
}
