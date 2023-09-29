import java.util.Scanner;

class Exa3_1s21 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);

		System.out.println("3.- El volumen de la esfera es igual a (4/3)∙π∙(r^3) Escribir un programa que solicite un radio e imprima el valor del volumen de la esfera correspondiente");
		    System.out.println();
		        int radio;
		        double resultado;
		    System.out.println("coloque el radio de la esfera para saber su volumen: ");
		        radio=teclado.nextInt();
		        resultado=4.1888*(Math.pow(radio,3));
		    System.out.println();
		    System.out.println("el volumen de la esfera es: " + resultado);
		    System.out.println();
	}
}