package ewertonrodriguesebac;

// Objeto do tipo caneta
public class Caneta {

	public static void main(String[] args) {

		// Caneta sendo instaciada com os atributos cor Azul e carga sendo True ou seja tendo carga
		Caneta minhaCaneta = new Caneta("Azul", true);
		
		boolean conseguiuEscrever = minhaCaneta.escrever();

	}

	private String cor;
	private boolean carga;

	public Caneta() {
	}

	public Caneta(String cor, boolean carga) {
		super();
		this.cor = cor;
		this.carga = carga;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean getCarga() {
		return carga;
	}

	public void setCarga(boolean carga) {
		this.carga = carga;
	}

	// Método escrever para verificar se a cor e a carga estão nos valores instaciados
	public boolean escrever() {
		if (this.carga) {
			System.out.println("A caneta está escrevendo com a cor " +  this.cor);
			return true;
		} else
			System.out.println("A caneta esta sem carga");
		return false;
	}

}
