package bishi;

import java.util.Scanner;
/***
 * ��Բ��
 * ������һ�Ű뾶Ϊr��Բ����������λ��(x,y)�����������Բ���������Ƶ�(x1,y1)��ÿ���ƶ�һ������������Բ����Ե�̶�һ����Ȼ��Բ�����������ת����������Ҫ�ƶ�������
 * ��������:
һ���������r,x,y,x1,y1(1��r��100000,-100000��x,y,x1,y1��100000)


�������:
���һ����������ʾ��

��������:
2 0 0 0 4

�������:
1
 * @author Jin
 *
 */
public class BYZ {
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		int x = s.nextInt();
		int y = s.nextInt();
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		int des = (int) Math.sqrt(Math.pow((x-x1), 2) + Math.pow((y-y1), 2));
		int m = des / (2*r);
		int n = des % (2*r);
		int count;
		if(n == 0){
			count = m;
		}else{
			count = m + 1;
		}
		System.out.println(count);
	}
}
