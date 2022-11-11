package pruebaEntrevita;

import java.util.Scanner;

public class Main {
public static String cadena;
	public static void main(String[] args) {
		System.out.println("introduce cadena");
		Scanner sc = new Scanner(System.in);
		cadena=sc.next();
		compruebaCadenas(cadena);
		
		// TODO Auto-generated method stub

	}
	
	

	public static boolean compruebaCadenas (String cadena) {
		
		
		
		char[] cadenaDescompuesta = cadena.toCharArray();
		
		for (int i = 0; i < cadenaDescompuesta.length; i++) {
			
			if(cadenaDescompuesta[1]==')'||cadenaDescompuesta[1]==']'||cadenaDescompuesta[1]=='}') {
				return false;
				
			}
			
			else if(cadenaDescompuesta[cadenaDescompuesta.length]=='('||cadenaDescompuesta[cadenaDescompuesta.length]=='['||cadenaDescompuesta[cadenaDescompuesta.length]=='{') {
				return false;
				
			}
			else if(cadenaDescompuesta[i]=='('&& cadenaDescompuesta[i]==')'||cadenaDescompuesta[i]=='[' &&  cadenaDescompuesta[i]== ']'||cadenaDescompuesta[i]=='{' &&  cadenaDescompuesta[i]== '}') {
				return true;
			}
			
			
		}
		
		
			
			
			}
			return false;
	}
}