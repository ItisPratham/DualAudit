package com.example.dual_auditing.service;

import com.example.dual_auditing.repository.AuditLogger;
import com.example.dual_auditing.repository.FileAuditLogger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AuditService {
    private final AuditLogger fileLogger;
    private final AuditLogger databaseLogger;

    public AuditService(@Qualifier("fileAuditLogger") FileAuditLogger fileLogger, @Qualifier("databaseAuditLogger") AuditLogger databaseLogger) {
        this.fileLogger = fileLogger;
        this.databaseLogger = databaseLogger;
    }

    public void logEvent(String event) {
        fileLogger.log(event);
        databaseLogger.log(event);
    }
}
