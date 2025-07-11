package EPM.basico;

public class Par_impar {
	
	public static boolean esPar(int num){ 
		return num %2==0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=14; 
		if(esPar(num)) {
			System.out.println("El número es par");
		}else {
			System.out.println("El número no es par");
		}
		
	}
}
