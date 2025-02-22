package programacaodinamica;

import java.util.Scanner;

public class Fatorial {

    public static int fatorialMemo(int n, int[] memo) {

        if (n == 0 || n == 1) {
            return 1;
        }

        if (memo[n] != -1) {
            return memo[n];
        }

        memo[n] = n * fatorialMemo(n - 1, memo);
        return memo[n];
    }

    public static int fatorialIterativo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] * i;
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Fatorial não existe para números negativos.");
        } else {

            System.out.println("Escolha a abordagem:");
            System.out.println("1 - Top-Down (Memoização)");
            System.out.println("2 - Bottom-Up (Iterativo)");
            int escolha = scanner.nextInt();

            int resultado = 0;

            if (escolha == 1) {

                int[] memo = new int[numero + 1];
                for (int i = 0; i <= numero; i++) {
                    memo[i] = -1;
                }
                resultado = fatorialMemo(numero, memo);
            } else if (escolha == 2) {
                resultado = fatorialIterativo(numero);
            } else {
                System.out.println("Opção inválida!");
            }

            System.out.println("O fatorial de " + numero + " é: " + resultado);
        }

        scanner.close();
    }
}

