package com.example.dual_auditing.repository;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

@Component
public class FileAuditLogger implements AuditLogger{

    private static final String FILEPATH = "auditLog.txt";

    @Override
    public void log(String event){
        String logEntry = LocalDateTime.now() + " - " + event + System.lineSeparator();
        try {
            Files.write(
                    Paths.get(FILEPATH),
                    logEntry.getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            System.out.println("Exception : " + e);
        }
    }
}
