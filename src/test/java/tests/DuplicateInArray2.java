package tests;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,1,2,2,3,4,5};
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			if(!set.contains(a[i]))
				set.add(a[i]);
			else
				System.out.println(a[i]+" is duplicate");
		}
	}
}
