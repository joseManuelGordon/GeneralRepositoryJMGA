package EJERCIOCIOconScanner;

public class Persona {
	String nombre;
	String apellido;
	int edad ;
	boolean mayor18 ;
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	public Persona (String nombre, String apellido,int edad, boolean mayor18) {
		this.nombre = nombre;
		this.apellido= apellido;
		this.edad=edad;
		this.mayor18=mayor18;
	}
	//.splin para separar
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isMayor18() {
		return mayor18;
	}
	public void setMayor18(boolean mayor18) {
		this.mayor18 = mayor18;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", mayor18=" + (mayor18 ? "si": "no" )+ "]";
	}

}
