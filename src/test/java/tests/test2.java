package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;

public class test2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        PrintWriter wr = new PrintWriter(System.out);
		        int N = Integer.parseInt(br.readLine().trim());
		        String[] s = new String[N];
		        int[] ar = new int[N];
		        for (int i = 0; i < N; i++) {
		            String[] ss = br.readLine().trim().split(" ");
		            s[i] = ss[0];
		            ar[i] = Integer.parseInt(ss[1]);
		        }
		        System.out.println(N);
		        System.out.println(s[0]);
		        System.out.println(ar[0]);
		       // solve(N , s, ar);
		        wr.close();
		        br.close();
		    }

	static void solve(int n, String[] s, int[] ar) {
    //Use this function to print the appropriate output
    HashMap<String,Integer> map=new HashMap<>();
}

}
