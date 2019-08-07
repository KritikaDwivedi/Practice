package tests;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern="YYYY-MM-dd";
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		String currentDate=sdf.format(new Date());
		System.out.println(currentDate);
		String[] dateArray="2020-01-20".split("-");
		String monthToSelect=dateArray[1];
		System.out.println("monthToSelect="+monthToSelect);
		
		String Month="JULY 2019";
		System.out.println(Month);
		String[] monthArray=Month.split(" ");
		String monthCurrVal=getMonthInValue(monthArray[0].trim());
		System.out.println(monthCurrVal);
		int yearDiff=Integer.parseInt(monthArray[1])-Integer.parseInt(dateArray[0]);
		org.testng.Reporter.log("year Dif>>>>>>>>>>>>>>>>>"+yearDiff,true);		
		int monthDiff=Integer.parseInt(monthCurrVal)-Integer.parseInt(monthToSelect);
		org.testng.Reporter.log("month Diff>>>>>>>>>>>>>"+monthDiff,true);
		int click=0;
		if(yearDiff==0) {
			if(monthDiff<0)
				click=monthDiff;//right click
			else
				click=monthDiff;//left click
				
		}
		else if(yearDiff<0) {
			//right click
				click=yearDiff*12+monthDiff;
		}
		else {
			//left click
				click=yearDiff*12-monthDiff;
		}
		
		System.out.println(click);
	}
	
	public static String getMonthInValue(String monthName) {
		switch (monthName) { 
			case "JANUARY": return "01"; 
			case "FEBRUARY":return "02";
			case "MARCH":return "03";
			case "APRIL":return "04";
			case "MAY":return "05";
			case "JUNE":return "06";
			case "JULY":return "07"; 
			case "AUGUST":return "08";
			case "SEPTEMBER":return "09";
			case "OCTOBER":return "10";
			case "NOVEMBER":return "11";
			case "DECEMBER":return "12";
			}
		return "00";
		
	}

}
