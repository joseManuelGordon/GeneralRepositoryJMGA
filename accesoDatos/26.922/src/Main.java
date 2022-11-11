import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String persona;
			int byteLeido;
			RandomAccessFile file = new RandomAccessFile(new File("pruebas2.txt"),"rw");
			System.out.println(file.length());
			file.seek(12*3);
			file.writeBytes("\r\nAlejandra40");
			persona= file.readLine();
			System.out.println(persona);
		} catch ( IOException e) {
			// TODO: handle exception
		}
		
		

	}

}
