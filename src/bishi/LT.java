package bishi;
/***
 * A��B�Ǻ��ѣ����Ǿ����ڿ���ʱ�����죬A�Ŀ���ʱ��Ϊ[a1 ,b1 ],[a2 ,b2 ]..[ap ,bp ]��B�Ŀ���ʱ����[c1 +t,d1 +t]..[cq +t,dq +t],����tΪB����ʱ�䡣��Щʱ������˱߽�㡣B����ʱ��Ϊ[l,r]��һ��ʱ�̡���һ����ʱ����ʹ����������ʱ�����죬��ô���ʱ����Ǻ��ʵģ����ж��ٸ����ʵ���ʱ�䣿

��������:
��һ�������ĸ�������p,q,l,r��1��p,q��50,0��l��r��1000)��������p������ÿһ����һ������ai��bi(0��aii+1>bi,ci+1>di


�������:
����𰸸���

��������:
2 3 0 20
15 17
23 26
1 4
7 11
15 17

�������:
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
