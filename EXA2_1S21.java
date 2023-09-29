import java.util.Scanner;

class Exa2_1s21 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);

		System.out.println("2.- Escribir un programa que acepte el valor de un angulo, medido en grados, e imprima su valor en radianes (Nota: PI radianes =180 grados) Defina para ello la constante PI como 3.1416");
		        int angulo;
		        double radianes;
		    System.out.println();
		    System.out.println("coloque el angulo que quiera convertir en radianes");
		        angulo=teclado.nextInt();
		        radianes=angulo*3.1416/180;
		    System.out.println();
	    	System.out.println("de " + angulo + " a radianes es: " + radianes);
	    }
	}