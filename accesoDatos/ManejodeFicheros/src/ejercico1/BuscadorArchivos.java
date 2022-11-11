package ejercico1;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

// ? "si" : "no"// sirve para mostrar si o no en lugar de true o false

public class BuscadorArchivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombreArchivo="";
		
		System.out.println("Que archivo quieres buscar");
		Scanner sc = new Scanner(System.in);
		nombreArchivo=sc.nextLine();
		
		File archivo;
		archivo = new File (nombreArchivo);
		try {
			archivo.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (archivo.exists()) {
			try {
				System.out.println ("el nombre es "+archivo.getName()); 
				System.out.println ("la RUTA es "+ archivo.getAbsolutePath());
				System.out.println ("el tamaño es  " + archivo.length());
				System.out.println ("es un archivo "+archivo.isFile());
				System.out.println ("es un directorio "+archivo.isDirectory());
				System.out.println ("tienes permiso para ejecutar "+archivo.canExecute());
				System.out.println("tienes permiso para leer "+ (archivo.canRead() ? "si" : "no" ));
				System.out.println("tienes permiso para escribir "+archivo.canWrite());
				System.out.println("la fecha es de modificación "+ new Date(archivo.lastModified()));
				
			} catch (Exception e) {
				// TODO: handle exception 
				System.out.println("error");
			}
			
			
			
		}

	}

}
