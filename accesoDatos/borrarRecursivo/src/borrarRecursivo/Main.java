package borrarRecursivo;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eliminar("D:\\jose\\accesoDatos\\borrarRecursivo\\carpeta");
		
	
		
		

	}

	private static void eliminar(String path) {
		// TODO Auto-generated method stub
		File file=new File(path);
		
		System.out.println(file.listFiles().length);
		
		
					for (File f : file.listFiles()) {
						
						if( f.isDirectory()==true) {
							
							eliminar(f.getAbsolutePath());
							
						}
						System.out.println("eliminado " + f.getName());
						f.delete();
					}
					System.out.println("eliminando  la carpeta "+ file.getName());
					file.delete();
				}
	}

