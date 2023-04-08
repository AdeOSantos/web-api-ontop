package com.ontop.webapi.webapiontop.web;

import com.ontop.webapi.webapiontop.model.Account;
import com.ontop.webapi.webapiontop.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AccountController {

    private final AccountService accountService;

    public AccountController (AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/")
    public String hello(){
        return "Olá";
    }

    @GetMapping("/accounts")
    public Iterable<Account> get() {
        return accountService.get();
    }

    @GetMapping("/account/{id}")
    public Account get(@PathVariable Integer id) {
        Account account = accountService.get(id);
        if ( account == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return account;
    }

    @DeleteMapping("/account/{id}")
    public void delete(@PathVariable Integer id) {
        accountService.remove(id);
    }

    @PostMapping("/account")
        //public Account create(@RequestPart("data")MultipartFile file) throws IOException {
        public Account create(Account account) throws IOException {
            return accountService.save(account.getName(), account.getSurname(), account.getRoutingNumber()
                    , account.getNationalId(), account.getAccountNumber(), account.getBankName());
    }


}
