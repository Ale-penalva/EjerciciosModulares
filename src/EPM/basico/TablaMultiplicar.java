package EPM.basico;
import java.util.*;
public class TablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("---TABLA DE MULTIPLICAR---");
		System.out.print("Introduce un número para obtener su tabla:");
		int num=entrada.nextInt();
		System.out.println("***************");
		System.out.println("  Tabla del " + num + "  ");
		System.out.println("***************");
		tablaMultiplicar(num);
	
	}
public static void tablaMultiplicar(int num) {
	for(int i=0;i<=10;i++) {
		System.out.println(num + " x " + i + " = " + (num*i));
	}
}
}
