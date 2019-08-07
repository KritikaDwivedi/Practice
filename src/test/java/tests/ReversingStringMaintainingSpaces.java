package tests;

public class ReversingStringMaintainingSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="My name";
		int index=0;
		for(int i=str.length()-1;i>=0;i--) {
			char c=str.charAt(i);
			if(str.charAt(index)==' ') 
				System.out.print(" ");
			if(str.charAt(i)!=' ')
					System.out.print(c);
			index++;
		}	
	}
}
