package domain;

import jakarta.persistence.*;

@Entity
@Table(name = "Acessorio")
public class Acessorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Supensao")
    private String supensao;

    @Column(name = "Mala")
    private String mala;

    @Column(name = "Freio")
    private String freio;

    @Column(name = "Direcao")
    private String direcao;

    @ManyToOne
    @JoinColumn(name = "id_carro_fk", foreignKey = @ForeignKey(name = "fk_carro_acessorio"), referencedColumnName = "id", nullable = false)
    private Carro carro;


    @ManyToOne
    @JoinColumn(name = "id_marca_fk", foreignKey = @ForeignKey(name = "fk_marca_acessorio"), referencedColumnName = "id", nullable = false)
    private Marca marca;

    public Acessorio(){}

    public Acessorio(String supensao, String mala, String freio, String direcao) {
        this.supensao = supensao;
        this.mala = mala;
        this.freio = freio;
        this.direcao = direcao;
    }

    public String getSupensao() {
        return supensao;
    }

    public void setSupensao(String supensao) {
        this.supensao = supensao;
    }

    public String getMala() {
        return mala;
    }

    public void setMala(String mala) {
        this.mala = mala;
    }

    public String getFreio() {
        return freio;
    }

    public void setFreio(String freio) {
        this.freio = freio;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    @Override
    public String toString() {
        return "Acessorio{" +
                "supensao='" + supensao + '\'' +
                ", mala='" + mala + '\'' +
                ", freio='" + freio + '\'' +
                ", direcao='" + direcao + '\'' +
                '}';
    }
}
