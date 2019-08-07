package tests;

public class FindAnagramNumber {

	public static void main(String[] args) {
		int mul=1,sum1=0,sum2=0;
		//for(int i=1200000;i<1300000;i++) {
		int i=1246878;
		for(int j=i;j!=0;j=j/10) {
			int dig=j%10;
			sum1=sum1+dig;
		}
		mul=i*7;
		//System.out.println(mul);
		for(int j=mul;j!=0;j=j/10) {
			int dig=j%10;
			sum2=sum2+dig;
		}

		if(sum1==sum2){
			System.out.println(i+" is Anagram");
		}
		else {
			System.out.println(i+" is Not anagram");
		}	
	}
}
