package serializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Coche c1 = new Coche("0546BXJ", "Seat","Panda", 2000,3000);
		Coche c2 = new Coche("6348KCG", "Ford","Focus",1995 ,5000);
		Coche c3 = new Coche("1234ERJ", "aLFArOMEO","Giuleta", 2005,8000);
		
		ArrayList<Coche> coches= new ArrayList<Coche>();
		
		coches.add(c1);
		coches.add(c2);
		coches.add(c3);
		
	    //serializar(coches,"coches.dat");
		
		ArrayList<Coche> cochesleidos;
		cochesleidos= deserializar("coches.dat");
		
		System.out.println(cochesleidos);
	}
		
 public static void serializar(ArrayList<Coche>coches, String ruta) {
	 FileOutputStream fos;
	 ObjectOutputStream oos;
	 
	 try {
		 fos= new FileOutputStream(ruta);
		 oos= new ObjectOutputStream(fos);
		 
		 oos.writeObject(coches);
		 
		 oos.close();
		 fos.close();
		 
		 
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	 
	 
 }
 public static ArrayList<Coche> deserializar(String ruta){
	 ArrayList<Coche> coches= null;
	 FileInputStream fis;
	 ObjectInputStream ois;
	 
	  try {
		fis = new FileInputStream(ruta);
		ois= new ObjectInputStream(fis);
		
		coches= (ArrayList<Coche>) ois.readObject();
		
		ois.close();
		fis.close();
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
	 
	 
	 
	 
	return coches;
 } 
}
