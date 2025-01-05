package domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_carro")
public class Carro {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "Potencia")
    private Integer potencia;

    @Column(name = "Tipo")
    private String tipo;

    @Column(name = "Avalicao")
    private String avaliacao;


    @ManyToOne
    @JoinColumn(name = "id_marca_fk", foreignKey = @ForeignKey(name = "fk_marca_carro"), referencedColumnName = "id", nullable = false)
    private Marca marca;


    @OneToMany(mappedBy = "carro")
    private List<Acessorio> acessorios;

    public Carro() {}

    public Carro(String nome, Integer potencia, String tipo, String avaliacao) {
        this.nome = nome;
        this.potencia = potencia;
        this.tipo = tipo;
        this.avaliacao = avaliacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", potencia=" + potencia +
                ", tipo='" + tipo + '\'' +
                ", avaliacao='" + avaliacao + '\'' +
                '}';
    }
}
