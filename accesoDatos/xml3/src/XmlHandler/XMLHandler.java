package XmlHandler;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import listaCanciones.Cancion;
import listaCanciones.Listas;


public class XMLHandler extends DefaultHandler {
	
	private ArrayList<Cancion>listacanciones= new ArrayList<Cancion>();
	private ArrayList<Listas>lista= new ArrayList<Listas>();
	private Listas list= new Listas();
	private Cancion cancionactual;
	private String texto;
	
	public XMLHandler() {
		
		listacanciones= new ArrayList<Cancion>();
		
	}
	
	public XMLHandler(ArrayList<Listas>lista, Cancion cancion, String texto) {
		this.lista = lista;
		this.cancionactual = cancion;
		this.texto = texto;
	}
	
public void startDocument() {
		
	//System.out.println("Documento abierto");
		
	}
public void endDocument() {
	
	//System.out.println("Documento Cerrado");
	
}				
public void characters(char[] ch, int start, int lenght) {
	
	texto= new String( ch,  start,  lenght);//constructor de String para texto que no conocemos
	if(!texto.isBlank()) {
		//System.out.println("Etiqueta de texto detectada: "+ texto);
		
	}
	
}	
public void startElement(
		String nameSpaceURI,
		String localName,
		String qName,
		Attributes atts
		
		) {
	
	
	//System.out.println("Etiqueta: "+ qName);
	
	for (int i = 0; i < atts.getLength(); i++) {
		//System.out.println("\t"+atts.getLocalName(i)+ ": "+ atts.getValue(i));
		
	}
	
	if(qName.equals("lista")) {
		 lista= new ArrayList<Listas>();	}
	else if(qName.equals("canciones")){
		 listacanciones= new ArrayList<Cancion>();
		
	}
	else if(qName.equals("cancion")) {
		
		cancionactual= new Cancion();
		listacanciones.add(cancionactual);

	}
			
}		
public void endElement(
		String nameSpaceURI,
		String localName,
		String qName
) {
	
	//System.out.println("fin de etiqueta: "+ qName);
	
   if(qName.equals("nombre")) {
		list.setNombre(texto);
	}else if(qName.equals("numeroCanciones")) {
		list.setNumeroCanciones(Integer.parseInt(texto));
	}
   
	else if(qName.equals("titulo")) {
		cancionactual.setTitulo(texto);
	}else if(qName.equals("artista")){
		cancionactual.setArtistas(texto);
		
	}else if(qName.equals("duracion")) {
		 
        cancionactual.setDuracion(Integer.parseInt(texto));
		
	}
	else if (qName.equals("canciones")) {
		listacanciones.add(cancionactual);
		list.setListacanciones(listacanciones);
	}
	else if (qName.equals("lista")){
		
		lista.add(list);
		System.out.println(lista);
	}
	
		
}
			
public void ignorableWhitespace(char[] ch, int start, int lenght) {
	//System.out.println("espacio en blancos seguidos");
}			
			
public void skippendEntity(String name) {
	//System.out.println("Entiedad saltada");
}			
			
			
			
			
			
			

}
