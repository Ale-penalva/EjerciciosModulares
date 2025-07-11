package EPM.basico;
import java.util.*;
public class CalculadoraBásica {
	
	public static int sumar (int a, int b) {
				return a+ b;
	}
	public static int restar (int a, int b) {
		return a-b;
	}
	public static int multiplicar (int a, int b) {
		return a*b;
	}
	public static int dividir (int a, int b) {
		return a/b;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);		
		
		System.out.println("¿Qué operación deseas realizar?");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		int opcion=entrada.nextInt();
		
		int num1, num2;
		System.out.println("Introduce el primer número: ");
		num1=entrada.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2=entrada.nextInt();
		
		
		switch (opcion) {
			
		case 1: 
			System.out.println("El resultado de la sumas es: "+ sumar(num1,num2));
			break;
		case 2:
			System.out.println("El resultado de la resta es: " + restar(num1,num2));
			break;
		case 3:
			System.out.println("El resultado de la multiplicación es: " + multiplicar(num1, num2));
			break;
		case 4:
			System.out.println("El resultado de la división es: "+ dividir(num1,num2));
			break;
			default: 
				System.out.println("Operación no válida.");
		}
		
	}

}
