package tests;

public class ReversingString {

	public static void main(String[] args) {
		/* i love india
		india love i*/

		char[] arr= {' ','i',' ','l','o','v','e',' ','i','n','d','i','a'};
		String w="";
		char[]arr2=new char[arr.length];
		int k=arr.length-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=' ' && i!=arr.length-1)
				w=w+arr[i];
			else {
				if(i==arr.length-1)
					w=w+arr[i];
				for(int l=w.length()-1;l>=0;l--)
					arr2[k--]=w.charAt(l);
				if(i!=arr.length-1)
					arr2[k--]=' ';
				w="";
			}
		}
		for(int i=0;i<arr2.length;i++)
			System.out.print(arr2[i]);
	}

}
