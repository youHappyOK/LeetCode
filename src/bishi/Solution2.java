package bishi;

import java.util.Scanner;

public class Solution2 {

    public static class Point{
        public int x;
        public int y;
    }
    public static void main(String[] args) {
       	Point[] p = new Point[4];
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int sum = 0;
        for(int i = 0; i <= 3; i++) {
        	p[i] = new Point();
            p[i].x = s.nextInt();
            p[i].y = s.nextInt();
        }
		for(int j = 0; j <= 2; j++) {
            double d = Math.sqrt(Math.pow((p[j].x-p[3].x),2) + Math.pow((p[j].y-p[3].y),2));
            if(d <= r) {
                sum++;
            }
        }
        System.out.println(sum + "x");
    }	    
}
