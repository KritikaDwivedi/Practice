package tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) throws ParseException {
		String dateToBeArray[]="02 Aug, 2019".split(" ");
		 Date date=new Date();
		 SimpleDateFormat sdf=new SimpleDateFormat("dd MMM, YYYY");
		 String currentDate[]=sdf.format(date).toString().split(" ");
		 if()
	}

}
