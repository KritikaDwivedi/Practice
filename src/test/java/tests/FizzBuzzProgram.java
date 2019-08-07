package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FizzBuzzProgram {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine()); 
        String[] arr=new String[testCases];
        String number=br.readLine(); 
        arr=number.split(" ");

        for(int i=0;i<testCases;i++) {
        	fizzbuzz(Integer.parseInt(arr[i]));
        }

    }
    
    public static void fizzbuzz(int num){
        for(int i=1;i<=num;i++) {
        	
        	if(i%3==0 && i%5==0) {
        		System.out.println("FizzBuzz");
        	}
        	else {
        	if(i%3!=0 && i%5!=0)
        		System.out.println(i);
        	else if(i%3==0)
        		System.out.println("Fizz");
        	
        	else if(i%5==0)
        		System.out.println("Buzz");
        	
        	}
        }
    }
	}

