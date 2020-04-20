package com.jcontrerasm.payment.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="transaction")
public class Transaction implements Serializable {

	private static final long serialVersionUID = 529224438955617399L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int id;
	
	@Column(name = "nro_borrow")
	private int nroBorrow;
	@Column(name = "fee_amount")
	private double feeAmount;
	private int fee;
	@NotNull
	@Column(name="creation_date")
	private String creationDate;
	@NotNull
	@Column(name="borrow_id")
	private int borrowId;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public int getNroBorrow() {
		return nroBorrow;
	}
	
	public void setNroBorrow(int nroBorrow) {
		this.nroBorrow = nroBorrow;
	}
	
	public double getFeeAmount() {
		return feeAmount;
	}
	
	public void setFeeAmount(double feeAmount) {
		this.feeAmount = feeAmount;
	}
	
	public int getFee() {
		return fee;
	}
	
	public void setFee(int fee) {
		this.fee = fee;
	}
	
	public String getCreationDate() {
		return creationDate;
	}
	
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public int getBorrowId() {
		return borrowId;
	}

	public void setBorrowId(int borrowId) {
		this.borrowId = borrowId;
	}
}
