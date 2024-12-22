/*
import java.util.Objects;

@Tabela(value = "Nome", campos = "Nome_das_Colunas")
public class TabelaEmTempoExecucao {

    private String nome;
    private String end;
    private String estado;

    public TabelaEmTempoExecucao() {
    }

    public TabelaEmTempoExecucao(String nome, String end, String estado) {
        this.nome = nome;
        this.end = end;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabelaEmTempoExecucao that = (TabelaEmTempoExecucao) o;
        return Objects.equals(getNome(), that.getNome()) && Objects.equals(getEnd(), that.getEnd()) && Objects.equals(getEstado(), that.getEstado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getEnd(), getEstado());
    }

    @Override
    public String toString() {
        return "TabelaEmTempoExecucao{" +
                "nome='" + nome + '\'' +
                ", end='" + end + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
*/
