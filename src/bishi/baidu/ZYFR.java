package bishi.baidu;

import java.util.Scanner;

public class ZYFR {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int t = s.nextInt();
		int c = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = s.nextInt();
		}
		int count = 0;
		for(int k = 0; k <= n - c; k++){
			int sum = 0;
//			for(int j = k; j < k + c; j++){
//				sum += arr[j];
//			}
			for(int j = 0; j < c; j++){
				sum += arr[k + j];
			}
			if(sum <= t)
				count++;
		}
		System.out.println(count);
	}
}
