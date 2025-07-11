package EPM.basico;

import java.util.Scanner;

public class ConversorTemperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        
		        System.out.println("Seleccione el método de conversión: ");
		        System.out.println("1. De Celsius a Fahrenheit");
		        System.out.println("2. De Fahrenheit a Celsius");
		        Scanner entrada = new Scanner(System.in);
		        int opcion = entrada.nextInt();
		        
		        double temperatura;
		        double resultado;
		        
		        switch (opcion) {
		            case 1:
		                System.out.println("Ingrese la temperatura en Celsius: ");
		                temperatura = entrada.nextDouble();
		                resultado = celsiusToFahrenheit(temperatura);
		                System.out.printf("El resultado es: %.2f°F%n", resultado);
		                break;
		                
		            case 2:
		                System.out.println("Ingrese la temperatura en Fahrenheit: ");
		                temperatura = entrada.nextDouble();
		                resultado = fahrenheitToCelsius(temperatura);
		                System.out.printf("El resultado es: %.2f°C%n", resultado);
		                break;
		                
		            default:
		                System.out.println("Opción no válida. Por favor, seleccione 1 o 2.");
		                break;
		        }
		        
		        entrada.close();
		    }
		    
 public static double celsiusToFahrenheit(double celsius) {
		        return (celsius * 9 / 5) + 32;
		    }
		    
public static double fahrenheitToCelsius(double fahrenheit) {
		        return (fahrenheit - 32) * 5 / 9;
		    }
		}
	


