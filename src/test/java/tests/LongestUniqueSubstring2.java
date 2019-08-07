package tests;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring2 {

	public static void main(String[] args) {
		
		String str = "karkwhjhhddytfbaabba";		
		Set<Character> charSet;
		String curr = "";int k;
		for(int i =0; i< str.length(); i++) {
			for(int j = str.length()-1; j>=i ;j--) {
				charSet = new HashSet<>();
				for(k=i;k<=j;k++) {
					if(!charSet.contains(str.charAt(k))) 
						charSet.add(str.charAt(k));
					else
						break;	
				}
				if(k>j) {
					String temp = str.substring(i, j+1);
					if(temp.length() > curr.length()) {
						curr = temp;
					}
				}
			}
		}
		
		System.out.println(curr + ":"+ curr.length());
	}

}