package proyectoClase1;

public class Coche {
	
	private String marca, matricula, modelo;
	private int matriculacion;
	private double precio;
	public Coche(String marca, String matricula, String modelo, int matriculacion, double precio) {
		
		this.marca = marca;
		this.matricula = matricula;
		this.modelo = modelo;
		this.matriculacion = matriculacion;
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getMatriculacion() {
		return matriculacion;
	}
	public void setMatriculacion(int matriculacion) {
		this.matriculacion = matriculacion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	

}
