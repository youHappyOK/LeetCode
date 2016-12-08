package bishi;

import java.util.Arrays;
import java.util.Scanner;

/***
 * 给定一个递增序列，a1 <a2 <...<an 。定义这个序列的最大间隔为d=max{ai+1 - ai }(1≤i<n),现在要从a2 ,a3 ..an-1 中删除一个元素。问剩余序列的最大间隔最小是多少？

输入描述:
第一行，一个正整数n(1<=n<=100),序列长度;接下来n个小于1000的正整数，表示一个递增序列。


输出描述:
输出答案。

输入例子:
5
1 2 3 7 8

输出例子:
4
 * @author Jin
 *
 */
public class ZDJG {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int len = s.nextInt();
		int[] arr = new int[len];
		int[] diffArr = new int[len-1];
		for(int i=0; i<len; i++){
			arr[i] = s.nextInt();
		}
		for(int i=0; i<len-1; i++){
			diffArr[i] = arr[i+1] - arr[i];
		}
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(diffArr));
		int bigDiff = 0;
		if(len>=4){
			for(int i=0; i<=len-2; i++){
				if(diffArr[i] > bigDiff)
					bigDiff = diffArr[i];
			}
		}else{
			bigDiff = diffArr[0];
			for(int i=1; i<=len-2; i++){
				if(diffArr[i] < bigDiff)
					bigDiff = diffArr[i];
			}
		}
		System.out.println(bigDiff);
	}
}
