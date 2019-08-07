package tests;

public class FindMissingWeekday {

	public static void main(String[] args) {
		String week="mon tue wed fri sat sun";
		String week2=null;
		if(!week.contains("thur")) {
			week2=week.substring(0, week.indexOf("d")+1)+" thur "+week.substring(week.indexOf("fri"), week.length());	
		}
		System.out.println(week2);

	}
}
