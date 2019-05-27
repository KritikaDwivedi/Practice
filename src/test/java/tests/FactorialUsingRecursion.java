package tests;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("factorial of 5 using recursion in Java is: " + factorial(5)); 
	  
	    }
	  
	  
	    /*
	     * Java program example to find factorial of a number using recursion
	     * @return factorial of number
	     */
	    public static int factorial(int number){       
	        //base case
	        if(number == 0){
	            return 1;
	        }
	        return number*factorial(number -1); //is this tail-recursion?
	    }

	}


