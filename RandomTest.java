/*
	������
	
	����
		�����Զ�����һ��1-100֮������֣�ʹ�ó���ʵ�ֲ³���������Ƕ��٣�
		���´��ʱ����ݲ�ͬ���������Ӧ����ʾ
		
		����µ����ֱ���ʵ���ִ���ʾ��µ����ݴ���
		����µ����ֱ���ʵ����С����ʾ��µ�����С��
		����µ���������ʵ������ȣ���ʾ��ϲ�������
*/

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
	public static void main(String[] args) {
		//Ҫ��ɲ����ֵ���Ϸ��������Ҫ��һ��Ҫ�µ����֣�ʹ����������ɸ����֣���Χ1-100
		Random r = new Random();
		int number = r.nextInt(100) + 1;
		
		while(true) {
			//ʹ�ó���ʵ�ֲ����֣�ÿ�ξ�Ҫ����²������ֵ����Ҫʹ�ü���¼��ʵ��
			Scanner sc = new Scanner(System.in);
			
			System.out.println("��������Ҫ�µ����֣�");
			int guessNumber = sc.nextInt();
			
			//�Ƚ���������ֺ�ϵͳ������ʫ�䣬��Ҫʹ�÷�֧��䡣����ʹ��if..else..if..��ʽ�����ݲ�ͬ������в²�����ʾ
			if(guessNumber > number) {
				System.out.println("��µ�����" + guessNumber + "����");
			}else if(guessNumber < number) {
				System.out.println("��µ�����" + guessNumber + "С��");
			}else {
				System.out.println("��ϲ�������");
				break;
			}
		}
		
	}
}