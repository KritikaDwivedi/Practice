package tests;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number = Arrays.asList(2,3,4,5); 
		  
	    // demonstration of map method 
	    List<Integer> square = number.stream().map(x -> x).
	                           collect(Collectors.toList()); 
	    Integer a=square.stream().max(Integer::compare).get();
	    System.out.println(a); 
	    
	    List<String> l1=Arrays.asList("Kritika","Ashish","amit","Garima");
	    List<String> s=l1.stream().sorted().collect(Collectors.toList());
	    System.out.println(s);
	}

}
