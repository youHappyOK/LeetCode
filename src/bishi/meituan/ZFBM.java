package bishi.meituan;

import java.util.HashMap;
import java.util.Scanner;

public class ZFBM {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char[] arr = str.toCharArray();
		HashMap<Character,Integer> h = new HashMap<Character,Integer>();
		for(int i=0; i<arr.length; i++){
			if(h.containsKey(i)){
				h.put((char) i, (int)h.get(i)+1);
			}else{
				h.put((char) i, 1);
			}
		}
		int[] arr2 = new int[h.size()];
		int k = 0;
		for(Character c : h.keySet()){
			arr2[k] = h.get(c);
			k++;
		}
	}
}
