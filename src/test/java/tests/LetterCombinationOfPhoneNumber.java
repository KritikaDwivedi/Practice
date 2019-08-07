package tests;

import java.util.ArrayList;

public class LetterCombinationOfPhoneNumber {

	public static void main(String[] args) {
		int arr[] = {9};
		String s ="";
		String w="";
		for(int i=0;i<arr.length;i++) {
			switch(arr[i])
			{
			case 2:	s="abc";
					break;
			case 3: s="def";
					break;
			case 4: s="ghi";
					break;
			case 5: s="jkl";
					break;
			case 6: s="mno";
					break;
			case 7: s="pqrs";
					break;
			case 8: s="tuv";
					break;
			case 9: s="wxyz";
					break;		
			}
			w=w+s;
		}
		ArrayList<String> arr2 = new ArrayList<>();
		System.out.println(w);
		for(int i=0;i<w.length();i++) {
			for(int j=i+1;j<w.length()-1;j++) {
				arr2.add(Character.toString(w.charAt(i)).concat(Character.toString(w.charAt(j))));
			}
		}
		System.out.println(arr2);
	}

}
