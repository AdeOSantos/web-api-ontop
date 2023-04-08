package com.ontop.webapi.webapiontop.repository;


import com.ontop.webapi.webapiontop.model.Transaction;
import org.springframework.data.repository.CrudRepository;


public interface TransactionRepository extends CrudRepository<Transaction, Integer> {

}