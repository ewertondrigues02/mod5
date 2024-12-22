package br.com.ewerton;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassificacaoPessoas {

    Pessoas pessoa1 = new Pessoas("João", "Masculino", "Rua A", "Brasileiro");
    Pessoas pessoa2 = new Pessoas("Carlos", "Masculino", "Rua B", "Mexicano");
    Pessoas pessoa3 = new Pessoas("Ana", "Feminino", "Rua C", "Americana");
    Pessoas pessoa4 = new Pessoas("Maria", "Feminino", "Rua D", "Canadense");
    Pessoas pessoa5 = new Pessoas("Silvio", "Masculino", "Rua E", "Russo");
    Pessoas pessoa6 = new Pessoas("Marcio", "Masculino", "Rua F", "Brasileiro");

    public List<Pessoas> SoMulheres() {
        List<Pessoas> listaPessoas = List.of(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5, pessoa6);
        Stream<Pessoas> streamPessoasMulheres = listaPessoas.stream().filter(pessoas -> pessoas.getSexo().equals("Feminino"));
        return streamPessoasMulheres.collect(Collectors.toList());
    }
}

