package mod10;

import java.util.Scanner;

public class ValidarNota {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite a nota do Aluno 1: ");
        Double notaAluno1 = scanner.nextDouble();

        System.out.print("Digite a nota do Aluno 2: ");
        Double notaAluno2 = scanner.nextDouble();

        System.out.print("Digite a nota do Aluno 3: ");
        Double notaAluno3 = scanner.nextDouble();

        System.out.print("Digite a nota do Aluno 4: ");
        Double notaAluno4 = scanner.nextDouble();

      
        verificarSituacao("Aluno 1", notaAluno1);
        verificarSituacao("Aluno 2", notaAluno2);
        verificarSituacao("Aluno 3", notaAluno3);
        verificarSituacao("Aluno 4", notaAluno4);

        scanner.close();
    }

    public static void verificarSituacao(String nomeAluno, double nota) {
        if (nota >= 7) {
            System.out.println(nomeAluno + " está Aprovado (Nota: " + nota + ")");
        } else if (nota >= 5.0) {
            System.out.println(nomeAluno + " está de Recuperação (Nota: " + nota + ")");
        } else {
            System.out.println(nomeAluno + " está Reprovado (Nota: " + nota + ")");
        }
    }
}
