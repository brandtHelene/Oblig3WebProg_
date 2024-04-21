package kinoprogram.kinooblig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KinoObligApplication {

    private static final Logger logger = LoggerFactory.getLogger(KinoObligApplication.class);

    static {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            logger.error("Kunne ikke finne JDBC-driverklassen", e);

        }
    }

    public static void main(String[] args) {
        SpringApplication.run(KinoObligApplication.class, args);
    }

}


