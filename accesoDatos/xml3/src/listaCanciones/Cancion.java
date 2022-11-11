package listaCanciones;

public class Cancion {
	
	
	private String titulo, artistas;
	private int duracion;
	
	public Cancion() {
		// TODO Auto-generated constructor stub
	}

	
	public Cancion(String titulo, String artistas, int duracion) {
		
		this.titulo = titulo;
		this.artistas = artistas;
		this.duracion = duracion;
	}


	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String nombre) {
		this.titulo = nombre;
	}


	public String getArtistas() {
		return artistas;
	}


	public void setArtistas(String artistas) {
		this.artistas = artistas;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	@Override
	public String toString() {
		return "\n -Canciones:\n   -Nombre: " + titulo + "\n   -Artistas: " + artistas + "\n   -Duracion: " + duracion +"                                                                                                                                                                                                                                                                                                                                          ";
	}
	
	
	
	

}
