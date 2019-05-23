package tests;

import java.text.ParseException;

public class dateFormatCheck {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
//		sString expensedate="08August2018";
//		String datePattern = "\\d{4}-\\d{2}-\\d{4}";
//
//		String date1 = "abcd";
//		String date2 = "01-2vgh1-2";
//		new SimpleDateFormat("dd-MMMM-yyyy").parse(date2);
//		System.out.println("valid");
//		Boolean isDate1 = date1.matches(datePattern);
//		Boolean isDate2 = date2.matches(datePattern);
//
//		System.out.println(isDate1);
//		System.out.println(isDate2);
		
		String dateTime="29-Sep-2018 01:06 PM";
		String date_dd_MM_yyyy[] = (dateTime.split(" ")[0]).split("-");
		String time[]=(dateTime.split(" ")[1]).split(":");
//		dateTime = dateTime.split(" ")[1]+" "+dateTime.split(" ")[2];
		System.out.println("time "+time[0]);
		if(dateTime.split(" ")[2].equals("AM"))
		{
			System.out.println(time[0]);
		}
		else
		{	int hrdiff=12-Integer.parseInt(time[0]);
			System.out.println(hrdiff);
		}
		
		
		
	}

}
