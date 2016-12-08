package bishi.baidu;

import java.util.Scanner;

/***
 * 度度熊有一张网格纸，但是纸上有一些点过的点，每个点都在网格点上，若把网格看成一个坐标轴平行于网格线的坐标系的话，每个点可以用一对整数x，y来表示。度度熊必须沿着网格线画一个正方形，使所有点在正方形的内部或者边界。然后把这个正方形剪下来。问剪掉正方形的最小面积是多少。 
输入描述:

第一行一个数n(2≤n≤1000)表示点数，接下来每行一对整数xi,yi(－1e9<=xi,yi<=1e9)表示网格上的点


输出描述:

一行输出最小面积

输入例子:

2
0 0
0 3
 * @author Jin
 *
 */
public class CJWGZ {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Point[] arr = new Point[n];
		for(int i = 0; i < n; i++){
			Point p = new Point();
			p.x = s.nextInt();
			p.y = s.nextInt();
			arr[i] = p;
		}
		int len = 0;
		for(int k = 0; k < n; k++){
			for(int m = k+1; m < n; m++){
				if(dis(arr[k], arr[m]) > len)
					len = dis(arr[k], arr[m]);
			}
		}
		System.out.println(len * len);
	}
	public static class Point{
		public int x;
		public int y;
	}
	public static int dis(Point p1, Point p2){
		int x = Math.abs(p1.x - p2.x);
		int y = Math.abs(p1.y - p2.y);
		if(x >= y)
			return x;
		else 
			return y;
	}
}
