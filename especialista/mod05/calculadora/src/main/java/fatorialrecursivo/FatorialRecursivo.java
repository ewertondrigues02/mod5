package fatorialrecursivo;

import java.util.Scanner;

/**
 * Classe que calcula o fatorial de um número de forma recursiva.
 */
public class FatorialRecursivo {

    /**
     * Calcula o fatorial de um número de forma recursiva.
     *
     * @param n O número inteiro para o qual o fatorial será calculado.
     * @return O valor do fatorial de n.
     */
    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    /**
     * Método principal que solicita um número ao usuário e exibe o resultado do cálculo do fatorial.
     *
     * @param args Argumentos de linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Fatorial não existe para números negativos.");
        } else {
            int resultado = fatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + resultado);
        }

        scanner.close();
    }
}
