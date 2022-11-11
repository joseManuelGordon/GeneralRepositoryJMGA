package xml2;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import manejador.XmlHandler;

public class MainReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = null;
		XmlHandler handler;
		
			try {
				try {
					parser = factory.newSAXParser();
				} catch (ParserConfigurationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			     handler =new XmlHandler();
			
		
				parser.parse(new File("usuarios.xml"), handler);
			} catch (SAXException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	
			}
}