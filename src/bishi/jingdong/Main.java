package bishi.jingdong;

import java.util.Arrays;
/**
 * 
5 3
4 2 1 10 5
apple
orange
mango
6 5
3 5 1 6 8 1
peach
grapefruit
banana
orange
orange

 */
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n, m;
		int[] a1;
		String[] a2;
		while(s.hasNext()){
			n = s.nextInt();
			m = s.nextInt();
			a1 = new int[n];
			a2 = new String[m];
			for(int i = 0; i < n; i++){
				a1[i] = s.nextInt();
			}
			bubbleSort(a1);
			//System.out.println(Arrays.toString(a1));
			for(int i = 0; i < m; i++){
				a2[i] = s.next();
			}
			int count = count(a2);
			System.out.println(count);
			int min = 0, max = 0;
			int length = a1.length;
			int length2 = a2.length;
			if(count == length){
				for(int i=0; i<=m-1; i++){
					min += a1[i];
					max += a1[length-i];
				}
			}
			else{
				for(int i=1; i<=length2-count+1; i++){
					min += a1[0];
					max += a1[length-1];
				}
				for(int j=1; j<=count-1; j++){
					min += a1[j];
					max += a1[length-1-j];
				}
			}
			System.out.println(min + " " + max);
		}
	}
	
	
	public static int count(String[] array) {  
        int len = array.length;  
  
        for (int i = 0; i < array.length - 1; i++) {  
            for (int j = i + 1; j < array.length; j++) {  
                String str = array[i];  
                if (array[j].equals(str)) {  
                    // 重复，数组总长度减1  
                    len--;  
  
                    //i++;  
                }  
            }  
        }  
  
        return len;  
    } 
	public static void bubbleSort(int[] array) {
		int temp;
        for(int i=0;i<array.length;i++){//趟数
        	for(int j=0;j<array.length-i-1;j++){//比较次数
		        if(array[j]>array[j+1]){
		        	temp=array[j];
 					array[j]=array[j+1];
 					array[j+1]=temp;
		        }
        	}
        }
	}
}
