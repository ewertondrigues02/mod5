package fatorialrecursivo;

import java.util.Scanner;

public class FatorialRecursivo {

    public static int fatorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {

            return n * fatorial(n - 1);
        }
    }

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
