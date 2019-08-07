package tests;

public class OrExample {

	
	public static void main(String[] argv) {
		// TODO Auto-generated method stub
		boolean b1=true;
		if(b1==true||place(true)) {
			System.out.println("c");
		}
	}
	public static boolean place(boolean location) {
		
		if(location==true) {
			System.out.println("B");
		}
		System.out.println("A");
		
		
		return true;
		
	}

}
