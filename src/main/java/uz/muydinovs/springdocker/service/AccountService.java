package uz.muydinovs.springdocker.service;

import uz.muydinovs.springdocker.model.Account;

import java.util.List;

public interface AccountService {
    Account createAccount(Account account);
    Account findByUsername(String username);
    List<Account> getAllAccounts();
}
