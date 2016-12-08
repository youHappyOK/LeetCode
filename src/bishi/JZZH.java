package bishi;

import java.util.Arrays;
import java.util.Scanner;

public class JZZH {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		char[] str = str1.substring(2).toCharArray();
		//System.out.println(Arrays.toString(str));
		int num = 0;
		int len = str.length;
		for(int i = 0; i < len; i++){
			if(str[i] != 'A' && str[i] != 'B' && str[i] != 'C' && str[i] != 'D' && str[i] != 'E' && str[i] != 'F'){
				num += Integer.parseInt(String.valueOf(str[i])) * Math.pow(16, len - i - 1);
			}else{
				switch(str[i]){
					case 'A':num += 10*Math.pow(16, len - i - 1);
					break;
					case 'B':num += 11*Math.pow(16, len - i - 1);
					break;
					case 'C':num += 12*Math.pow(16, len - i - 1);
					break;
					case 'D':num += 13*Math.pow(16, len - i - 1);
					break;
					case 'E':num += 14*Math.pow(16, len - i - 1);
					break;
					case 'F':num += 15*Math.pow(16, len - i - 1);
				}
			}
		}
		System.out.println(num);
	}
}
