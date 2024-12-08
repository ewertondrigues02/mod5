package mod13;

public class PessoaFisica extends Pessoa {

	private String cpf;

	public PessoaFisica(String nome, String endereco, String cpf) {
		super(nome, endereco);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("Pessoa Física: ");
		System.out.println("Nome: " + getNome());
		System.out.println("Endereco: " + getEndereco());
		System.out.println("CPF: " + cpf);

	}

}
