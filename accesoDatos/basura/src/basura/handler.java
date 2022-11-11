package XmlHandler;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import listaCanciones.Cancion;


public class XMLHandler extends DefaultHandler {
	
	private ArrayList<Cancion>listacanciones= new ArrayList<Cancion>();
	private Cancion cancionactual;
	private String texto;
	
	public XMLHandler() {
		
		listacanciones= new ArrayList<Cancion>();
		
	}
	
	public XMLHandler(ArrayList<Cancion> listacanciones, Cancion cancion, String texto) {
		super();
		this.listacanciones = listacanciones;
		this.cancionactual = cancion;
		this.texto = texto;
	}
	
public void startDocument() {
		
		System.out.println("Documento abierto");
		
	}
public void endDocument() {
	
	System.out.println("acabado");
	System.out.println(listacanciones);
	
}				
public void characters(char[] ch, int start, int lenght) {
	
	texto= new String( ch,  start,  lenght);//constructor de String para texto que no conocemos
	if(!texto.isBlank()) {
		System.out.println("Etiqueta de texto detectada: "+ texto);
		
	}
	
}	
public void startElement(
		String nameSpaceURI,
		String localName,
		String qName,
		Attributes atts
		
		) {
	
	
	System.out.println("Etiqueta: "+ qName);
	
	for (int i = 0; i < atts.getLength(); i++) {
		System.out.println("\t"+atts.getLocalName(i)+ ": "+ atts.getValue(i));
		
	}
	
	if(qName.equals("cancion")) {
		
	
		cancionactual= new Cancion();
		
	}
			
}		
public void endElement(
		String nameSpaceURI,
		String localName,
		String qName
) {
	
	System.out.println("fin de etiqueta: "+ qName);
	
	if(qName.equals("titulo")) {
		cancionactual.setTitulo(qName);
	}else if(qName.equals("artista")){
		cancionactual.setArtistas(qName);
		
	}else if(qName.equals("duracion")) {
		 
        cancionactual.setDuracion(Integer.parseInt(qName));
		
	}
}
			
public void ignorableWhitespace(char[] ch, int start, int lenght) {
	System.out.println("espacio en blancos seguidos");
}			
			
public void skippendEntity(String name) {
	System.out.println("Entiedad saltada");
}			
			
			
			
			
			
			

}
