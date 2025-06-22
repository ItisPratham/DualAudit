package com.example.dual_auditing.controller;

import com.example.dual_auditing.service.AuditService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/audit")
public class AuditController {
    private final AuditService auditService;

    @PostMapping
    public ResponseEntity<String> audit(@RequestBody String event) {
        auditService.logEvent(event);
        return ResponseEntity.ok("Audited");
    }

}
