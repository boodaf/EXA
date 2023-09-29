public class EXAM10_1s21{
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
            
            // Salta de línea cada 10 números
            if (i % 10 == 0) {
                System.out.println(); // Cambia a una nueva línea
            }
        }
    }
}