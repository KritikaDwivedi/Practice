package tests;

import java.util.HashMap;

public class DuplicateInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="karitikaaaaakaaaa4 is my4 name ";
		char c1 = 0;
		int i;
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(i=0;i<str.length();i++) {
			c1=str.charAt(i);
			if(map.containsKey(c1))
				map.put(c1,map.get(c1)+1);
			else
				map.put(c1, 1);
		}
		System.out.println(map);
	}

}
