package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestInArray {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader cin=new BufferedReader(new InputStreamReader(System.in));
		int arr[]=new int[5];
		int i,largest=0;
		System.out.println("Enter array");
		for(i=0;i<5;i++) {
			arr[i]=Integer.parseInt(cin.readLine());
		}
		for(i=0;i<5;i++)
		{
			if(largest<arr[i]) {
				largest=arr[i];
			}
		}
		System.out.println("largest is:"+largest);
		
	}

}
