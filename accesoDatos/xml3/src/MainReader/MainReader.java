package MainReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import org.xml.sax.SAXException;

import XmlHandler.XMLHandler;
import listaCanciones.Cancion;

import listaCanciones.Listas;

public class MainReader {
	
	private static int opusu;
	private static boolean salir=true;
	private static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	private static ArrayList<Cancion>listaCanciones= new ArrayList<Cancion>();
	private static Cancion cancion;
	private static ArrayList<Listas> listasdeListas = new ArrayList<Listas>();
	private static Listas lista;		
	
	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = null;
		XMLHandler handler;
		XMLOutputFactory xof = XMLOutputFactory.newInstance();
		XMLStreamWriter xsw;
		
			

		do {
		
			System.out.println("================ MENU PRINCIPAL ==============");
			System.out.println("||        1- Leer un archivo                ||");
			System.out.println("||        2- Registrar nueva lista          ||");
			System.out.println("||        3- Exportar archivo               ||");
			System.out.println("||        4- Salir                          ||");
			System.out.println("==============================================");
			System.out.println("||              Elije una opcion            ||");
			System.out.println("==============================================");
			
			try {
				opusu= Integer.parseInt(br.readLine());
				
			} catch (NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			switch (opusu) {
			
				case 1:
					
					System.out.println("Introduce el nombre del archivo");
					String rutaArchivo = br.readLine();
					
					try {
						try {
							parser = factory.newSAXParser();
						} catch (ParserConfigurationException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
					    handler =new XMLHandler();
						parser.parse(new File(rutaArchivo), handler);
						
					} catch (SAXException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				break;
				
				case 2:
					
					listasdeListas.removeAll(listasdeListas);
					listaCanciones.removeAll(listaCanciones);
					
					System.out.println("Nombre de la lista: ");
					String nombreLista = br.readLine();
					
					System.out.println("Numero de canciones: ");
					int numeroCanciones = Integer.parseInt(br.readLine());
					
					for (int i = 0; i < numeroCanciones; i++) {
						
						System.out.println("Nombre de la cancion: ");
						String nombreTitulo = br.readLine();

						System.out.println("Nombre del artista: ");
						String nombreArtista = br.readLine();

						System.out.println("Duracion de la cancion: ");
						int nombreduracion = Integer.parseInt(br.readLine());
					    
						cancion= new Cancion(nombreTitulo,nombreArtista,nombreduracion);
						listaCanciones.add(cancion);
					}		
					
					listasdeListas.add(new Listas(nombreLista,numeroCanciones,listaCanciones));
					
					System.out.println("==============================================");
					System.out.println("||          Lista creada con exito!         n||");
					System.out.println("==============================================");


				break;
					
				case 3:
					
					    try {
					    	
					    	System.out.println("En que archivo lo quieres guardar recuerda que acabe en .xml");
					    	String nombreArchivo = br.readLine();
					    	
					    	
					    	xsw=xof.createXMLStreamWriter(new FileWriter(nombreArchivo));
					    	xsw.writeStartDocument();
					    	xsw.writeCharacters("\n");
					    	xsw.writeStartElement("listas");
					    	
					    	for (Listas lista : listasdeListas) {
					    		
					    		xsw.writeCharacters("\n\t");
					    		xsw.writeStartElement("lista");
								
						    		xsw.writeCharacters("\n\t\t");
						    		xsw.writeStartElement("nombre");
						    		xsw.writeCharacters(lista.getNombre());
						    		xsw.writeEndElement();
						    		
						    		xsw.writeCharacters("\n\t\t");
						    		xsw.writeStartElement("numeroCanciones");
						    		xsw.writeCharacters(lista.getNumeroCanciones()+"");
						    		xsw.writeEndElement();
						    		
						    		xsw.writeCharacters("\n\t\t");
						    		xsw.writeStartElement("canciones");
						    		
						    		for (Cancion cancion : listaCanciones) {
						    			
						    			xsw.writeCharacters("\n\t\t\t");
							    		xsw.writeStartElement("cancion");
							    		
								    		xsw.writeCharacters("\n\t\t\t\t");
								    		xsw.writeStartElement("titulo");
								    		xsw.writeCharacters(cancion.getTitulo());
								    		xsw.writeEndElement();
										
								    		xsw.writeCharacters("\n\t\t\t\t");
								    		xsw.writeStartElement("artista");
								    		xsw.writeCharacters(cancion.getArtistas());
								    		xsw.writeEndElement();
								    		
								    		xsw.writeCharacters("\n\t\t\t\t");
								    		xsw.writeStartElement("duracion");
								    		xsw.writeCharacters(cancion.getDuracion()+"");
								    		xsw.writeEndElement();
							    		
								    	xsw.writeCharacters("\n\t\t\t");
								    	xsw.writeEndElement();
						    		}
						    		xsw.writeCharacters("\n\t\t");
						    		xsw.writeEndElement();
						    		
						    	xsw.writeCharacters("\n\t");
						    	xsw.writeEndElement();
							}
					    	xsw.writeCharacters("\n");
				    		xsw.writeEndElement();
				    		
				    		xsw.writeEndDocument();
				    		
				    		xsw.flush();
				    		
				    		xsw.close();
				    	
							
						} catch (XMLStreamException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}	
						System.out.println("==============================================");
						System.out.println("           Lista exportada con exito!");
						System.out.println("==============================================");

				break;
				
				case 4:
					
					System.out.println("Gracias por usar nuestro programa!");
					System.out.println("==============================================");
					salir=false;
				break;
				
				default:
					
					System.out.println("No corresponde con ninguna opcion");
					System.out.println("==============================================");

				break;
		}
	
		}while(salir);
	}
}
	

