package tests;

import java.util.LinkedHashMap;

public class ConvertOneStringToAnotherWithMinEdits {

	public static void main(String[] args) {
		String str1 = "mondayyy", str2 = "amonday ";
		int len1=str1.length();
		int len2=str2.length();
		if(len1==len2)
			replace(str1,str2);
		else if(len1<len2)
			insert(str2,str1);
		else
			insert(str1,str2);
	}

	public static void replace(String str1, String str2) {
		String w="";
		int c=0;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)!=str2.charAt(i)) {
				w=w+str2.charAt(i);
				c++;
			}
			else
				w=w+str1.charAt(i);
		}
		System.out.println(c);
	}
	
	public static void insert(String str1, String str2) {
		
		int diff=0;
//		for(int i=0;i<str2.length();i++) {
//			if(str1.charAt(i)!=str2.charAt(i)) {
//				diff++;
//			}
//		}
		LinkedHashMap<Character,Integer> map1=new LinkedHashMap<>();
		LinkedHashMap<Character,Integer> map2=new LinkedHashMap<>();
		for(int i=0;i<str1.length();i++) {
			if(!map1.containsKey(str1.charAt(i))) {
				map1.put(str1.charAt(i),1);
			}
			else {
				int k=map1.get(str1.charAt(i))+1;
				map1.put(str1.charAt(i),k);
			}
		}
		System.out.println(map1);
		
		for(int i=0;i<str2.length();i++) {
			if(!map2.containsKey(str2.charAt(i))) {
				map2.put(str2.charAt(i),1);
			}
			else {
				int k=map2.get(str2.charAt(i))+1;
				map2.put(str2.charAt(i),k);
			}
		}
		System.out.println(map2);
		


		for(Character key:map1.keySet()) {
			if(map2.containsKey(key)) {
				if(!map2.get(key).equals(map1.get(key))) {
					if(map2.get(key)>map1.get(key))
						diff=diff+map2.get(key)-map1.get(key);
					else
						diff=diff+map1.get(key)-map2.get(key);
						
				}
			}
			else
				diff++;
		}
		
		System.out.println(diff);
}
}
