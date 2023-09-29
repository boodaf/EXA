import java.util.Scanner;

public class Exa8_1s21 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Ingresa un número del 1 al 9: ");
		numero = teclado.nextInt();

		if (numero >=1 && numero <=9){
			System.out.println("Tabla de multiplicacion del " + numero + ":");
			for (int i = 1; i <= 10; i++){
				int resultado = numero * i;
				System.out.println(numero + "x" + i + "=" + resultado);
			}
		}
	}
}