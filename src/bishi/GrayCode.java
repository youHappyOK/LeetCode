package bishi;

import java.util.*;

public class GrayCode {
    public static String[] getGray(int n) {
    	String[] grayCode = new String[(int) Math.pow(2, n)];
    	if(n == 1) {
    		grayCode[0] = "0";
    		grayCode[1] = "1";
    		return grayCode;
    	}
    	String[] last = getGray(n - 1);
    	for(int i = 0;  i < last.length; i++){
    		grayCode[i] = "0" + last[i];
    		grayCode[(int)Math.pow(2, n) - i - 1] = "1" + last[i];
    	}
    	return grayCode;
    }
    public static void main(String[] args){
    	System.out.println(Arrays.toString(getGray(3)));
    }
}
