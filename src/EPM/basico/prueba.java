package EPM.basico;

public class prueba {



    public static void main(String[] args) throws InterruptedException {
        // Mensaje inicial
        System.out.println("Cargando...");
        
        // Barra de carga
        for (int i = 0; i <= 100; i++) {
            System.out.print("\r[" + generarBarra(i) + "] " + i + "%");
            Thread.sleep(50); // Pausa de 50 ms para la animación
        }
        
        // Mensaje final
        System.out.println("\n¡Carga completada!");
    }

    // Método para generar la barra de progreso
    public static String generarBarra(int porcentaje) {
        int totalCaracteres = 20; // Longitud total de la barra
        int caracteresLlenos = (int) (porcentaje / 100.0 * totalCaracteres);
        StringBuilder barra = new StringBuilder();
        
        for (int i = 0; i < totalCaracteres; i++) {
            if (i < caracteresLlenos) {
                barra.append("=");
            } else {
                barra.append(" ");
            }
        }
        return barra.toString();
    }
}
