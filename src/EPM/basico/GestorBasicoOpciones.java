package EPM.basico;
import java.util.*;

public class GestorBasicoOpciones {

    // Método para saludar al usuario
    public static void SaludarUsuario(String nombre) {
        System.out.println("¡Hola, " + nombre + "! Espero que tengas un buen día.");
    }

    // Método para animar al usuario
    public static void AnimarUsuario() {
        System.out.println("No te rindas, cada día es una nueva oportunidad. ¡Sigue intentándolo!");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre:");
        String nombre = entrada.next();

        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Saludar");
            System.out.println("2. Animar");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = entrada.nextInt(); // Asumimos que el usuario introduce un número válido

            switch (opcion) {
                case 1:
                    SaludarUsuario(nombre);
                    break;
                case 2:
                    AnimarUsuario();
                    break;
                case 3:
                    System.out.println("Adiós, " + nombre + ". ¡Que tengas un buen día!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción entre 1 y 3.");
            }
        } while (opcion != 3);

        entrada.close(); // Cerrar el Scanner
    }
}
