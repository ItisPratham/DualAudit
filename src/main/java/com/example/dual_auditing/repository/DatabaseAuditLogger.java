package com.example.dual_auditing.repository;

import org.springframework.stereotype.Component;

@Component
public class DatabaseAuditLogger implements AuditLogger{
    @Override
    public void log(String event){
        System.out.println("DB log: " + event);
    }
}
