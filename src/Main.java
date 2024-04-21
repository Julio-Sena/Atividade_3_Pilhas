import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> numPares = new Stack<>();
        Stack<Integer> numImpares = new Stack<>();
        int value;

        // Entrada
        do {
            System.out.print("Digite um número entre 1 e 99: ");
            value = scanner.nextInt();
        } while (value <= 0 || value >= 100);

        // Leitura dos 10 números inteiros
        for (int i = 0; i < 10; i++) {
            do {
                System.out.print("Digite o " + (i + 1) + "º número: ");
                value = scanner.nextInt();
            } while (value <= 0 || value >= 100);

            // Processamento: pilha correspondente
            if (value % 2 == 0) {
                numPares.push(value);
            } else {
                numImpares.push(value);
            }
        }

        // Exibição das pilhas
        System.out.println("\nPilha de números pares:");
        while (!numPares.isEmpty()) {
            System.out.println(numPares.pop());
        }

        System.out.println("\nPilha de números ímpares:");
        while (!numImpares.isEmpty()) {
            System.out.println(numImpares.pop());
        }
    }
}
