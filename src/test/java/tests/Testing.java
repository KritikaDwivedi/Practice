package tests;

import java.io.*;
import java.util.*;


public class Testing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine().trim());
        String[] arr_arr = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i_arr = 0; i_arr < arr_arr.length; i_arr++) {
            arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
        }

        int out_ = FindIt(arr,n);
        wr.println(out_);
        wr.close();
        br.close();
    }

    static int FindIt(int[] arr,int n) {
        Arrays.sort(arr);
        int min=arr[n-1];
        for(int i=0;i<n;i++){
           if(min>arr[i]){
               min=arr[i];
           }
        }
        return min;
    }
}
