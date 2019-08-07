package tests;

import java.util.LinkedHashMap;

public class LongestUniqueSubstring6 {

	public static void main(String[] args) {
		String str="javaconceptoftheday";
		int strLen=0;
		String subString="";
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<str.length();i++) {
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), i);
			}
			else {
				i=map.get(str.charAt(i));
				map.clear();
			}
			if(strLen<map.size()) {
				strLen=map.size();
				subString=map.keySet().toString();
			}
		}
		System.out.println(subString);
		
		LinkedHashMap<String,Integer> hs=new LinkedHashMap<String,Integer>();
		String s[]= {"hi","ani","rohit"};
		int ar[]= {1,2,3};
        for(int i=0;i<3;i++){
        if(!hs.containsKey(s[i])){
            hs.put(s[i],ar[i]);
        }
        }
       for(String key:hs.keySet()) {
    	   System.out.println(key+" "+hs.get(key));
    	   
       }
	}

}
