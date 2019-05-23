package tests;

import java.util.HashSet;

public class LongestUniqueSubstring {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s="karkbaabba";
	int len=s.length();
	int i,j=0,setLen=0;char c;
	HashSet<Character> set=new HashSet<>();
	for(i=0;i<len;i++) {
		c=s.charAt(i);
		if(!set.contains(c)) {
			set.add(c);
			setLen=Math.max(set.size(),setLen);
		}
		else {
			 while(i>j){
	                if(s.charAt(i)==c){
	                    i++;
	                    break;
	                }
	                set.remove(s.charAt(i));
	                i++;	
			}
		}
	}
	System.out.println(set+","+setLen);	
	}
}
