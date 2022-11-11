package listaCanciones;

import java.util.ArrayList;

public class Listas {
	
	private String nombre;
	private int numeroCanciones;
	private ArrayList<Cancion>listacanciones= new ArrayList<Cancion>();
	
	public Listas() {
		
	}
	
	public Listas(String nombre, int numeroCanciones,ArrayList<Cancion>listacanciones ) {
		
		this.nombre = nombre;
		this.numeroCanciones = numeroCanciones;
		this.listacanciones=listacanciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroCanciones() {
		return numeroCanciones;
	}

	public void setNumeroCanciones(int numeroCanciones) {
		this.numeroCanciones = numeroCanciones;
	}

	public ArrayList<Cancion> getListacanciones() {
		return listacanciones;
	}

	public void setListacanciones(ArrayList<Cancion> listacanciones) {
		this.listacanciones = listacanciones;
	}

	@Override
	public String toString() {
		return "\n====================================================================================================================================================================================================================================================================================================================\n "
				+ "-Nombre: " + nombre + "\n -NumeroCanciones: " + numeroCanciones +"                                                                                                                                                                                                                                                                                                                                                                                                                                                        " 
				+listacanciones +"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ";
	}

	

	
	

}
