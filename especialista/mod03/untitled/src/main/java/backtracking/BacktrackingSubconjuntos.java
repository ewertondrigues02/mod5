package backtracking;

import java.util.ArrayList;
import java.util.List;

public class BacktrackingSubconjuntos {

    public static void gerarSubconjuntos(List<Integer> conjunto, int n, int somaLimite) {
        List<List<Integer>> resultado = new ArrayList<>();
        List<Integer> atual = new ArrayList<>();
        backtrack(conjunto, n, 0, atual, resultado, somaLimite);

        for (List<Integer> subconjunto : resultado) {
            System.out.println(subconjunto);
        }
    }

    public static void backtrack(List<Integer> conjunto, int n, int inicio, List<Integer> atual, List<List<Integer>> resultado, int somaLimite) {

        if (atual.size() == n) {
            int soma = 0;
            for (int num : atual) {
                soma += num;
            }

            if (soma > somaLimite) {
                resultado.add(new ArrayList<>(atual));
            }
            return;
        }

        for (int i = inicio; i < conjunto.size(); i++) {
            atual.add(conjunto.get(i));

            backtrack(conjunto, n, i + 1, atual, resultado, somaLimite);

            atual.remove(atual.size() - 1);
        }
    }

    public static void main(String[] args) {
        List<Integer> conjunto = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            conjunto.add(i);
        }

        int n = 3;
        int somaLimite = 30;

        System.out.println("Subconjuntos de tamanho " + n + " cuja soma é maior que " + somaLimite + " são:");
        gerarSubconjuntos(conjunto, n, somaLimite);
    }
}

