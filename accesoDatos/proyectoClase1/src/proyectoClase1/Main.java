package proyectoClase1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	
	private ArrayList<Coche> garage= new ArrayList<Coche>();
	private String opusu1;
	
	public static void main(String[] args) {
		
		ArrayList<Coche> garage= new ArrayList<Coche>();
		String opusu1;
		
		
		// bLOque de lecturA DE LA INFO
		// TODO Auto-generated method stub
		 System.out.println("dime un coche");
		 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		 File f = new File("garage.txt");
		 FileWriter fw;
		try {
			 fw = new FileWriter(f);
			 BufferedWriter bw = new BufferedWriter(fw);
			 
			 
			 
			 bw.close();
			 fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// FINAL DEL BLOUE DE LECTURA
	public String MatriculaUsuario;
		if(MatriculaUsuario.equalI)
		
		

	}

}
