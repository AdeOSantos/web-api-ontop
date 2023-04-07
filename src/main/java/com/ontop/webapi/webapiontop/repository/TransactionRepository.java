package com.ontop.webapi.webapiontop.repository;

import com.ontop.webapi.webapiontop.model.Account;
import org.springframework.data.repository.CrudRepository;


public interface TransactionRepository extends CrudRepository< Account, Integer> {

}