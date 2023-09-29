import java.util.Scanner;

class Exa6_1s21 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("6.- Realizar un programa que calcule la distancia del punto (x0, y0) a la recta Ax + By + C = 0, que viene dada por: d=|A*x0+B*y0+C|/√A^2+B^3");
            System.out.println();
                int A;
                int B;
                int C;
                int x0;
                int y0;
                double distancia;
                double distancia1;
                double distancia2;
            System.out.println("ingrase el valor de A: ");
                A=teclado.nextInt();
            System.out.println("ingrese el valor de B: ");
                B=teclado.nextInt();
            System.out.println("ingrese el valor de C: ");
                C=teclado.nextInt();
            System.out.println("ingrese el punto x0: ");
                x0=teclado.nextInt();
            System.out.println("ingrese el punto y0: ");
                y0=teclado.nextInt();
                distancia=(A*x0+B*y0+C);
                distancia1=Math.pow(A,2) + Math.pow(B,2);
                distancia2=distancia/Math.sqrt(distancia1);
            System.out.println();
            System.out.println("la distancia es: " + distancia2);
            System.out.println();
	}
}