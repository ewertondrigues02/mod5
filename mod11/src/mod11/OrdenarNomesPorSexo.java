package mod11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OrdenarNomesPorSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        System.out.print("Digite os nomes e sexos separados por vírgula (exemplo: Carlos-M, Joana-F): ");
        String entrada = scanner.nextLine();

     
        String[] pessoas = entrada.split(",");
        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = pessoas[i].trim();
        }


        List<String> grupoMasculino = new ArrayList<>();
        List<String> grupoFeminino = new ArrayList<>();

       
        for (String pessoa : pessoas) {
            if (pessoa.endsWith("-M")) {
                grupoMasculino.add(pessoa.replace("-M", "").trim());
            } else if (pessoa.endsWith("-F")) {
                grupoFeminino.add(pessoa.replace("-F", "").trim());
            }
        }


        String[] masculinoOrdenado = grupoMasculino.toArray(new String[0]);
        String[] femininoOrdenado = grupoFeminino.toArray(new String[0]);

        Arrays.sort(masculinoOrdenado);
        Arrays.sort(femininoOrdenado);

     
        System.out.println("\nGrupo Masculino (ordenado):");
        for (String nome : masculinoOrdenado) {
            System.out.println(nome);
        }

        System.out.println("\nGrupo Feminino (ordenado):");
        for (String nome : femininoOrdenado) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
