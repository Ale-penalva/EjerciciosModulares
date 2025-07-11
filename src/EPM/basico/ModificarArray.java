package EPM.basico;

import java.util.Arrays;

public class ModificarArray {
	
	public static void ModificarArray(int[]array) {
		array [0]=99;
	}
	
public static void main (String[] args) {
	int [] numeros= {2,3,4,5,6};
	System.out.println("Antes de modificar el array los números eran: " + Arrays.toString(numeros));
	ModificarArray(numeros);
	System.out.println("Ahora los números son: " + Arrays.toString(numeros));
}
}
