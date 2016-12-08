package bishi;

import java.util.Scanner;

public class Main {
	public static class Tg{
		public float ti;
		public float pi;
		public float tp;
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n, v;
		while(s.hasNextInt()){
			n = s.nextInt();
			v = s.nextInt();
			Tg[] arr = new Tg[n+1];
			float max1 = 0;
			int maxIndex1 = 0;
			float max2 = 0;
			int maxIndex2 = 0;
			for(int i = 1; i <= n; i++){
				Tg t = new Tg();
				t.ti = s.nextInt();
				t.pi = s.nextInt();
				t.tp = t.pi / t.ti;
				arr[i] = t;
				if(t.ti == 1 && t.tp > max1){
					max1 = t.tp;
					maxIndex1 = i;
				}
				if(t.ti == 2 && t.tp > max2){
					max2 = t.tp;
					maxIndex2 = i;
				}
			}
			if(v == 0) {
				System.out.println(0);
				System.out.println("No");
			}
			if(max1 >= max2){
				System.out.println((int)arr[maxIndex1].pi * v);
				System.out.println(maxIndex1);
			}else{
				if(v % 2 == 0){
					System.out.println((int)arr[maxIndex2].pi * v / 2);
					System.out.println(maxIndex2);
				}
				if(v % 2 == 1){
					System.out.println((int)arr[maxIndex2].pi * v / 2 + arr[maxIndex1].pi);
					if(maxIndex2 <= maxIndex1){
						System.out.println(maxIndex2 + " " +maxIndex1);
					}else{
						System.out.println(maxIndex1 + " " +maxIndex2);
					}
				}
			}
		}
	}
}
