package ru.demetriuzz.sb.test.integration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import ru.demetriuzz.sb.SbApplication;
import ru.demetriuzz.sb.service.SbApplicationProcessingService;
import ru.demetriuzz.sb.service.SbProcessingService;

@DirtiesContext
@SpringBootTest(classes = {SbApplication.class})
public class DefaultTest {

    @Autowired
    private SbProcessingService sbProcessingService;

    @Test
    @DisplayName("Проверка загрузки переопределенного контекста приложения")
    void overloadContextTest() {
        Assertions.assertThat(sbProcessingService).isNotNull();
        Assertions.assertThat(sbProcessingService).isInstanceOf(SbProcessingService.class);
        // переопределенная версия ETL процесса
        Assertions.assertThat(sbProcessingService.getClass()).isEqualTo(SbApplicationProcessingService.class);
    }

}
