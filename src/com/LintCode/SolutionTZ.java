package com.LintCode;

public class SolutionTZ {
	public long trailingZeros(long n) {
		
/***
 * 求因数5的个数，因为5的个数永远小于2的个数
 */
		
//		long a = 1; //严重超时方法
//		long tz = 0;
//        for (int i = 1; i <= n; i++) {
//        	a = a * i;
//        }
//        while(a % 10 == 0) {
//        	tz++;
//        	a = a / 10;
//        }
//        return tz;
		
//		int count = 0; //一般超时方法
//		for(int i = 1; i <= n; i++) {
//			int j = i;
//			while(j % 5 == 0) {
//				count++;
//				j = j / 5;
//			}
//		}
//		return count;
//    }
		
		long count = 0; 
		while(n / 5 != 0) {
			count += n / 5;
			n = n / 5;
		}
		return count;
	}
}
