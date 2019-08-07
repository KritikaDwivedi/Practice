package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class FindMinimumCoins {

	public static void main(String[] args) throws IOException {
		BufferedReader cin=new BufferedReader(new InputStreamReader(System.in));
		//Find minimum number of coins that make a value of 30
		int coins[] = {50,50,15,35,20,10,5};
		Arrays.sort(coins);
		ArrayList<Integer> li=new ArrayList<>();
		ArrayList<Integer> li2=new ArrayList<>();
		for(int coin:coins)
			System.out.print(coin+",");
		System.out.println();
		int sum=0,f=0,min=coins.length;
		System.out.println("Enter number");
		int n=Integer.parseInt(cin.readLine());
		for(int i=0;i<coins.length;i++) {
			li.add(coins[i]);
			sum=coins[i];
			for (int j=(coins.length-1)-i;j>=0;j--){
				int k=j;
				if(sum>n) { 
				}
				else if(sum<n) {
					sum=sum+coins[k];
					li.add(coins[k]);
					
					if(sum>n) {
						li.remove(li.lastIndexOf(coins[k]));
						sum=sum-coins[k];	
					}
				}
				else {
					f=1;
					li2.add(li.size());
					}
			}
			if(f==1) {
				for(int l:li2) {
				if(l<min) {
					min=l;
				}
				}
			}
			li.clear();
			f=0;	
		}
		System.out.println(min);
	}

}
