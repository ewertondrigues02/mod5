import java.lang.reflect.Method;

public class TabelaExemplo {
    public static void main(String[] args) throws Exception {

        TabelaEmTempoExecucao execucao = new TabelaEmTempoExecucao();

        System.out.println(execucao.getClass().getAnnotation(Tabela.class));

       /* TabelaExemplo tabelaExemplo = new TabelaExemplo();
        ExecucaoTabela.criandoTabela();

        Method tabelaCriada = ExecucaoTabela.class.getMethod("criandoTabela");
        Tabela anotacaoTabela = tabelaCriada.getAnnotation(Tabela.class);

        if (anotacaoTabela != null) {
            System.out.println("Value " + anotacaoTabela.value());
            System.out.println("Campos " + anotacaoTabela.campos());
        }*/
    }
}