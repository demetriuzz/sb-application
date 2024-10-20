package ru.demetriuzz.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SbApplication {

    public static void main(String[] args) {
        final var context = SpringApplication.run(SbApplication.class);

        final var beans = context.getBeanDefinitionNames();
        Arrays.sort(beans);
        Arrays.stream(beans).forEach(b -> {
            System.out.printf("-> %s [%s]%n", b, context.getBean(b).getClass().getName());
        });
    }

}
