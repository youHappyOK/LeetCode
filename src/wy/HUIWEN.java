package wy;

import java.util.Scanner;

public class HUIWEN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
			int n = s.nextInt();
			int[] arr = new int[n];
			for(int i=0; i<n; i++){
				arr[i] = s.nextInt();
			}
			for(int i=0; i<n; i++){
				int a = arr[i];
			}
			for(int i=0; i<n; i++){
				
			}
		}
	}
	public static int huiwen(int[] a){//不是回文返回0；
		int length = a.length;
		int flag = 1;
		for(int i=0; i<length/2; i++){
			if(a[i] != a[length-i-1]){
				flag = 0;
				break;
			}
		}
		return flag;
	}
	public static int[] ins(int[] a, int fromPos, int toPos){
		int x = a[fromPos];
		int y = a[toPos];
		int sum = x + y;
		int length = a.length;
		int[] b = new int[length-1];
		for(int j=0; j<b.length; j++){
			if(j < toPos){
				b[j] = a[j];
			}
			if(toPos == j){
				b[j] = sum;
			}
			if(j>=fromPos && j <=fromPos+1){
				continue;
			}
			if(j > toPos){
				b[j] = a[j-1];
			}
		}
		return b;
	}
}
