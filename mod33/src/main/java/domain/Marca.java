package domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "marca")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Toyota")
    private String toyota;

    @Column(name = "Honda")
    private String honda;

    @Column(name = "Fiat")
    private String fiat;

    @Column(name = "Renault")
    private String renault;


    @OneToMany(mappedBy = "marca", cascade = CascadeType.ALL)
    private List<Carro> carros;


    @OneToMany(mappedBy = "marca", cascade = CascadeType.ALL)
    private List<Acessorio> acessorios;

    public Marca(){}

    public Marca(String toyota, String honda, String fiat, String renault) {
        this.toyota = toyota;
        this.honda = honda;
        this.fiat = fiat;
        this.renault = renault;
    }

    public String getToyota() {
        return toyota;
    }

    public void setToyota(String toyota) {
        this.toyota = toyota;
    }

    public String getHonda() {
        return honda;
    }

    public void setHonda(String honda) {
        this.honda = honda;
    }

    public String getFiat() {
        return fiat;
    }

    public void setFiat(String fiat) {
        this.fiat = fiat;
    }

    public String getRenault() {
        return renault;
    }

    public void setRenault(String renault) {
        this.renault = renault;
    }

    @Override
    public String toString() {
        return "Marca{" +
                "toyota='" + toyota + '\'' +
                ", honda='" + honda + '\'' +
                ", fiat='" + fiat + '\'' +
                ", renault='" + renault + '\'' +
                '}';
    }
}
