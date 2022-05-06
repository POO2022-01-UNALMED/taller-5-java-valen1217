package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	//private Zona zona[];
	private ArrayList<Zona> zona = new ArrayList();
	
	
	public  Zoologico() {
		
	}
	
	public Zoologico(String nom, String dir) {
		this.nombre = nom;
		this.ubicacion = dir;
	}
	
	public void agregarZonas(Zona zon) {
		zona.add(zon);
	}
	
	public int cantidadTotalAnimales() {
		int cant = 0;
		for(Zona zon: zona) {
			cant = cant + zon.cantidadAnimales();
		}
		return cant;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public ArrayList<Zona> getZona() {
		return this.zona;
	}
	
	
	

}
