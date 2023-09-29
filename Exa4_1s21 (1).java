import java.util.Scanner;

class Exa4_1s21 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);

		System.out.println("4.- El área de un círculo es PI*(r^2) , y la longitud de la circunferencia es 2*PI*r Escribir un programa que solicite un radio e imprima el valor del área y la longitud de la circunferencia asociadas.");
		    System.out.println();
		        int radio1;
		        double area;
		        double longitud;
		    System.out.println("ingrese el radio para calcular la el area del circulo y la longitud de la circunferencia: ");
                radio1=teclado.nextInt();
                area=3.1416*Math.pow(radio1,2);
                longitud=2*3.1416*radio1;
            System.out.println();
            System.out.println("el resultado del area es: " + area + " y de la longitud de la circunferencia es: " + longitud);
            System.out.println();
	}
}