package com.example.project.leap.Bank;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BankController {
    private BankService bankService;
    public BankController(BankService bankService) {
        this.bankService = bankService;
    }
    @GetMapping("/banks/{id}")
    public Bank getBank(@PathVariable int id) {
        return bankService.getBank(id);
    }
    @PostMapping("/banks")
    public String addBank(@RequestBody Bank bank) {
        bankService.add(bank);
        return "Bank account added successfully";
    }
    @PutMapping("/banks/{id}")
    public String saveBank(@PathVariable int id, @RequestBody Bank bank) {
        bankService.save(id, bank);
        return "Bank account saved successfully";
    }
    @DeleteMapping("/banks/{id}")
    public String deleteBank(@PathVariable int id) {
        bankService.delete(id);
        return "Bank account deleted successfully";
    }
}