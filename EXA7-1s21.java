import java.util.Scanner;

class Exa7_1s21 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("7.- Sea un sistema de ecuaciones de la forma: a x + b y = c, d x + e y = f que puede resolverse usando las siguientes fórmulas: x = (ce-bf)/(ae-bd), y = (af-cd)/(ae-bd) Escribir un programa que lea los coeficientes (a, b, c, d, e, f) y resuelva el sistema. El programa deberá indicar los casos en los que el sistema de ecuaciones no tenga solución. NOTA: Si el divisor (ae-bd) es cero, el sistema no tendrá solución.");
                int a1;
                int b1;
                int c1;
                int d1;
                int e1;
                int f1;
                double x;
                double y;
                double ecuacion;
                double ecuacion1;
                double ecuacion2;
            System.out.println();
            System.out.println("ax + by = c");
            System.out.println("dx + ey = f");
            System.out.println("escriba el valor de a:");
                a1=teclado.nextInt();
            System.out.println("escriba el valor de b:");
                b1=teclado.nextInt();
            System.out.println("escriba el valor de c:");
                c1=teclado.nextInt();
            System.out.println("escriba el valor de d:");
                d1=teclado.nextInt();
            System.out.println("escriba el valor de e:");
                e1=teclado.nextInt();
            System.out.println("escriba el valor de f:");
                f1=teclado.nextInt();
                ecuacion=(a1*e1)-(b1*d1);
                ecuacion1=(c1*e1)-(b1*f1);
                ecuacion2=(a1*f1)-(c1*d1);
                x = ecuacion1/ecuacion;
                y = ecuacion2/ecuacion;
            System.out.println("el valor de x es: " + x + " y el valor de y es: " + y);
	}
}