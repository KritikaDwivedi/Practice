package tests;

public class findMissingNumber {

	public static void main(String[] args) {
		printMissingNumber(new int[] {1,2,6,5},10);
	}
	
	public static void printMissingNumber(int arr[],int count) {
		int i,j,k=0,l=1;
		for(i=0;i<arr.length;i++)
		{
			for(j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					k=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=k;
				}
			}
		}
		
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]!=l) {
				System.out.println(l+" is missing");
				i--;
			}
			l++;
		}
		int length=arr.length;
		if(arr[length-1]<10) {
			for(i=length+2;i<10;i++) {
				System.out.println(i+" is missing");
			}
		}
	}

}
