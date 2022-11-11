package ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PedirOpciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
   
    int elegirar;
    boolean salir = false;
    boolean salir2 = false;
    do {
    	
	System.out.println("Elige una opcion \n  1.crear un archivo o directorio \n  2.borrar un archivo \n  3.renombrar un archivo \n  4.mover un archivo \n 5.salir");
	BufferedReader opusu = new BufferedReader(new InputStreamReader(System.in));
	File eligiendo;
	String eligiendolectura = null;
	try {
		eligiendolectura= opusu.readLine();
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
	
	
				switch (Integer.parseInt(eligiendolectura)) {
				case 1:
					do {
					System.out.println("1.crear un archivo (1) o directorio (2)");
					Scanner sc = new Scanner(System.in);
					elegirar= sc.nextInt();
					
							switch (elegirar){
								
								case 1 :
										
											System.out.println("dime el nombre del nuevo archivo");
											BufferedReader nombre = new BufferedReader(new InputStreamReader(System.in));
											File nombreNuevo;
											String nombreNew="";
											try {
												nombreNew=nombre.readLine();
												
												
											} catch (Exception e) {
												// TODO: handle exception
												e.printStackTrace();
											}	
											File nuevoArchivo = new File(nombreNew);
												if(!nuevoArchivo.exists()) {
													System.out.println("creando");
													try {
														nuevoArchivo.createNewFile();
														
													} catch (Exception e) {
														System.out.println("error");
														// TODO: handle exception 
													e.printStackTrace();
													}
												}else {
													System.out.println("ya creado");
												}
										
											break;
									
											case 2:
										
												System.out.println("dime el nombre del nuevo archivo");
												BufferedReader nombre1 = new BufferedReader(new InputStreamReader(System.in));
												File nombreNuevo1;
												String nombreNew1="";
												try {
													nombreNew1=nombre1.readLine();
													
													
												} catch (Exception e) {
													// TODO: handle exception
													e.printStackTrace();
												}	
												File nuevoArchivo1 = new File(nombreNew1);
													if(!nuevoArchivo1.exists()) {
														System.out.println("creando");
														try {
															nuevoArchivo1.mkdirs();
															
														} catch (Exception e) {
															// TODO: handle exception 
														e.printStackTrace();
														}
													}
													break;
											case 3:
												salir2=true;
												break;
							default:
								break;
							}
					}while(!salir2);
				case 2:
					System.out.println("2.borrar un archivo");
					BufferedReader opusu2 = new BufferedReader(new InputStreamReader(System.in));
					File borrando;
					String lectura = null;
					try {
						lectura= opusu2.readLine();
					} catch (Exception e) {
						// TODO: handle exception
					}
					
					borrando= new File(lectura);
					
					if(borrando.exists()) {
						
						borrando.delete();
					}
					
					break;
				case 3:
					System.out.println("3.renombrar un archivo");
					System.out.println("Dime el nombre del archivo");
					
					BufferedReader opusu3 = new BufferedReader(new InputStreamReader(System.in));
					File renombrar;
					String lecturarenombrar = null;
					try {
						lectura= opusu3.readLine();
					} catch (Exception e) {
						// TODO: handle exception
					}
					
					renombrar= new File(lecturarenombrar);
					
					if(renombrar.exists()) {
						System.out.println(
								);
						renombrar.renameTo(renombrar);
					}
					
					break;
				case 4:
					System.out.println("4.mover un archivo");
					break;
					
				case 5:
					
					 salir = true;
					 System.out.println("nos vemos");
				default:
					break;
				}
		
	}while(!salir);
		
		
		
		
	}

}
