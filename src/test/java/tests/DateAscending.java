package tests;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class DateAscending {
public static void main(String[] args) throws ParseException {

	ArrayList<Date> al=new ArrayList<>();
	al.add(new SimpleDateFormat("dd/MM/yyyy").parse("02/02/2000"));
	al.add(new SimpleDateFormat("dd/MM/yyyy").parse("02/01/2001"));
//	al.add("02-03-2000");
//	al.add("05-02-2006");
//	al.add("01-04-2008");
	
	Collections.sort(al);
	System.out.println(al);
}
}

