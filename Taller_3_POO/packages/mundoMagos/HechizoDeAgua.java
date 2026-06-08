package mundoMagos;

public class HechizoDeAgua extends Hechizo
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

	public int getCantidadHeal() {
		return cantidadHeal;
	}

	public int getPresionAgua() {
		return presionAgua;
	}
}
