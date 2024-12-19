public abstract class Car {

    private String nome;
    private Double potenciaMotor;
    private String transmissao;
    private String rodas;
    private String freios;
    private String iluminacao;

    public Car(Double potenciaMotor, String transmissao, String rodas, String freios, String iluminacao) {
        this.potenciaMotor = potenciaMotor;
        this.transmissao = transmissao;
        this.rodas = rodas;
        this.freios = freios;
        this.iluminacao = iluminacao;
    }

    /*public void potenciaMotor() {
        System.out.println("Ele conta com " + potenciaMotor + " de potência");
    }

    public void tipoTransmissao() {
        System.out.println(transmissao);
    }

    public void tiposRodas() {
        System.out.println("Ele vem com " + rodas + " de fábrica");
    }

    public void tipoFreios() {
        System.out.println(freios + " nas quatros rodas em todas as versões");
    }

    public void tipoIluminacao(){
        System.out.println(iluminacao + " com versões em Led e Alógenas");
    }*/

    @Override
    public String toString() {
        return "Car{" +
                this.getClass().getSimpleName() +
                ", potenciaMotor=" + potenciaMotor +
                ", transmissao='" + transmissao + '\'' +
                ", rodas='" + rodas + '\'' +
                ", freios='" + freios + '\'' +
                ", iluminacao='" + iluminacao + '\'' +
                '}';
    }
}
