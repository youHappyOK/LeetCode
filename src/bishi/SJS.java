package bishi;

import java.util.Arrays;
import java.util.Scanner;

public class SJS {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = s.nextInt();
		}
		for(int m = 0; m < n; m++){
			for(int k = 0; k < n-m-1; k++){
				if(arr[k] > arr[k+1]){
					int temp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = temp;
				}
			}
		}
		int prev = arr[0];
		System.out.println(arr[0]);
		for(int i = 1; i < n; i++){
			if(arr[i] != prev){
				System.out.println(arr[i]);
				prev = arr[i];
			}
		}
	}
}
