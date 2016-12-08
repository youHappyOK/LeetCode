package bishi;

import java.util.Scanner;
public class Solution3 {
	
	public static class Point{
		public int x;
		public int y;
		boolean flag;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int k = s.nextInt();
		Point[] p = new Point[k];
		for(int i = 0; i < k; i++) {
			p[i] = new Point();
			p[i].x = s.nextInt();
			p[i].y = s.nextInt();
			p[i].flag = true;
		}
		int max1 = 0;
		for(int i = 0; i <= n-3; i++) {
			for(int j = 0; j <= m-3; j++) {
				int temp = fn(i, j, p);
				if(temp > max1)
					max1 = temp;
			}
		}
		int max2 = 0;
		for(int i = 0; i <= n-3; i++) {
			for(int j = 0; j <= m-3; j++) {
				int temp = fn(i, j, p);
				if(temp > max2)
					max2 = temp;
			}
		}
		int max = max1 + max2;
		System.out.println(max);
		
	}
	public static int fn(int x, int y, Point[] p) {
		int count = 0;
		for(int k = 0; k < p.length; k++) {
			if(p[k].x >= x && p[k].x <= x+3 && p[k].y >= y && p[k].y <= y+3 && p[k].flag == true) {
				count++;
				
			}
		}
		return count;
	}
}
