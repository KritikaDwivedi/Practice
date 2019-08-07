package tests;

import java.math.BigInteger;

public class FactorialBigInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger fact=factorial(500);
		System.out.println(fact);
	}
	
	public static BigInteger factorial(int n) {
		BigInteger fact=new BigInteger("1");
		for(int i=1;i<=n;i++) {
			fact=fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
		
	}
}
