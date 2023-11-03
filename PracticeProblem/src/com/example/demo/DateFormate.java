package com.example.demo;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateFormate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    
		        String inputString = "22/08/2023"; // Replace this with your actual input string
		        String inputFormat = "dd/MM/yyyy"; // Format of the input string

		        String outputFormat = "yyyy/MM/dd"; // Desired output format

		        SimpleDateFormat inputDateFormat = new SimpleDateFormat(inputFormat);
		        System.out.println(inputDateFormat); 
		        SimpleDateFormat outputDateFormat = new SimpleDateFormat(outputFormat);
		        System.out.println(outputDateFormat); 

		        try {
		            // Parse the input string to a Date object
		            Date date = inputDateFormat.parse(inputString);
		            System.out.println(date); 

		            // Format the Date object to the desired output format
		            String outputString = outputDateFormat.format(date);
		            
		            System.out.println(outputString); // Print the converted string in "yyyy/mm/dd" format
		        } catch (ParseException e) {
		            e.printStackTrace();
		        }
		    }
		

	}

