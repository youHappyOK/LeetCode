package bishi.baidu;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DYBS {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int x = s.nextInt();
		int y = s.nextInt();
		int t = s.nextInt();
		double[][] arr = new double[n][m];
		double sum = 0;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				arr[i][j] = s.nextDouble();
				sum += arr[i][j];
			}
		}
		double ss = arr[x-1][y-1];
		double cc = sum / (n * m);
		double pSS = 1 - Math.pow(1 - ss, t);
		double pCC = 1 - Math.pow(1 - cc, t);
		if(pSS > pCC){
			System.out.println("ss");
			System.out.println(new DecimalFormat("0.00").format(pSS));
		}
		else if(pSS < pCC){
			System.out.println("cc");
			System.out.println(new DecimalFormat("0.00").format(pCC));
		}
		else{
			System.out.println("equal");
			System.out.println(new DecimalFormat("0.00").format(pCC));
		}
	}
}
