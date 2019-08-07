package tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringContainingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My name isKritika12345";
		String[] arr=s.split(" ");
		for(String i:arr) {
			if(i.matches("[0-9]+")) {
				System.out.println("Contains digits "+i);
			}
		}
			Pattern digit=Pattern.compile("[0-9]");
			Matcher match=digit.matcher(s);
			System.out.println(match.find());
			
			if(s.matches(".*\\d.*")) {
				System.out.println("Matches digits");
			}
			
			System.out.println(Pattern.matches(".*\\d.*", s));
		}
	}
