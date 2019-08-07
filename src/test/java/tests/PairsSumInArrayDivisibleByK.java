package tests;

public class PairsSumInArrayDivisibleByK {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,3,5,6};
		int k=2,sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				sum=arr[i]+arr[j];
				if(sum%k==0) {
					System.out.println(arr[i]+","+arr[j]);
				}
			}
		}

	}

}
