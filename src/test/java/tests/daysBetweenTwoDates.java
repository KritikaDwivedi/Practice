package tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class daysBetweenTwoDates 
{

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
//			int workingDays=0;
//			String startDate="01-Mar-2018";
//			String endDate="03-Mar-2018";
//		    SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
//		    try
//		    {
//		      //Date start = sdf.parse(startdate);
//		      Calendar start = Calendar.getInstance();
//		      start.setTime(sdf.parse(startDate));
//		      System.out.println(start);
//		      //Date end = sdf.parse(enddate);
//		      Calendar end = Calendar.getInstance();
//		      end.setTime(sdf.parse(endDate));
//		      System.out.println(end);
//		      while(!start.after(end))//removed ; (semi-colon)
//		      {
//		        //int day = start.getDay();
//		        int day = start.get(Calendar.DAY_OF_WEEK);
//		        //if ((day != Calendar.SATURDAY) || (day != Calendar.SUNDAY)) if it's sunday, != to Saturday is true
//		        if ((day != Calendar.SATURDAY) && (day != Calendar.SUNDAY))
//		        workingDays++;
//		        //System.out.println(workingDays);//moved
//		        start.add(Calendar.DATE, 1);//removed comment tags
//		      }
//		      System.out.println(workingDays);
//	
//		String dateFrom="Current Date+1";
//		String dateFromArray[]=dateFrom.split("\\+");
//		System.out.println(dateFromArray[0]);
//		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");   
//	    Calendar c = Calendar.getInstance();
//	    c.add(Calendar.DAY_OF_MONTH, Integer.parseInt(dateFromArray[dateFromArray.length-1]));  
//		String newDate = formatter.format(c.getTime());  
//		System.out.println(newDate);  
//		String date="CurrentDate 10:12 AM";
//		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");  
//	    Date date1 = new Date();  
//		String currentDate=formatter.format(date1);
//		String dateTime=date.replace("CurrentDate", currentDate);
//		System.out.println(dateTime);
		
//		String dateFrom="currentDate+1";
//		String dateTo="currentDate+1";
//		String dateFromArray[]=dateFrom.split("\\+");
//		String dateToArray[]=dateTo.split("\\+");
//		
//		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy"); 
//		
//	    Calendar c1 = Calendar.getInstance();
//	    c1.add(Calendar.DAY_OF_MONTH,Integer.parseInt(dateFromArray[(dateFromArray.length)-1]));  
//		String newFromDate = formatter.format(c1.getTime()); 
//		System.out.println(newFromDate);
//		
//		Calendar c2 = Calendar.getInstance();
//		c2.add(Calendar.DAY_OF_MONTH,Integer.parseInt(dateToArray[(dateToArray.length)-1]));  
//		String newToDate = formatter.format(c2.getTime()); 
//		System.out.println(newToDate);
//		    }
//		    catch(Exception e)
//		    {
//		      e.printStackTrace();
//		    }
//	}
		int workingDays=0;
		String startDate="18-September-2018";
		String endDate="25-September-2018";
	    SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
	      Calendar start = Calendar.getInstance();
	      start.setTime(sdf.parse(startDate));

	      Calendar end = Calendar.getInstance();
	      end.setTime(sdf.parse(endDate));

	      while(!start.after(end))//removed ; (semi-colon)
	      {
	        int day = start.get(Calendar.DAY_OF_WEEK);
	        if ((day != Calendar.SATURDAY) && (day != Calendar.SUNDAY))
	        workingDays++;
	        start.add(Calendar.DATE, 1);	
	      }
	      System.out.println(workingDays);
}}
