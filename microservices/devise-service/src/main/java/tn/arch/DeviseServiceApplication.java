package tn.arch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("tn.atch.acrh.DeviseService")
public class DeviseServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeviseServiceApplication.class, args);
    }
}