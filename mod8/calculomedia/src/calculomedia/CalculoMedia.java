package calculomedia;

public class CalculoMedia {

	public static void main(String[] args) {

		CalculoMedia calculo = new CalculoMedia(10.0,15.0,20.0,30.0);
		
		Double resultado = calculo.calcularMedia();
		
		System.out.println("A média é: " + resultado);
	}

	private Double num1;
	private Double num2;
	private Double num3;
	private Double num4;

	public CalculoMedia() {
	}

	public CalculoMedia(Double num1, Double num2, Double num3, Double num4) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
	}

	public Double getNum1() {
		return num1;
	}

	public void setNum1(Double num1) {
		this.num1 = num1;
	}

	public Double getNum2() {
		return num2;
	}

	public void setNum2(Double num2) {
		this.num2 = num2;
	}

	public Double getNum3() {
		return num3;
	}

	public void setNum3(Double num3) {
		this.num3 = num3;
	}

	public Double getNum4() {
		return num4;
	}

	public void setNum4(Double num4) {
		this.num4 = num4;
	}



	public Double calcularMedia() {
		Double soma = this.num1 + this.num2 + this.num3 + this.num4;
		return soma / 4;
	}
	

}
