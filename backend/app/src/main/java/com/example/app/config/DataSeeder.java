package com.example.app.config;

import com.example.app.entity.Account;
import com.example.app.repository.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class DataSeeder implements CommandLineRunner {

    private final AccountRepository accountRepository;

    public DataSeeder(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void run(String... args) {
        if (accountRepository.count() == 0) {
            accountRepository.save(new Account("SBI001", "Alice", BigDecimal.valueOf(10000)));
            accountRepository.save(new Account("SBI002", "Bob", BigDecimal.valueOf(5000)));
            accountRepository.save(new Account("SBI003", "Charlie", BigDecimal.valueOf(7500)));
            System.out.println("Sample accounts added.");
        }
    }
}
