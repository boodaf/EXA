import java.util.Scanner;

public class EXAM9_1s21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de caída de potencia según la ley de Ohm");
        
        // Solicitar al usuario el valor de la resistencia
        System.out.print("Ingresa el valor de la resistencia en ohmios (entre 0 y 1000): ");
        double resistencia = scanner.nextDouble();
        
        // Verificar si la resistencia está dentro de los límites
        if (resistencia < 0) {
            System.out.println("Error: El valor de la resistencia es negativo.");
        } else if (resistencia > 1000) {
            System.out.println("Error: El valor de la resistencia es mayor que 1000 ohmios.");
        } else {
            // Solicitar al usuario el valor de la corriente
            System.out.print("Ingresa el valor de la corriente en amperios: ");
            double corriente = scanner.nextDouble();
            
            // Calcular la caída de potencia utilizando la ley de Ohm (P = I^2 * R)
            double potencia = corriente * corriente * resistencia;
            
            System.out.println("La caída de potencia es: " + potencia + " vatios");
        }

        scanner.close();
    }
}