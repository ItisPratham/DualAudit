package com.example.dual_auditing.controller;

import com.example.dual_auditing.service.AuditService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuditController {
    private final AuditService auditService;

    public ResponseEntity<String> audit(@RequestBody String event) {
        auditService.logEvent(event);
        return ResponseEntity.ok("Audited");
    }

}
