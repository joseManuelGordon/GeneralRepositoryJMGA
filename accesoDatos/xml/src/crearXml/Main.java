package crearXml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 DocumentBuilderFactory dbf =  DocumentBuilderFactory.newDefaultInstance();//nos devuelve un objeto basico construido
	        DocumentBuilder db;
	        Document doc;
	        Element element;
	        Attr atributo;
	        TransformerFactory tf= TransformerFactory.newDefaultInstance();
	        Transformer transformer;
	        DOMSource doms;
	        StreamResult sr;
	        
	        
	        
	        
	        try {
	        	db=dbf.newDocumentBuilder();
	        	doc=db.newDocument();
	        	//Elemento raiz
	        	
				element=doc.createElement("personas");
				
				
				doc.appendChild(element);//añadir elemento al documneto
				System.out.println("--------------------------");
				
				//creamos un id para la raiz
				
				atributo= doc.createAttribute("id");
				atributo.setValue("908");
				element.setAttributeNode(atributo);
				
				try {
					transformer = tf.newTransformer();
					doms= new DOMSource(doc);
					sr = new StreamResult(new File("personas3.xml"));
					
					try {
						transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
						transformer.setOutputProperty(OutputKeys.INDENT, "yes");
						transformer.transform(doms, sr);
						
					} catch (TransformerException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
							
				} catch (TransformerConfigurationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				
				
				
			} catch (ParserConfigurationException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
		
		

	}

}
