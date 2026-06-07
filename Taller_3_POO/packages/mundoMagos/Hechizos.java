package mundoMagos;

public abstract class Hechizos implements Puntaje
{
	private String nombreHechizo;
	private String tipo;
	private int daño;
	
	public Hechizos(String nombreHechizo, String tipo, int daño) {
		super();
		this.nombreHechizo = nombreHechizo;
		this.tipo = tipo;
		this.daño = daño;
	}

	public String getNombreHechizo() {
		return nombreHechizo;
	}

	public String getTipo() {
		return tipo;
	}

	public int getDaño() {
		return daño;
	}
}
