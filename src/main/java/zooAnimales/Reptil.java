package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado = new ArrayList();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int LargoCola;
	
	public Reptil() {
	 listado.add(this);	
	}
	
	public Reptil(String nom, int edad, String habitat, String gen, String col, int largo) {
		super.setNombre(nom);;
		super.setEdad(edad);
		super.setHabitat(habitat);
		super.setGenero(gen);
		this.colorEscamas = col;
		this.LargoCola = largo;
		listado.add(this);
	}
	
	public static int cantidadReptiles() {
		return listado.size();
	}
	
	public String movimiento(){
		return "reptar";
	}
	
	public static Animal crearIguana(String nom,int edad,String gen) {
		Reptil obj = new Reptil(nom,edad,"humedal",gen,"verde",3);
		iguanas ++;
		return obj;
	}
	
	public static Animal crearSerpiente(String nom,int edad,String gen) {
		serpientes++;
		Reptil obj = new Reptil(nom,edad,"jungla",gen,"blanco",1);
		return obj;
	}

	public String getColorEscamas() {
		return this.colorEscamas;
	}

	public int getLargoCola() {
		return this.LargoCola;
	}
}
