package bishi;

import java.util.Arrays;
import java.util.Scanner;

/***
 * ����һ���������У�a1 <a2 <...<an ������������е������Ϊd=max{ai+1 - ai }(1��i<n),����Ҫ��a2 ,a3 ..an-1 ��ɾ��һ��Ԫ�ء���ʣ�����е��������С�Ƕ��٣�

��������:
��һ�У�һ��������n(1<=n<=100),���г���;������n��С��1000������������ʾһ���������С�


�������:
����𰸡�

��������:
5
1 2 3 7 8

�������:
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
