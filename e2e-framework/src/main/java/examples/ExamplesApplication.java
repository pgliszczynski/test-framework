package examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "examples")
public class ExamplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamplesApplication.class, args);
    }
}
