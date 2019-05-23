package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class DuplicateInArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		// 1 2 3 3 4
		BufferedReader cin=new BufferedReader(new InputStreamReader(System.in));
		int arr[]=new int[5];
		HashSet<Integer> set=new HashSet<Integer>();
		int i,j;
		System.out.println("Enter array");
		for(i=0;i<5;i++) {
			arr[i]=Integer.parseInt(cin.readLine());
		}
		
		for(i=0;i<5;i++) {
			for(j=1;j<5-i;j++) {
				if(arr[j-1]==arr[j]) {
					set.add(arr[j]);
				}
			}
		}
		System.out.println("Duplicate numbers are: "+set);

	}

}
