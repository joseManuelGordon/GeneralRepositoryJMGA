package STRING;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		//char entre parentesis castea
		
		// TODO Auto-generated method stub

		int byteLeido;
		byte [] bytesLeidos = new byte [3];
		System.out.println("Introduce algo:  ");
		try {
			byteLeido= System.in.read();
			System.in.read();
			System.in.read();
			System.out.println("El byte: " + (char) byteLeido);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		
		System.out.println("Introduce varias letras:  ");
		try {
			
			System.in.read(bytesLeidos);
			System.in.read();
			System.in.read();
			System.out.println("los  byte: " + new String( bytesLeidos));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		System.out.println("Introduce varias letras:  ");
		
		try {
			System.in.read(bytesLeidos, 1, 2);
			System.in.read();
			System.in.read();
			System.out.println("los bytes: " + new String( bytesLeidos));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		
		
		
	}

}
