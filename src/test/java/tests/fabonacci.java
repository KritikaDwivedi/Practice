package tests;

public class fabonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0,1,1,2,3,5,8
		int i=0,j=1,k,l=0;
		System.out.print(i+","+j);
		for(k=1;k<=10;k++) {
			l=i+j;
			System.out.print(","+l);
			i=j;
			j=l;
		}
	}

}
