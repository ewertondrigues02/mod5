package br.com.ewerton;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class ClassificacaoPessoasTeste {

    PessoasTeste pessoa1 = new PessoasTeste("João", "Masculino", "Rua A", "Brasileiro");
    PessoasTeste pessoa2 = new PessoasTeste("Carlos", "Masculino", "Rua B", "Mexicano");
    PessoasTeste pessoa3 = new PessoasTeste("Ana", "Feminino", "Rua C", "Americana");
    PessoasTeste pessoa4 = new PessoasTeste("Maria", "Feminino", "Rua D", "Canadense");
    PessoasTeste pessoa5 = new PessoasTeste("Silvio", "Masculino", "Rua E", "Russo");
    PessoasTeste pessoa6 = new PessoasTeste("Marcio", "Masculino", "Rua F", "Brasileiro");

    @Test
    public void SoMulheres() {

        List<PessoasTeste> listaPessoas = List.of(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5, pessoa6);
        List<PessoasTeste> mulheres = listaPessoas.stream()
                .filter(pessoa -> pessoa.getSexo().equals("Feminino"))
                .collect(Collectors.toList());

        Assert.assertEquals(2, mulheres.size());
        Assert.assertTrue(
                mulheres.stream().allMatch(pessoa -> pessoa.getSexo().equals("Feminino"))
        );
    }
}