package com.ontop.webapi.webapiontop.service;

import com.ontop.webapi.webapiontop.model.Account;
import com.ontop.webapi.webapiontop.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {


    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {

        this.accountRepository = accountRepository;
    }


    public Iterable<Account> get() {
        return accountRepository.findAll();
    }

    public void Account get(Integer id) {
        return accountRepository.findById(id).orElse(null);
    }


    public Account remove (Integer id){
            accountRepository.deleteById(id);
    }

    public  Account save( String name, String surname, Integer routingNumber,
                         Integer nationalId, Integer accountNumber, String bankName  ){

        Account account = new Account();


        AccountRepository.save(account);
        return account;
    }



}
