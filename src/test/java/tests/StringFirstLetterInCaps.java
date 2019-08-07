package tests;

public class StringFirstLetterInCaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My name is kritika 4";
		String w="";
		String arr[]=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			w=w+arr[i].substring(0, 1).toUpperCase()+arr[i].substring(1, arr[i].length())+" ";
		}
		System.out.println(w);
	}
}
