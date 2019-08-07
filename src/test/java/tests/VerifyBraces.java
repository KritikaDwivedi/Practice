package tests;

import java.util.Stack;

public class VerifyBraces {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="(({[)]})))";
		Stack<Character> st =new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			char current=s.charAt(i);
			if(s.charAt(i)=='('  || s.charAt(i)=='{'  || s.charAt(i)=='[' ) {
				st.push(s.charAt(i));
			}
			else if(s.charAt(i)==')'  || s.charAt(i)=='}'  || s.charAt(i)==']' ) {
				try{
				
//				if(st.isEmpty())
//					System.out.println("Not Balanced");
				
				char last=st.peek();
				if((current=='}' && last=='{') || (current==')' && last=='(') || (current==']' && last=='['))
					st.pop();
				else
					System.out.println("Not Balanced");
				}
				catch(Exception e) {
					st.push(current);
				}
			}
	}
		if (st.isEmpty())
			System.out.println("Balanced");
		else
			System.out.println("Not balanced");
	}
	

}
