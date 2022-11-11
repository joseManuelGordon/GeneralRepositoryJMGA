package EJERCIOCIOconScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Persona persona [] = new Persona [3];
		int contador = 0;
		try {
			Scanner sc = new Scanner (new File("perosnas.txt"));
			
			while(sc.hasNextLine()) {
			// string p guarda las lineas 
				String p= sc.nextLine();
				
				Scanner sc1 = new Scanner (p);
				sc1.useDelimiter(",");
				
				persona[contador]= new Persona(sc1.next(),sc1.next(),sc1.nextInt(),sc1.nextBoolean());
				sc1.close();
				contador++;
			}
			sc.close();
		//for (int i = 0; i < persona.length; i++) {
			
		//}
		System.out.println(persona.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error");
		}
		// TODO Auto-generated method stub

	}

}
