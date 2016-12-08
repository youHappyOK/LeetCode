package bishi.baidu;



/***
 * ��������������A��B��ס��һƬ����Ģ������n��m��������ɵĲݵأ�A��(1,1),B��(n,m)������A��Ҫ�ݷ�B��������ֻ��ȥB�ļң�����ÿ����ֻ����(i,j+1)��(i+1,j)������·�ߣ��ڲݵ�����k��Ģ�����ڸ�����(���Ģ��������ͬһ����),�ʣ�A���ÿһ�����ѡ��Ļ�(�����ڱ߽��ϣ���ֻ��һ��ѡ��)����ô��������Ģ���ߵ�B�ļҵĸ����Ƕ��٣�

��������:
��һ��N��M��K(2 �� N,M �� 20, k �� 100),N,MΪ�ݵش�С��������K�У�ÿ����������x��y������(x,y)����һ��Ģ����


�������:
���һ�У������������(������2λС��)

��������:
2 2 1
2 1

�������:
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
