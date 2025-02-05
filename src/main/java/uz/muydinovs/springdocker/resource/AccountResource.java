package uz.muydinovs.springdocker.resource;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import uz.muydinovs.springdocker.model.Account;
import uz.muydinovs.springdocker.service.AccountService;

import java.util.List;

import static uz.muydinovs.springdocker.resource.EmployeeResource.getLocation;

@RestController
@RequiredArgsConstructor
@RequestMapping("/accounts")
public class AccountResource {
    private final AccountService accountService;

    @PostMapping
    public ResponseEntity<Account> createAccount(@Validated @RequestBody Account account) {
        Account newAccount = accountService.createAccount(account);
        return ResponseEntity.created(getLocation(newAccount.getId())).body(newAccount);
    }

    @GetMapping
    public ResponseEntity<List<Account>> getAccounts() {
        return ResponseEntity.ok(accountService.getAllAccounts());
    }


}
