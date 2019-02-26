import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello say something ... ");

        int a = 5, b = 10;
        //int suma = a + b;
        //System.out.println("Suma numerelor " + a + " si " + b + " este: " + suma);

        Scanner scanner = new Scanner(System.in);
        /*
        String ceAmCititDinConsola = scanner.nextLine();
        System.out.println("Am citit... " + ceAmCititDinConsola);
        */

        // Cititm Actiuni: 0-exit, 1-suma; 2-diferenta
        System.out.println("Cititm Actiuni: 0-exit, 1-suma; 2-diferenta");
        int ceAmCititDinScanner = -1;
        while (ceAmCititDinScanner != 0) {
            ceAmCititDinScanner = scanner.nextInt();
            switch (ceAmCititDinScanner) {
                case 1: {
                    System.out.println("Ai ales suma");
                    System.out.println("a = ");
                    a = scanner.nextInt();
                    System.out.println("b = ");
                    b = scanner.nextInt();
                    System.out.println("Suma numerelor " + a + " si " + b + " este: " + (a + b));
                    break;
                }
                case 2: {
                    System.out.println("Ai ales diferenta");
                    System.out.println("a = ");
                    a = scanner.nextInt();
                    System.out.println("b = ");
                    b = scanner.nextInt();
                    System.out.println("Diferenta numerelor " + a + " si " + b + " este: " + (a - b));
                    break;
                }
                case 0: {
                    break;
                }
                default: {
                    System.out.println("Comanda nerecunoscuta, mai incearca");
                    break;
                }
            }
        }
    }
}
