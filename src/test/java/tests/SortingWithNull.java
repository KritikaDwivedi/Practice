package tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingWithNull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li= new ArrayList() {
			{
				add(1);
				add(2);
				add(null);
				add(3);
			}
		};
		
		Collections.sort(li);
		System.out.println(li);
	}

}
