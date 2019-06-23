package com.esolution.modal;

import java.time.LocalDate;
import java.util.Date;

import org.hamcrest.MatcherAssert;

public class Payment  extends MatcherAssert{

private int paymentNumber;

private long amount;

private LocalDate date;


public Payment(int paymentNumber, long amount, LocalDate date) {
	super();
	this.paymentNumber = paymentNumber;
	this.amount = amount;
	this.date = date;
}

public int getPaymentNumber() {
	return paymentNumber;
}

public void setPaymentNumber(int paymentNumber) {
	this.paymentNumber = paymentNumber;
}

public long getAmount() {
	return amount;
}

public void setAmount(long amount) {
	this.amount = amount;
}

public LocalDate getDate() {
	return date;
}

public void setDate(LocalDate date) {
	this.date = date;
}

@Override
public String toString() {
	return "Payment [paymentNumber=" + paymentNumber + ", amount=" + amount + ", date=" + date + "]";
}
	
	
}
