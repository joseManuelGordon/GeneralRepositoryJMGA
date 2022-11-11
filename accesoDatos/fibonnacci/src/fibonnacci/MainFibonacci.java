package fibonnacci;

public class MainFibonacci {
	
	
	int numero;
	
	
	public static  int fibonacci(int numero) {
		
		if(numero==1 | numero==2) {
			return 1;
		}else {
			
			return fibonacci(numero-1) + fibonacci(-2);
		}
		
	}

}
