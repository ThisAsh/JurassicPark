import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scelta;

        do {
            System.out.println("Menu:");
            System.out.println("1. Opzione 1");
            System.out.println("2. Opzione 2");
            System.out.println("3. Opzione 3");
            System.out.println("4. Opzione 4");
            System.out.println("5. Opzione 5");
            System.out.println("6. Esci");
            System.out.print("Scegli un'opzione (1-6):");
            scelta = scanner.nextInt();

            switch (scelta) 
            {
                case 1:
                    System.out.println("Hai scelto l'opzione 1.");
                    break;
                case 2:
                    System.out.println("Hai scelto l'opzione 2.");
                    break;
                case 3:
                    System.out.println("Hai scelto l'opzione 3.");
                    break;
                case 4:
                    System.out.println("Hai scelto l'opzione 4.");
                    break;
                case 5:
                    System.out.println("Hai scelto l'opzione 5.");
                    break;
                case 6:
                    System.out.println("Uscita dal programma.");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.\n");
            }
        } while (scelta != 6);

        scanner.close();
    }
}