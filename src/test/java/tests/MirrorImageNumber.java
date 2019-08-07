package tests;

public class MirrorImageNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1428572;
		int sum1=0,sum2=0;
		int i;
		for(i=num;i!=0;i=i/10) {
			int dig=i%10;
			sum1=sum1+dig;
		}
		int mul=num*2;
		for(i=mul;i!=0;i=i/10) {
			int dig=i%10;
			sum2=sum2+dig;
		}
		if(sum1==sum2) {
			System.out.println("Mirror Image");
		}
		else
			System.out.println("Not mirror image");
	}

}
