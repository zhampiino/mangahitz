package com.project.mangahitz.utils;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class CalendarUtils {

	private static Locale DEFAULT_LOCALE = new Locale("en", "US");

	public static String DDMMYYYY = "dd/MM/yyyy";
	public static String DDMMYYYYHHMMSS = "dd/MM/yyyy HH:mm:ss";
	
	public static String getRelativeTime(Date date) {
		
	
		Date current = Calendar.getInstance(DEFAULT_LOCALE).getTime();
		DecimalFormat formatter = new DecimalFormat("#,###");
		
		long diff = current.getTime() - date.getTime();
        long diffSeconds = diff / 1000 % 60;
        long diffMinutes = diff / (60 * 1000) % 60;
        long diffHours = diff / (60 * 60 * 1000);
        int diffInDays = (int) ((current.getTime() - date.getTime()) / (1000 * 60 * 60 * 24));
        
/*        if (diffInDays > 365) {
        	return "เมื่อ " + formatter.format(diffInDays / 365) + " ปีที่แล้ว";
        }
        
        if (diffInDays > 30) {
        	return "เมื่อ " + formatter.format(diffInDays / 30) + " เดือนที่แล้ว";
        }*/
        
 /*       if (diffInDays > 7) {
        	
        	if((diffInDays % 7) == 0)
        		return "เมื่อ " + formatter.format(diffInDays / 7) + " สัปดาห์ที่แล้ว";
        	else
        		return "";
        }*/
        
        if (diffInDays > 7) {
        	return "";
        }
        
        if (diffInDays > 0) {
        	return "เมื่อ " + formatter.format(diffInDays) + " วันที่แล้ว";
        }
        
        if (diffHours > 0) {
        	return "เมื่อ " + formatter.format(diffHours) + " ชั่วโมงที่แล้ว";
        }
		
        if (diffMinutes > 0) {
        	return "เมื่อ " + formatter.format(diffMinutes) + " นาทีที่แล้ว";
        }
        
        if (diffSeconds > 0) {
        	return "เมื่อ " + formatter.format(diffSeconds) + " วินาทีที่แล้ว";
        }
		
		return "";
	}
	
}
