package com.ontop.webapi.webapiontop.web;


import com.ontop.webapi.webapiontop.model.Transaction;
import com.ontop.webapi.webapiontop.service.TransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;


@RestController
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController ( TransactionService transactionService){
        this.transactionService = transactionService;
    }

    @GetMapping("/transactions")
    public Iterable<Transaction> get() {
        return transactionService.get();
    }


    @GetMapping("/transaction/{id}")
    public Transaction get(@PathVariable Integer id) {
        Transaction transaction = transactionService.get(id);
        if (transaction == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return transaction;

    }

    @DeleteMapping("/transaction/{id}")
    public void delete (@PathVariable Integer id){

        transactionService.remove(id);

    }

    @PostMapping("/transaction")
    public Transaction create (Transaction transaction) throws IOException {

        return transactionService.save(transaction.getAmount(), transaction.getUser_id());

    }

}
