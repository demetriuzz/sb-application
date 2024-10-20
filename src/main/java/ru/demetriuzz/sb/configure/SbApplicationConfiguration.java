package ru.demetriuzz.sb.configure;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.demetriuzz.sb.starter.service.SbProcessingService;
import ru.demetriuzz.sb.service.SbApplicationProcessingService;

/**
 * Конфигурация сервиса, перед базовой конфигурацией
 */
@Configuration
public class SbApplicationConfiguration {

    @Bean
    public SbProcessingService sbProcessingService() {
        return new SbApplicationProcessingService();
    }

}
