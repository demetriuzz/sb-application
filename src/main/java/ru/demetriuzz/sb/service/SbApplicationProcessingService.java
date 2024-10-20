package ru.demetriuzz.sb.service;

import lombok.extern.slf4j.Slf4j;
import ru.demetriuzz.sb.starter.service.SbProcessingService;

/**
 * Основной класс запуска процесса обработки, реализация базового интерфейса
 */
@Slf4j
public class SbApplicationProcessingService implements SbProcessingService {

    public SbApplicationProcessingService() {
        log.info("Application SbProcessingService");
    }

    @Override
    public void execute() {
        log.info("execute");
    }

}
