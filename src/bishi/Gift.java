package bishi;

import java.util.*;

public class Gift {
	public static int getValue(int[] gifts, int n){
		int len = gifts.length;
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		for(int i = 0; i < len; i++){
			if(h.containsKey(gifts[i])) {
				int num = (int)h.get(gifts[i]);
				num++;
				h.put(gifts[i], num);
			}else{
				h.put(gifts[i], 1);
			}
		}
		for(int i = 0; i < len; i++){
			if((int)h.get(gifts[i]) > n/2)
				return gifts[i];
		}
		return -1;
	}
	public static void main(String[] args){
		int[] gifts = {1,2,3,2,2};
		System.out.println(getValue(gifts, 5));
	}
}
