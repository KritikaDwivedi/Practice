package tests;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153, sum=0;
		for(int i=num;i>0;i=i/10) {
			int a=i%10;
		//	sum=(int)(sum + Math.pow(a, 3));
			sum=(a*a*a)+sum;
		}
		if(sum==num) {
		System.out.println("Armstrong");
		}
		else
			System.out.println("Not an amstrong number");
	}

}
