package io.weli.pili;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.Properties;

// $ mvn spring-boot:run
@SpringBootApplication
public class PiliApplication {

    public static void main(String[] args) {

        SpringApplication app =
                new SpringApplication(PiliApplication.class);

//        SpringApplication.run(PiliApplication.class, args);

        Properties properties = new Properties();
//        properties.setProperty("spring.resources.static-locations",
//                "/tmp/pili/");
        app.setDefaultProperties(properties);

        app.run(args);

    }

//    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }
}
