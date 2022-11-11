package crearUsuariosSAX;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<User>usuarios= new ArrayList<User>();
		XMLOutputFactory xof = XMLOutputFactory.newInstance();
		XMLStreamWriter xsw;
		
		usuarios.add(new User("jose",32,LocalDate.of(2005,2, 13)));
		usuarios.add(new User("luisa",56,LocalDate.of(2003,6, 23)));	
		usuarios.add(new User("Miguel",69,LocalDate.of(2010,8, 3)));
		
		try {
			xsw=xof.createXMLStreamWriter(new FileWriter("user.xml"));
			//inicio documento con prologo con salto de linea
			
			xsw.writeStartDocument();
			//salto de linea entre el prologo y el elememto raiz
			xsw.writeCharacters("\n");
			//etiqueta de inicio de usuarios
			xsw.writeStartElement("usuarios");
			for(User u : usuarios) {
				
				xsw.writeCharacters("\n\t");
				xsw.writeStartElement("usuario");
				//nombre
				xsw.writeCharacters("\n\t\t");
				xsw.writeStartElement("nombre");
				xsw.writeCharacters(u.getNombre());
				xsw.writeEndElement();
				//edad
				xsw.writeCharacters("\n\t\t");
				xsw.writeStartElement("edad");
				xsw.writeCharacters(""+u.getEdad());
				xsw.writeEndElement();
				//fechaRegistro
				xsw.writeCharacters("\n\t\t");
				xsw.writeStartElement("fechaRegistro");
				xsw.writeCharacters(u.getFechaRegistro().toString());
				xsw.writeEndElement();
				//fin de usuario
				xsw.writeCharacters("\n\t");
				xsw.writeEndElement();
				
			}
		
			xsw.writeCharacters("\n");
			
			//cerramos el documento
			xsw.writeEndDocument();
			//materializar en el archivo real
			xsw.flush();
			xsw.close();
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
