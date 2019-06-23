package com.esolution.test;

import static org.junit.Assert.assertThat;

import java.util.List;
import java.util.regex.Matcher;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Test;

import com.esolution.modal.Payment;
import com.service.PaymentService;

public class TestPaymentService {

	@Test
	public void sortPaymmentObjectByComparator() {

		List<Payment> payments = PaymentService.sortPaymentByComparator();

		assertThat;
		
		assertThat(payments, isInDescendingOrdering);
	}

	
	 private Matcher<Payment> isInDescendingOrdering()
	  {
	    return new TypeSafeMatcher<List<Payment>>()
	    {
	      @Override
	      public void describeTo (Description description)
	      {
	        description.appendText("describe the error has you like more");
	      }

	      @Override
	      protected boolean matchesSafely (List<Payment> payments)
	      {
	        for(int i = 0 ; i < payments.size() -1; i++) {
	          if(payments.get(i).getDate().compareTo(payments.get(i+1).getDate())< 0) return false;
	        }
	        return true;
	      }
	    };
	  }
}
