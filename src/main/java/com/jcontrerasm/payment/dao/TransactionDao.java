package com.jcontrerasm.payment.dao;

import org.springframework.data.repository.CrudRepository;

import com.jcontrerasm.payment.domain.Transaction;

public interface TransactionDao extends CrudRepository<Transaction, Integer> {

}
