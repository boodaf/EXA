import java.util.Scanner;

class Exa5_1s21 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);

		System.out.println("5.- El área de un triángulo viene dada por la fórmula indicada en la siguiente figura, donde s es el semiperímetro del triángulo y a, b y c son las longitudes de los lados. Realizar un programa que calcule S, dados a, b y c.");
            System.out.println();
                int hipotenusa;
                int adyacente;
                int opuesto;
                double semiperimetro1;
                double semiperimetro2;
                double area1;
                double area2;
                double a;
                double b;
                double c;
            System.out.println("inserte el valor de la hipotenusa");
                hipotenusa=teclado.nextInt();
            System.out.println();
            System.out.println("inserte el valor del cateto opuesto");
                opuesto=teclado.nextInt();
            System.out.println();
            System.out.println("inserte el valor del cateto adyacente");
                adyacente=teclado.nextInt();
                semiperimetro1=hipotenusa+opuesto+adyacente;
                semiperimetro2=semiperimetro1/2;
                a=semiperimetro2-hipotenusa;
                b=semiperimetro2-opuesto;
                c=semiperimetro2-adyacente;
                area1= semiperimetro2*a*b*c;
                area2= Math.sqrt(area1);
            System.out.println("el resultado del area de un triangulo es: " + area2);
            System.out.println();
	}
}
