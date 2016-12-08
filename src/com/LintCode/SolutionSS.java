package com.LintCode;
/****
 * kmpÀ„∑®¿ÌΩ‚£∫http://cache.baiducontent.com/c?m=9f65cb4a8c8507ed4fece763104f87711923d13f6c898d403ec3933fc239045c0535b6ec3a211500d9c6767a15ea141cbcff6f2d751421c78cb9f85daaba85582a9f543e&p=9960cf5e89904ead07bd9b7e0e1581&newp=882a9546d5d800fc57efdb3c5a5c85231610db2151d4d51f6495&user=baidu&fm=sc&query=kmp%CB%E3%B7%A8&qid=aab6e04900060fc6&p1=7
 * @author Jin
 *
 */
public class SolutionSS {
//	public int strStr(String source, String target) {
//		if(source == null || target == null) {
//			return -1;
//		}
//		if(source == "" || target == "") {
//			return 0;
//		}
//		int lenS = source.length();
//		int lenT = target.length();
//		for(int i = 0; i < lenS; i++) {
//			int k = i;
//			for(int j = 0; j < lenT; j++) {
//				if(source.charAt(k) != target.charAt(j)) {
//					break;
//				}else {
//					k++;
//				}
//				if(j == lenT - 1) { 
//					return i;
//				}
//			}	
//		}
//
//        return -1;
//    }
	 public int strStr(String source, String target) {
	        if (source == null || target == null) {
	            return -1;
	        }
	        
	        for (int i = 0; i < source.length() - target.length() + 1; i++) {
	            int j = 0;
	            for (j = 0; j < target.length(); j++) {
	                if (source.charAt(i + j) != target.charAt(j)) {
	                    break;
	                }
	            }
	            // finished loop, target found
	            if (j == target.length()) {
	                return i;
	            }
	        }
	        return -1;
	  }
}	
