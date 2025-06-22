package com.example.dual_auditing.service;

import com.example.dual_auditing.repository.AuditLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuditService {
    private final AuditLogger fileLogger;
    private final AuditLogger databaseLogger;

    public void logEvent(String event){
        fileLogger.log(event);
        databaseLogger.log(event);
    }
}
