package bishi.baidu;

import java.util.Scanner;

/***
 * �ȶ�����һ������ֽ������ֽ����һЩ����ĵ㣬ÿ���㶼��������ϣ��������񿴳�һ��������ƽ���������ߵ�����ϵ�Ļ���ÿ���������һ������x��y����ʾ���ȶ��ܱ������������߻�һ�������Σ�ʹ���е��������ε��ڲ����߽߱硣Ȼ�����������μ��������ʼ��������ε���С����Ƕ��١� 
��������:

��һ��һ����n(2��n��1000)��ʾ������������ÿ��һ������xi,yi(��1e9<=xi,yi<=1e9)��ʾ�����ϵĵ�


�������:

һ�������С���

��������:

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
