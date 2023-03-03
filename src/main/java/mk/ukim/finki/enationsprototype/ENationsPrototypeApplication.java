package mk.ukim.finki.enationsprototype;

import mk.ukim.finki.enationsprototype.model.PoliticalParty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableJpaRepositories
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableTransactionManagement

public class ENationsPrototypeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ENationsPrototypeApplication.class, args);
    }

}
