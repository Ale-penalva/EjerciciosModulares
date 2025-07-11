package EPM.basico;
import java.util.Scanner;

public class AdivinaNum {

    public static void main(String[] args) {
        int nota = pedirNum(); // Guarda la nota introducida
        String clasificacion = clasificarNota(nota); // Clasifica la nota
        mostrarResultado(nota, clasificacion); // Muestra la nota y la clasificación
    }

    public static int pedirNum() {
        int nota;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Introduce tu nota (0-10): ");
            nota = entrada.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota introducida incorrecta. La nota debe estar entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10); // Se repite mientras la nota no sea válida
        return nota; // Devuelve la nota válida
    }

    public static String clasificarNota(int nota) {
        if (nota >= 0 && nota <= 4) {
            return "Suspenso";
        } else if (nota >= 5 && nota <= 6) {
            return "Aprobado";
        } else if (nota >= 7 && nota <= 8) {
            return "Notable";
        } else { // 9-10
            return "Sobresaliente";
        }
    }

    public static void mostrarResultado(int nota, String clasificacion) {
        System.out.println("Tu nota es: " + nota);
        System.out.println("Clasificación: " + clasificacion);
    }
}
