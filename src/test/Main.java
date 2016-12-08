package test;

import java.util.LinkedHashMap;
import java.util.Scanner;


/**
 * 
addCandidate x1
addCandidate x2
addCandidate x3
vote x1
vote x2
getVoteResult
 * @author Jin
 *
 */
public class Main {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		while(true){
			if(s.next().equals("addCandidate")){
				map.put(s.next(), 0);
				continue;
			}
			if(s.next().equals("vote")){
				String str = s.next();
				if(map.containsKey(str)){
					int count = map.get(str);
					map.put(str, ++count);
				}
				continue;
			}
			if(s.next().equals("getVoteResult")){
				break;
			}
		}
		for (String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
	}
}
