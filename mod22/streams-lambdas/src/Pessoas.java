import java.util.Objects;

public class Pessoas {

    private String nome;
    private String sexo;
    private String end;
    private String nacionalidade;

    public Pessoas() {
    }

    public Pessoas(String nome, String sexo, String end, String nacionalidade) {
        this.nome = nome;
        this.sexo = sexo;
        this.end = end;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoas pessoas = (Pessoas) o;
        return Objects.equals(getNome(), pessoas.getNome()) && Objects.equals(getSexo(), pessoas.getSexo()) && Objects.equals(getEnd(), pessoas.getEnd()) && Objects.equals(getNacionalidade(), pessoas.getNacionalidade());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getSexo(), getEnd(), getNacionalidade());
    }

    @Override
    public String toString() {
        return "Pessoas{" +
                nome + ", " +
                sexo + ", " +
                end + ", " +
                nacionalidade +
                '}';
    }
}
