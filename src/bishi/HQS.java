package bishi;

import java.util.Scanner;

public class HQS {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int i = Integer.parseInt(s.nextLine());
		while(i != 0) {
			System.out.println(hqs(i));
			i = Integer.parseInt(s.nextLine());
		}
	}
	public static int hqs(int i){
		int count = 0;
		if(i != 0){
			int re = i % 3;
			while(i / 3 != 0){
				count += i / 3;
				i = i / 3 + re;
				re = i % 3;
			}
			if(i % 3 == 2)
				count++;
			return count;
		}else{
			return 0;
		}	
	}
}
