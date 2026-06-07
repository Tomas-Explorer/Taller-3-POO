package mundoMagos;

public class HechizoDeAgua extends Hechizos
{
	private int cantidadHeal;
	private int presionAgua;
	
	public HechizoDeAgua(String nombreHechizo, String tipo, int daño, int cantidadHeal, int presionAgua) {
		super(nombreHechizo, tipo, daño);
		this.cantidadHeal = cantidadHeal;
		this.presionAgua = presionAgua;
	}

	public double calcularPuntaje() 
	{
		return (getDaño() + cantidadHeal + presionAgua) * 2;
		 
	}
	
}
