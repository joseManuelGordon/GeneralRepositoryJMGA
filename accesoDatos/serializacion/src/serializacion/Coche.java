package serializacion;

import java.io.Serializable;

public class Coche implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String marca;
	private String modelo;
	private String matricula;
	private int matriculacion;
	private double precio;
	public Coche(
			String marca, String modelo, String matricula, int matriculacion, double precio) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.matriculacion = matriculacion;
		this.precio = precio;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
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
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", matriculacion="
				+ matriculacion + ", precio=" + precio + "]";
	}
	
}
