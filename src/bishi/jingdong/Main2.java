package bishi.jingdong;

import java.util.Scanner;
/**
 * 
5
peach
grapefruit
banana
orange
orange

 * @author Jin
 *
 */
public class Main2 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String[] arr = new String[n];
		for(int i = 0; i < n; i++){
			arr[i] = s.next();
		}
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println(count(arr));
	}
	public static int count(String[] array) {  
        int len = array.length;  
  
        for (int i = 0; i < array.length - 1; i++) {  
            for (int j = i + 1; j < array.length; j++) {  
                String str = array[i];  
                if (array[j].equals(str)) {  
                    // 重复，数组总长度减1  
                    len--;  
  
                    //i++;  
                }  
            }  
        }  
  
        return len;  
    } 
}
