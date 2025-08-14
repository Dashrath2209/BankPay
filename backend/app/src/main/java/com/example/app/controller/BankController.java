package com.example.app.controller;

import com.example.app.config.BankProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    private final BankProperties bankProperties;

    public BankController(BankProperties bankProperties) {
        this.bankProperties = bankProperties;
    }

    @GetMapping("/bank-info")
    public BankProperties getBankInfo() {
        return bankProperties;
    }
}
