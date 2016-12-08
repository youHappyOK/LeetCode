package bishi.baidu;



/***
 * 现在有两个好友A和B，住在一片长有蘑菇的由n＊m个方格组成的草地，A在(1,1),B在(n,m)。现在A想要拜访B，由于她只想去B的家，所以每次她只会走(i,j+1)或(i+1,j)这样的路线，在草地上有k个蘑菇种在格子里(多个蘑菇可能在同一方格),问：A如果每一步随机选择的话(若她在边界上，则只有一种选择)，那么她不碰到蘑菇走到B的家的概率是多少？

输入描述:
第一行N，M，K(2 ≤ N,M ≤ 20, k ≤ 100),N,M为草地大小，接下来K行，每行两个整数x，y，代表(x,y)处有一个蘑菇。


输出描述:
输出一行，代表所求概率(保留到2位小数)

输入例子:
2 2 1
2 1

输出例子:
0.50
 * @author Jin
 *
 */
import java.util.Scanner;
public class MGZ {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int k = s.nextInt();
		double[][] map = new double[n][m];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				map[i][j] = 0.5;
			}
		}
		for(int i = 0; i < n; i++){
			map[i][m-1] = 1;
		}
		for(int j = 0; j < m; j++){
			map[n-1][j] = 1;
		}
		for(int i = 0; i < k; i++){
			double x = s.nextInt();
			double y = s.nextInt();
			for(int p = 0; p < n; p++){
				for(int q = 0; q < m; q++){
					if(x >= p && x <= p+1 && y >= q && y <= q+1){
						map[p+1][q+1] = 0;
					}
				}
			}
		}
	}
	
}
