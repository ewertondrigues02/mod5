package mod13;

public class PessoaJuridica extends Pessoa {

	private String cnpj;

	public PessoaJuridica(String nome, String endereco, String cnpj) {
		super(nome, endereco);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("Pessoa Juridica: ");
		System.out.println("Nome: " + getNome());
		System.out.println("Endereco: " + getEndereco());
		System.out.println("CNPJ: " + cnpj);

	}

}
