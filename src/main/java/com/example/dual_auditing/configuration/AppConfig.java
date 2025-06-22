package com.example.dual_auditing.configuration;


import com.example.dual_auditing.repository.AuditLogger;
import com.example.dual_auditing.repository.DatabaseAuditLogger;
import com.example.dual_auditing.repository.FileAuditLogger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean
    @Qualifier("databaseAuditLogger")
    AuditLogger getDataBaseAuditLogger() {
        return new DatabaseAuditLogger();
    }


    @Bean
    @Qualifier("fileAuditLogger")
    AuditLogger getFileAuditLogger() {
        return new FileAuditLogger();
    }


}
