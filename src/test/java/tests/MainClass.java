package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class privateConstructor{
	{
	final int a;
	}
	
	public void test1()throws Exception{
		System.out.println("test1");
	}
	
	
}

class child extends privateConstructor{
	public void test1()throws IOException{
		System.out.println("test2");
	}
}

public class MainClass{
	public static void main(String[] args) throws RuntimeException, IOException{
		BufferedReader cin=new BufferedReader(new InputStreamReader(System.in));
		privateConstructor p=new child();
	}
	
}


