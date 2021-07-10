package com.codeaman;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String args[]) {
		
		Date d= new Date();
		System.out.println("Date d format::::"+d);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
		
		String formattedDate= formatter.format(d);
		
		System.out.println("Formatted Date Format"+formattedDate);
		
		
		
		
	}
	
}
