package tests;

public class PallindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="liil";
		String w="";
		for(int i=str.length()-1;i>=0;i--) {
			w=w+str.charAt(i);
		}
		if(w.equals(str))
			System.out.println("Pallindrome");
		else
			System.out.println("Not Pallindrome");
	}

}
