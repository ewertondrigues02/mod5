package mod12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SepararGruposPorSexo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<String> grupoMasculino = new ArrayList<>();
		List<String> grupoFeminino = new ArrayList<>();

		System.out.println(
				"Digite os nomes e sexos das pessoas (exemplo: Carlos M). Até 3 por sexo. Digite 'sair' para encerrar.");
		while (true) {

			if (grupoMasculino.size() >= 3 && grupoFeminino.size() >= 3) {
				System.out.println("Limite de 3 pessoas por sexo atingido.");
				break;
			}

			System.out.print("Digite o nome e o sexo (M/F): ");
			String entrada = scanner.nextLine();

			if (entrada.equalsIgnoreCase("sair")) {
				break;
			}

			String[] dados = entrada.split(" ");
			if (dados.length == 2) {
				String nome = dados[0].trim();
				String sexo = dados[1].trim().toUpperCase();

				if (sexo.equals("M")) {
					if (grupoMasculino.size() < 3) {
						grupoMasculino.add(nome);
					} else {
						System.out.println("O grupo masculino já atingiu o limite de 3 pessoas.");
					}
				} else if (sexo.equals("F")) {
					if (grupoFeminino.size() < 3) {
						grupoFeminino.add(nome);
					} else {
						System.out.println("O grupo feminino já atingiu o limite de 3 pessoas.");
					}
				} else {
					System.out.println("Sexo inválido. Use 'M' para masculino ou 'F' para feminino.");
				}
			} else {
				System.out.println("Entrada inválida. Certifique-se de usar o formato 'Nome Sexo'.");
			}
		}

		System.out.println("\nGrupo Masculino:");
		for (String nome : grupoMasculino) {
			System.out.println(nome);
		}

		System.out.println("\nGrupo Feminino:");
		for (String nome : grupoFeminino) {
			System.out.println(nome);
		}

		scanner.close();
	}
}
