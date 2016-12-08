package bishi;
/***
 * A和B是好友，他们经常在空闲时间聊天，A的空闲时间为[a1 ,b1 ],[a2 ,b2 ]..[ap ,bp ]。B的空闲时间是[c1 +t,d1 +t]..[cq +t,dq +t],这里t为B的起床时间。这些时间包括了边界点。B的起床时间为[l,r]的一个时刻。若一个起床时间能使两人在任意时刻聊天，那么这个时间就是合适的，问有多少个合适的起床时间？

输入描述:
第一行数据四个整数：p,q,l,r（1≤p,q≤50,0≤l≤r≤1000)。接下来p行数据每一行有一对整数ai，bi(0≤aii+1>bi,ci+1>di


输出描述:
输出答案个数

输入例子:
2 3 0 20
15 17
23 26
1 4
7 11
15 17

输出例子:
20
 * @author Jin
 *
 */

import java.util.Scanner;
public class LT {
	public static class Time{
		public int start;
		public int end;
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int p = s.nextInt();
		int q = s.nextInt();
		int l = s.nextInt();
		int r = s.nextInt();
		int[] flag = new int[r-l+1];
		Time[] arr1 = new Time[p];
		Time[] arr2 = new Time[q];
 		for(int i=0; i<p; i++){
 			Time time = new Time();
 			time.start = s.nextInt();
 			time.end = s.nextInt();
			arr1[i] = time;
		}
 		for(int i=0; i<q; i++){
 			Time time = new Time();
 			time.start = s.nextInt();
 			time.end = s.nextInt();
			arr2[i] = time;
		}
 		for(int i=l; i<=r; i++) {
 			for(int n=0; n<q; n++){
 				for(int m=0; m<p; m++){
// 					if((arr2[n].start+i <= arr1[m].start && arr2[n].end+i <= arr1[m].end) || (arr2[n].start+i >= arr1[m].start && arr2[n].end+i >= arr1[m].end)){
// 						flag[i-l] = 1;
// 					}
 					if(arr2[n].start+i > arr1[m].end || arr2[n].end+i < arr1[m].start){
 						flag[i-l] = 1;
 					}
 				}
 			}
 		}
 		int count = 0;
 		for(int i=0; i<r-l+1; i++){
 			if(flag[i]==0)
 				count++;
 		}
 		System.out.println(count);
	}
}
