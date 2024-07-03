package entradados;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public Console(Scanner scanner) {
    }

    public static int lerInt(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, digite um número inteiro válido.");
            scanner.next();
            System.out.print(mensagem);
        }
        int numero = scanner.nextInt();
        scanner.nextLine();
        return numero;
    }
}
