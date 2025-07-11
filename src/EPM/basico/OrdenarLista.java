	package EPM.basico;
	import java.util.*;
	public class OrdenarLista {
	
		static int[]lista;
		
		public static void leerLista() {
			Scanner entrada=new Scanner(System.in);
			System.out.println("¿Cuántos números vas a introducir en la lista?");
			int cantidad=entrada.nextInt();
			lista=new int[cantidad];
			for (int i=0; i<cantidad; i++) {
				System.out.println("Introduce el número " + (1 + i) + ": ");
				lista[i]=entrada.nextInt(); 
			}
		}
		public static void ordenarLista() {
			Arrays.sort(lista);
		}
		public static void mostrarLista() {
			System.out.println("Lista ordenada: " + Arrays.toString(lista));
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			leerLista();
			ordenarLista();
			mostrarLista();
	
		}
	
	}
