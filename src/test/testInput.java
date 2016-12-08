package test;

import java.util.Scanner;
public class testInput {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
//		while(true){
//			if(s.nextInt() == 0)
//				break;
//		}
		while(s.hasNext()){
			if(s.nextInt() == 0)
				break;
		}
	}
}
