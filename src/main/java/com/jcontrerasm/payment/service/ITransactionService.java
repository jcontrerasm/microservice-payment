package com.jcontrerasm.payment.service;

import com.jcontrerasm.payment.domain.Transaction;

public interface ITransactionService {
	public Transaction save(Transaction transaction);
}
