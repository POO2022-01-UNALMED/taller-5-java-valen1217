package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado = new ArrayList();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	
	public Anfibio() {
		listado.add(this);
	}
	
	public Anfibio(String nom, int edad, String habitat, String gen, String col, Boolean venenoso) {
		super.setNombre(nom);;
		super.setEdad(edad);
		super.setHabitat(habitat);
		super.setGenero(gen);
		this.colorPiel = col;
		this.venenoso = venenoso;
		listado.add(this);
	}
	
	public static int cantidadAnfibios() {
		return listado.size();
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public static Animal crearRana(String nom,int edad,String gen) {
		ranas++;
		Anfibio obj = new Anfibio(nom,edad,"selva",gen,"rojo",true);
		return obj;
	}
	
	public static Animal crearSalamandra(String nom,int edad,String gen) {
		salamandras++;
		Anfibio obj = new Anfibio(nom,edad,"selva",gen,"negro y amarillo",false);
		return obj;
	}

	public String getColorPiel() {
		return this.colorPiel;
	}

	public boolean isVenenoso() {
		return this.venenoso;
	}


	
}
