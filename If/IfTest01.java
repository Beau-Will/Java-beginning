/*
	��ż��
	
	����
		�������һ�����������ó���ʵ���жϸ�����ʱ��������ż�������ڿ���̨���������ʱ��������ż����
*/

import java.util.Scanner;

public class IfTest01 {
	public static void main(String[] args) {
		//Ϊ�������������һ�����������ü���¼��һ�����ݡ�(�������������󣬽�������)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ��������");
		int number = sc.nextInt();
		
		//�ж�������ż����������Ҫ��������������жϣ�ʹ��if..else�ṹ
		//�ж��Ƿ�ż����Ҫʹ��ȡ�������ʵ�ָù��� number % 2 == 0
		//�����ж�������ڿ���̨�����Ӧ������
		if(number%2 == 0) {
			System.out.println(number + "��ż��");
		} else {
			System.out.println(number + "������");
		}
		
	}
}