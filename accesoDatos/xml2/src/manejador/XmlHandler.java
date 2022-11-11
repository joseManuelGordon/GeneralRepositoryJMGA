package manejador;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import usuarios.Usuario;

public class XmlHandler extends DefaultHandler {
	private ArrayList<Usuario> usuarios;
	private Usuario usuarioactual;
	private String texto;
	public XmlHandler() {
		super();
		usuarios= new ArrayList<Usuario>();
	}
	@Override
	//Este metodo se ejecuta cuando se abre el documento
	public void startDocument() {
		
		System.out.println("el documento se ha abierto");
		
	}
	
	
	
	
	
	@Override
	//Este metodo se ejecuta se cierra el documento
	public void endDocument() {
		
		System.out.println("acabado");
		System.out.println(usuarios);
		
	}
	@Override
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
		
		if(qName.equals("usuario")) {
			usuarioactual= new Usuario();
			
		}
		
	}
		public void endElement(
				String nameSpaceURI,
				String localName,
				String qName
		) {
			
			System.out.println("fin de etiqueta: "+ qName);
			
			if(qName.equals("nombre")) {
				usuarioactual.setNombre(texto);
			}else if(qName.equals("edad")){
				usuarioactual.setEdad(Integer.parseInt(texto));
				
			}else if(qName.equals("fechaRegistro")) {
				 DateTimeFormatter dtf=  DateTimeFormatter.ofPattern("dd/MM/yyyy");
				 LocalDate fechaRegistro= LocalDate.parse(texto, dtf);
				 usuarioactual.setFechaRegistro(fechaRegistro);
				 
			}else if (qName.equals("usuario")) {
				
				usuarios.add(usuarioactual);
				
				
			}
		}
		
	public void ignorableWhitespace(char[] ch, int start, int lenght) {
		System.out.println("espacio en blancos seguidos");
	}
		
	public void skippendEntity(String name) {
		System.out.println("Entiedad saltada");
	}
	
}
	
	
	
	
	
	
	
	

