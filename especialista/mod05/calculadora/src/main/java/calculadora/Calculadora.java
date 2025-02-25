package calculadora;

import java.util.Scanner;

/**
 * Classe que representa uma calculadora simples com operações básicas
 * de adição, subtração, multiplicação e divisão.
 */
public class Calculadora {

    /**
     * Método para adicionar dois números inteiros.
     *
     * @param a Primeiro número inteiro.
     * @param b Segundo número inteiro.
     * @return Resultado da soma de a e b.
     */
    int adicionar(int a, int b) {
        return a + b;
    }

    /**
     * Método para subtrair dois números inteiros.
     *
     * @param a Primeiro número inteiro.
     * @param b Segundo número inteiro.
     * @return Resultado da subtração de a por b.
     */
    int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Método para multiplicar dois números inteiros.
     *
     * @param a Primeiro número inteiro.
     * @param b Segundo número inteiro.
     * @return Resultado da multiplicação de a por b.
     */
    int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Método para dividir dois números inteiros.
     * Lança uma exceção caso a divisão por zero seja tentada.
     *
     * @param a Primeiro número inteiro (dividendo).
     * @param b Segundo número inteiro (divisor).
     * @return Resultado da divisão de a por b.
     * @throws ArithmeticException Se b for zero.
     */
    int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }
        return a / b;
    }

    /**
     * Método principal para interagir com o usuário e realizar operações matemáticas.
     *
     * @param args Argumentos de linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Soma: " + calculadora.adicionar(num1, num2));
        System.out.println("Subtração: " + calculadora.subtrair(num1, num2));
        System.out.println("Multiplicação: " + calculadora.multiplicar(num1, num2));

        try {
            System.out.println("Divisão: " + calculadora.dividir(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
