package doomXml;

import java.util.GregorianCalendar;

public class Persona {
	private String nombre, apellidos;
	private int id;
	private GregorianCalendar nacimiento;
	public Persona(String nombre, String apellidos, int id, GregorianCalendar nacimiento) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.id = id;
		this.nacimiento = nacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public GregorianCalendar getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(GregorianCalendar nacimiento) {
		this.nacimiento = nacimiento;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", id=" + id + ", nacimiento=" + nacimiento
				+ "]";
	}
	
	
	

}
