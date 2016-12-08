package com.LintCode;

import java.util.ArrayList;
import java.util.List;

/***
 * http://blog.csdn.net/nicaishibiantai/article/details/43369775
 * http://www.07net01.com/2015/08/914666.html
 * @author Jin
 *
 */
public class SolutionKPN {
	public long kthPrimeNumber(int k) {
		long[] arr = new long[k + 1];
		arr[0] = 1;
		int p3 = 0, p5 = 0, p7 = 0;
		for(int i = 1; i <= k; i++){
			long min = Math.min(Math.min(arr[p3] * 3, arr[p5] * 5), arr[p7] * 7);
			if(min / arr[p3] == 3) {
				p3++;
			}
			if(min / arr[p5] == 5) {
				p5++;
			}
			if(min / arr[p7] == 7) {
				p7++;
			}
			arr[i] = min;
		}
		return arr[k];
	}
}
