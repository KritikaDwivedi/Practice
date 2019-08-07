package tests;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring3 {

	public static void main(String[] args) {
		String str = "karkwhjhhddytfbaabba";		
		Set<Character> charSet;int len=0;String temp="";int k;
			for(int i=0;i<str.length();i++) {
				for(int j=str.length()-1;j>=i;j--) {
					charSet=new HashSet<>();
				for(k=i;k<=j;k++) {
					if(!charSet.contains(str.charAt(k)))
						charSet.add(str.charAt(k));
					else 
						break;
				}
				if(k>j) {
					temp = str.substring(i, j+1);
					len=Math.max(charSet.size(),len);
				}
			}
		}
		System.out.println(temp+""+len);
	}

}
