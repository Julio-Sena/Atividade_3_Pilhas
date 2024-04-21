import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> numeros = new Stack<>();
        int value;

        // Leitura e validação da entrada
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

            // Processamento: colocar na pilha se for par, remover se for ímpar
            if (value % 2 == 0) {
                numeros.push(value);
            } else {
                if (!numeros.isEmpty()) {
                    numeros.pop();
                } else {
                    System.out.println("A pilha está vazia!");
                }
            }
        }

        // Exibição dos elementos da pilha
        System.out.println("\nElementos desempilhados da pilha:");
        while (!numeros.isEmpty()) {
            System.out.println(numeros.pop());
        }

        // Fechando o objeto Scanner
        scanner.close();
    }
}
