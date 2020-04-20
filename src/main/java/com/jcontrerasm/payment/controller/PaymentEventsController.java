package com.jcontrerasm.payment.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jcontrerasm.payment.domain.Transaction;
import com.jcontrerasm.payment.producer.PaymentEventProducer;
import com.jcontrerasm.payment.service.ITransactionService;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
public class PaymentEventsController {
	
	private Logger log = LoggerFactory.getLogger(PaymentEventsController.class);
	
	@Autowired
	PaymentEventProducer paymentEventProducer;
	@Autowired
	private ITransactionService transactionService;
	
	@PostMapping("/v1/paymentEvent")
	public ResponseEntity<Transaction> postLibraryEvent(@RequestBody Transaction transactionEvent) throws JsonProcessingException {
		Transaction tranSql = transactionService.save(transactionEvent);
		paymentEventProducer.sendPaymentEvent(tranSql);
		return ResponseEntity.status(HttpStatus.CREATED).body(tranSql);
	}
}
