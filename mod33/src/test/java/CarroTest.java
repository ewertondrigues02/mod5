import dao.CarroDao;
import dao.ICarroDao;
import domain.Carro;
import org.junit.Test;

public class CarroTest {

    private ICarroDao carroDao;

    public CarroTest() {
        carroDao = new CarroDao();
    }

    @Test
    public void cadastrar() {
        Carro carro = new Carro();

        carro.setNome("Corola");
        carro.setAvaliacao("Nota 5");
        carro.setPotencia(220);
        carro.setTipo("Sedan");

        carroDao.cadastrar(carro);

    }
}
