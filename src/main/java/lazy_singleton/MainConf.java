package lazy_singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Evgeny Borisov
 */
@SpringBootApplication
@EnableScheduling
public class MainConf {
    public static void main(String[] args) {
        SpringApplication.run(MainConf.class);
    }
}
