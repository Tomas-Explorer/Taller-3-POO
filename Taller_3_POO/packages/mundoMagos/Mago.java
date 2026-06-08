package mundoMagos;

import java.util.ArrayList;

public class Mago 
{	
	private String nombre;
	private ArrayList<Hechizo> hechizos;
	
	public Mago(String nombre, ArrayList<Hechizo> hechizos) 
	{
		this.nombre = nombre;
		this.hechizos = hechizos;
	
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Hechizo> getHechizos() {
		return hechizos;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
