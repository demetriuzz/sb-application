package ru.demetriuzz.sb.configure;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import ru.demetriuzz.sb.autoconfigure.SbAutoConfiguration;
import ru.demetriuzz.sb.service.SbProcessingService;
import ru.demetriuzz.sb.service.SbApplicationProcessingService;

/**
 * Конфигурация сервиса, перед базовой конфигурацией
 */
@AutoConfiguration(before = SbAutoConfiguration.class)
public class SbApplicationConfiguration {

    @Bean
    public SbProcessingService sbProcessingService() {
        return new SbApplicationProcessingService();
    }

}
