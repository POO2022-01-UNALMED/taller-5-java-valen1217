package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
	private static ArrayList<Pez> listado = new ArrayList();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
	  listado.add(this);
	}
	
	public Pez(String nom, int edad, String habitat, String gen, String col, int cant) {
		super.setNombre(nom);;
		super.setEdad(edad);
		super.setHabitat(habitat);
		super.setGenero(gen);
		this.colorEscamas = col;
		this.cantidadAletas = cant;
		listado.add(this);
	}
	
	
	public static int cantidadPeces() {
		return listado.size();
	}
	
	public String movimiento(){
		return "nadar";
	}
	
	
	public static Pez crearSalmon(String nom,int edad,String gen) {
		Pez obj = new Pez(nom,edad,"oceano",gen,"rojo",6);
		salmones ++;
		return obj;
	
	}
	
	public static Pez crearBacalao(String nom,int edad,String gen) {
		Pez obj = new Pez(nom,edad,"oceano",gen,"gris",6);
		bacalaos++;
		return obj;
	}

	public Object getColorEscamas() {
		return this.colorEscamas;
	}

	public int getCantidadAletas() {
		return this.cantidadAletas;
	}

}
