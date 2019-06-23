package com.esolution.sort;

import java.util.Comparator;

import com.esolution.modal.Payment;

public class SortPaymentByDate implements Comparator<Payment>{


	@Override
	public int compare(Payment o1, Payment o2) {
		
		return o2.getDate().compareTo(o1.getDate());
	}

}
