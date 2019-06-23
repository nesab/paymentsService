package com.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.esolution.modal.Payment;
import com.esolution.sort.SortPaymentByDate;
import com.esolution.utils.Utils;

public class PaymentService {

	public static final long AMOUNT = 1000;

	public static void main(String[] args) {

		sortPaymentByComparator();
		sortPaymentByAlgorithm();

	}

	private static void sortPaymentByAlgorithm() {

		List<Payment> payments = generatePaymentsList();
		
		Object[] arr =  payments.toArray(); 

		Payment temp = null;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 1; j < arr.length - 1; j++) {

				if (((Payment) arr[j-1]).getDate().compareTo(((Payment) arr[j]).getDate()) > 0) {

					// swap elements
					Payment firstObj = (Payment) arr[j-1];
					Payment secondObj = (Payment) arr[j];
					temp = (Payment) arr[j-1];
					firstObj = (Payment) arr[j];
					secondObj = temp;

				}
			}
			
			
		}
		for (Object object : arr) {
			
			Payment pay = (Payment) object;
			System.out.println(pay);
		}
	}

	public  static List<Payment> sortPaymentByComparator() {

		List<Payment> payments = generatePaymentsList();

		Collections.sort(payments, new SortPaymentByDate());
		System.out.println(payments.toString());
		return payments;
	}

	public static List<Payment> generatePaymentsList() {

		List<Payment> payments = new ArrayList<Payment>();

		for (int i = 0; i < 1000; i++) {

			Payment payment = new Payment(i, AMOUNT + i, Utils.randomDates());
			payments.add(payment);

		}

		return payments;
	}

}
