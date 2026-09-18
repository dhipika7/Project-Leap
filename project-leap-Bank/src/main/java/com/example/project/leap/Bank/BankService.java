package com.example.project.leap.Bank;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BankService {
    private List<Bank> banks = new ArrayList<>();
    public BankService() {
        banks.add(new Bank(1, "12345", 5000));
        banks.add(new Bank(2, "67890", 10000));
    }
    public Bank getBank(int id) {
        for (Bank bank : banks) {
            if (bank.getId() == id) {
                return bank;
            }
        }
        return null;
    }
    public void add(Bank bank) {
        banks.add(bank);
    }
    public void save(int id, Bank newBank) {
        for (int i = 0; i < banks.size(); i++) {
            if (banks.get(i).getId() == id) {
                banks.set(i, newBank);
                return;
            }
        }
    }
    public void delete(int id) {
        banks.removeIf(bank -> bank.getId() == id);
    }
}