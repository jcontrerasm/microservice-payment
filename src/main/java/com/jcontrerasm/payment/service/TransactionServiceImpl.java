package com.jcontrerasm.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jcontrerasm.payment.dao.TransactionDao;
import com.jcontrerasm.payment.domain.Transaction;

@Service
public class TransactionServiceImpl implements ITransactionService {
	
	@Autowired
	private TransactionDao transactionDao;
	
	@Override
	@Transactional
	public Transaction save(Transaction transaction) {
		return transactionDao.save(transaction);
	}
}
