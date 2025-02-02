package br.com.ewertonrodrigues.SpringBootPrimeiroExemplo.springbootprimeiroexemplo;

import br.com.ewertonrodrigues.SpringBootPrimeiroExemplo.domain.Cliente;
import br.com.ewertonrodrigues.SpringBootPrimeiroExemplo.repository.IClienteRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.logging.Logger;

@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackages = "br.com.ewertonrodrigues.SpringBootPrimeiroExemplo.repository")
@EntityScan("br.com.rpires.*")
@ComponentScan(basePackages = "br.com.ewertonrodrigues")
public class SpringBootPrimeiroExemploApplication implements CommandLineRunner {

    private static final Logger log = (Logger) LoggerFactory.getLogger(SpringBootPrimeiroExemploApplication.class);

    @Autowired
    private IClienteRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPrimeiroExemploApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("StartApplication...");
        Cliente cliente = createCliente();
        repository.save(cliente);
    }

    private Cliente createCliente() {
        return Cliente.builder()
                .cidade("SC")
                .cpf(12312312310L)
                .email("Teste@teste.com")
                .end("End")
                .estado("SC")
                .nome("Teste Spring Boot")
                .numero(102030)
                .tel(23654578L)
                .build();
    }

}