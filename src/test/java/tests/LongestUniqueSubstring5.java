package tests;

import java.util.LinkedHashMap;

public class LongestUniqueSubstring5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="javaconceptoftheday";
		char ch[]=s.toCharArray();
		int longestLength=0;
		String longestSubstring;
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<ch.length;i++) {
			if(!map.containsKey(ch[i])) {
				map.put(ch[i], i);
			}
			else{
				i=map.get(ch[i]);
				map.clear();
			}
			if(map.size()>longestLength) {
				longestLength=map.size();
				longestSubstring=map.keySet().toString();
			}
		}
		String w="";
		Object[] char2=map.keySet().toArray();
		for(Object c:char2) {
			w=w+c;
		}
		System.out.println(w);
	}
}
