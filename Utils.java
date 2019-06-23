package com.esolution.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Jafar
 *
 */
public class Utils {
	
	public static void main(String[] args) {
		System.out.println(randomDates());
	}

	
	// method to return Random date
	
	public static LocalDate randomDates() {
		
		LocalDate startDate = LocalDate.of(1900, 1, 1) ; //start date
	    long start = startDate.toEpochDay();
		
		LocalDate endDate = LocalDate.now();   //end date
		 long end = endDate.toEpochDay();
		 
		long randomEpochDay = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
	   return LocalDate.ofEpochDay(randomEpochDay); // random date between the range
		
	}
	
}
