package Archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Archivos {

	public static void main(String[] args) {
		
		System.out.println("Que archivo quieres añadir ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		File file;
		String lectura = "";
		
		try {
			lectura = reader.readLine();	
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(-1);
		}
		
		file = new File(lectura);
		
		//if (!file.exists()) {
			System.out.println("Creando archivo...");
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(-2);
			}		
		
		//}
			
		
	}
}
