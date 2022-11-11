package EJERCIOCIO4;

import java.util.Scanner;

public class Scanneando {

	public static void main(String[] args) {
		String cadena = "Hola,2,true";
		Scanner sc = new Scanner(cadena);
		 sc.useDelimiter(",");
		/*System.out.println(sc.next());
		System.out.println(cadena);
		System.out.println(sc.next());*/
		// TODO Auto-generated method stub
		
		/*while(sc.hasNext()) {
			System.out.println(sc.next());
			} 
		*/
		
		 String token1 = sc.next();
		 int token2 = sc.nextInt();
		 boolean token3 = sc.nextBoolean();
		 System.out.println(token1);
		 System.out.println(token2);
		 System.out.println(token3);
		 
		sc.close();
		
		 
		
	}

}
