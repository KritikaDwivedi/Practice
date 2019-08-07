package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveDuplicatesWithoutCollection {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader cin=new BufferedReader(new InputStreamReader(System.in));
		int arr[]= {1,2,2,4,4};
		int arr2[]=new int[5];
		int i,j,k=0;
//		System.out.println("Enter array");
//		for(i=0;i<5;i++) {
//			arr[i]=Integer.parseInt(cin.readLine());
//		}
			for(j=0;j<5;j++) {
				if(j==4) 
					arr2[k++]=arr[4];
				else {
					if(arr[j]!=arr[j+1]) {
							arr2[k++]=arr[j];
						}
					}					
				}			
		
		for(i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]);
		}
		
	}

}
