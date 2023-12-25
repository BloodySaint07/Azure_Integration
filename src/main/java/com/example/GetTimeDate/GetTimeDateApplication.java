package com.example.GetTimeDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class GetTimeDateApplication {

	public static void getCurrentTimeUsingDate() {
		Date date = new Date();
		String strDateFormat = "hh:mm:ss a";
		DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
		String formattedDate= dateFormat.format(date);
		System.out.println("Current time of the day using Date - 12 hour format: " + formattedDate);
	}
	public static void getCurrentTimeUsingCalendar() {
		Calendar cal = Calendar.getInstance();
		Date date=cal.getTime();
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		String formattedDate=dateFormat.format(date);
		System.out.println("Current time of the day using Calendar - 24 hour format: "+ formattedDate);
	}

	public static void main(String[] args) {
		SpringApplication.run(GetTimeDateApplication.class, args);

             getCurrentTimeUsingDate();
		     getCurrentTimeUsingCalendar();



	}

}
