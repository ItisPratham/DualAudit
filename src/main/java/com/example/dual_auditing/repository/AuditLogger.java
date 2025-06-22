package com.example.dual_auditing.repository;

public interface AuditLogger {
    void log(String event);
}
