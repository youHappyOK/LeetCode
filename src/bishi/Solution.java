package bishi;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        int[] arr = new int[length];
        long a = s.nextInt();
        for(int i = 0; i < length; i++) {
        	arr[i] = s.nextInt();
        }

        
        System.out.println(solution(arr, a));
    }
    
    public static long solution(int arr[], long a){
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] <= a) {
                a = a + arr[i];
            }
            else{
                a = a + fn(arr[i], a);
                
            }
        }
        
        return a;
    }
    public static long fn(long a, long b) {
        while(a % b != 0) {
        	long temp = a % b;
            a = b;
            b = temp;
        }
        return b;
    }

}
