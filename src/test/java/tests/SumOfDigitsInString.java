package tests;

public class SumOfDigitsInString {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str="Kritika123is321My98Name";
		String arr[]=str.split("[a-zA-Z]+");
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].matches("[0-9]+"))
			sum=sum+Integer.parseInt(arr[i]);
		}
		System.out.println(sum);
	}
}
