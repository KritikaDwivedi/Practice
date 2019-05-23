package tests;

public class PallindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123321;
		int d, rev=0;
		for(int i=num;i>0;i=i/10) {
			d=i%10;
			rev=rev*10+d;
		}
		System.out.println(rev);
	}

}
