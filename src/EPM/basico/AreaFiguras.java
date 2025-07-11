package EPM.basico;

import java.util.*;

public class AreaFiguras {

    // Método para calcular el área de un círculo
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método para calcular el área de un cuadrado
    public static double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }

    // Método para calcular el área de un triángulo
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("¿Con qué figura vamos a trabajar?");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        
        System.out.print("Introduce una opción (1-3): ");
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1: 
                System.out.print("Introduce el radio del círculo: ");
                double radio = entrada.nextDouble();
                System.out.printf("El área del círculo es: %.2f%n", calcularAreaCirculo(radio));
                break;

            case 2: 
                System.out.print("Introduce el lado del cuadrado: ");
                double lado = entrada.nextDouble();
                System.out.printf("El área del cuadrado es: %.2f%n", calcularAreaCuadrado(lado));
                break;

            case 3: 
                System.out.print("Introduce la base del triángulo: ");
                double base = entrada.nextDouble();
                System.out.print("Introduce la altura del triángulo: ");
                double altura = entrada.nextDouble();
                System.out.printf("El área del triángulo es: %.2f%n", calcularAreaTriangulo(base, altura));
                break;

            default:
                System.out.println("Opción no válida. Por favor, selecciona una opción entre 1 y 3.");
                break;
        }

        entrada.close(); // Cerrar Scanner
    }
}

