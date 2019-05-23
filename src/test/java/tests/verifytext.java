package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class verifytext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fields=" Purpose of Travel,Type,Journey From,Journey To,Journey Start Date,Journey End Date, Client / Project Name";
//	List<String> lis=new ArrayList<String>();
	List<String> myList = new ArrayList<String>(Arrays.asList(fields.split(",")));
	for(String field : myList)
	{
		System.out.println(field);
	}

		
	}

}
