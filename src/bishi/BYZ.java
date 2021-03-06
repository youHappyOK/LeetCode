package bishi;

import java.util.Scanner;
/***
 * 扳圆桌
 * 现在有一张半径为r的圆桌，其中心位于(x,y)，现在他想把圆桌的中心移到(x1,y1)。每次移动一步，都必须在圆桌边缘固定一个点然后将圆桌绕这个点旋转。问最少需要移动几步。
 * 输入描述:
一行五个整数r,x,y,x1,y1(1≤r≤100000,-100000≤x,y,x1,y1≤100000)


输出描述:
输出一个整数，表示答案

输入例子:
2 0 0 0 4

输出例子:
1
 * @author Jin
 *
 */
public class BYZ {
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		int x = s.nextInt();
		int y = s.nextInt();
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		int des = (int) Math.sqrt(Math.pow((x-x1), 2) + Math.pow((y-y1), 2));
		int m = des / (2*r);
		int n = des % (2*r);
		int count;
		if(n == 0){
			count = m;
		}else{
			count = m + 1;
		}
		System.out.println(count);
	}
}
