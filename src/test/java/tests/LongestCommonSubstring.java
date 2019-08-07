package tests;

public class LongestCommonSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String arr[]= {"abcdefghixmfnj", "aefghijkxdhhd","abcefghindbnb"};	
	String substring1="",substring2="";int len=0;
		int i,j;
		for(j=arr[0].length()-1;j>=0;j--) {
		for(i=0;i<j;i++) {
			if(arr[1].contains(arr[0].substring(i, j))){
				if(arr[2].contains(arr[0].substring(i, j))) {
					substring1=arr[0].substring(i, j);
					if(len<substring1.length()) {
						len=substring1.length();
						substring2=arr[0].substring(i, j);
					}
						
				}
			}
		}
		}
			System.out.println(substring2);
		
	}
}


