package mundoMagos;

public class HechizoDePlanta extends Hechizo
{
	private int duracionStun;
	private int cantPlantas;
	
	
	public HechizoDePlanta(String nombreHechizo, String tipo, int daño, int duracionStun, int cantPlantas) {
		super(nombreHechizo, tipo, daño);
		this.duracionStun = duracionStun;
		this.cantPlantas = cantPlantas;
	}


	public double calcularPuntaje() 
	{
		return getDaño() + (duracionStun + cantPlantas);
		
	}


	public int getDuracionStun() {
		return duracionStun;
	}


	public int getCantPlantas() {
		return cantPlantas;
	}
}
