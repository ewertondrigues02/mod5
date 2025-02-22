package guloso;

import java.util.Arrays;
import java.util.Scanner;

public class TrocoGuloso {

    public static void calcularTroco(int quantia, int[] moedas) {
        Arrays.sort(moedas);
        int[] resultado = new int[moedas.length];

        for (int i = moedas.length - 1; i >= 0; i--) {
            while (quantia >= moedas[i]) {
                quantia -= moedas[i];
                resultado[i]++;
            }
        }

        System.out.println("Troco utilizando o menor número de moedas:");
        for (int i = moedas.length - 1; i >= 0; i--) {
            if (resultado[i] > 0) {
                System.out.println(moedas[i] + " ( " + resultado[i] + " moeda(s) )");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantia para o troco: ");
        int quantia = scanner.nextInt();

        int[] moedas = {5, 2, 1};

        calcularTroco(quantia, moedas);

        scanner.close();
    }
}

