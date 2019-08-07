package tests;

import java.util.HashMap;

public class FrequencyOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="kritika is my name";
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(!map.containsKey(c))
				map.put(c, 1);
			else
				map.put(c, map.get(c)+1);
		}
		System.out.println(map);
	}

}
