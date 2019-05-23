package tests;
import java.io.*;

public class reverseString {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader cin=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String:");
		String s=cin.readLine();
		int length=s.length();
		int i;char c;String w="";
		for(i=length-1;i>0;i--) {
			c=s.charAt(i);
			w=w+c;
		}
		System.out.println("String after reverse is: "+w);
		
		
	}

}
