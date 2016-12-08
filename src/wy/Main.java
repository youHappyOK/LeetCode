package wy;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            int a = s.nextInt();
            int b = s.nextInt();
            int a1 = fun(a);
            int a2 = rev(a1);
            System.out.println(a1);
            System.out.println(a2);
            int b1 = fun(b);
            int b2 = rev(b1);
            System.out.println(b1);
            System.out.println(b2);
            System.out.println(b1+ b2);
            
            System.out.println(reverse(reverse(a) + reverse(b)));
        }
    }
    
    public static int fun(int a){
        while(a % 10 == 0){
            a = a / 10;
        }
        return a;
    }
    
    public static int rev(int x){
        long result = 0;
        while(x!=0){
            int mod = x % 10;
            x = x / 10;
            result = result * 10 + mod;
        }
        if(result < Integer.MIN_VALUE || result > Integer.MAX_VALUE)
            return 0;
        return (int)result;
    }
    public static int reverse(int y){
        int a = fun(y);
        int b = rev(a);
        return b;
    }
}