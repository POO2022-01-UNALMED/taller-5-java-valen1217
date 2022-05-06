package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado = new ArrayList();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
         listado.add(this);
	}
	
	public Mamifero(String nom, int edad, String habitat, String gen,Boolean pelaje, int patas ) {
		super.setNombre(nom);;
		super.setEdad(edad);
		super.setHabitat(habitat);
		super.setGenero(gen);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
		
	}
	
	
	public  String movimiento() {
		return "desplazarse";
	}
	
	public static int cantidadMamiferos() {
		return listado.size();
	}
	
	
	public static Animal crearCaballo(String nom,int edad,String gen) {
		caballos++;
		Mamifero obj = new Mamifero(nom,edad, "pradera", gen, true,4);
		return obj;
	}
	
	public static Animal crearLeon(String nom,int edad,String gen) {
		leones ++;
		Mamifero obj = new Mamifero(nom,edad, "selva", gen, true,4);
		return obj;
	}

	public int getPatas() {
		return this.patas;
	}

	public boolean isPelaje() {
		return this.pelaje;
	}
	
	
}
