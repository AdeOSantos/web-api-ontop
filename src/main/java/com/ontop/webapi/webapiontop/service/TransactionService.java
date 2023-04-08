package com.ontop.webapi.webapiontop.service;

import com.ontop.webapi.webapiontop.model.Transaction;
import com.ontop.webapi.webapiontop.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionService (TransactionRepository transactionRepository){
        this.transactionRepository = transactionRepository;
    }

    public Iterable<Transaction> get(){
        return transactionRepository.findAll();
    }

    public Transaction get(Integer id){
        return transactionRepository.findById(id).orElse(null);
    }

    public void remove (Integer id){
        transactionRepository.deleteById(id);
    }

    public Transaction save ( Integer amount, Integer user_id) {

            Transaction transaction = new Transaction();
            transaction.setAmount(amount);
            transaction.setUser_id(user_id);
            transactionRepository.save(transaction);
            return transaction;
    }




}
