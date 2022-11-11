package doomXml;



import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DocumentBuilderFactory dbf =  DocumentBuilderFactory.newDefaultInstance();//nos devuelve un ojeto basico construido
        DocumentBuilder db;
        Document doc;
        File archivoXml;
        String path= "personas.xml";
        XPath xPath;
        NodeList nodos;
        ArrayList<Persona> persona=new ArrayList<Persona>();
		try {
			 db= dbf.newDocumentBuilder();
			 archivoXml =new File(path);
			 doc=db.parse(archivoXml);
			 
			 doc.normalizeDocument();
			 xPath= XPathFactory.newInstance().newXPath();
			 
			 nodos=(NodeList) xPath.compile("//persona").evaluate(doc, XPathConstants.NODESET);
			 
			 for(int i = 0; i< nodos.getLength(); i++) {
				 Element e= (Element)nodos.item(i);
				 System.out.println(e.getTagName());
				 System.out.println(e.getAttribute("id"));				 
				 System.out.println(e.getElementsByTagName("nombre").item(0).getTextContent());
				 System.out.println(e.getElementsByTagName("apellidos").item(0).getTextContent());
				 System.out.println(e.getElementsByTagName("nacimiento").item(0).getTextContent());
				 
				 persona.add(new Persona(e.getElementsByTagName("nombre").item(0).getTextContent(),
						 (e.getElementsByTagName("apellidos").item(0).getTextContent()),
					     (Integer.parseInt((e.getAttribute("id")) ),
					    		( PasearGregorianCalendar(e.getElementsByTagName("nacimiento").item(0).getTextContent())
						 
						 );
			
				 
			 }
			 
			 
		} catch (ParserConfigurationException | SAXException | IOException | XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PasearGregorianCalendar();
		
		
		
		
	}

	private static void PasearGregorianCalendar() {
		
		
		DateFormat dF= new SimpleDateFormat("dd MM yyyy");
		Date d= dF.parse(e.getElementByTagName("nacimiento").item(0).getTextContent);
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		// TODO Auto-generated method stub
		
	}

}
