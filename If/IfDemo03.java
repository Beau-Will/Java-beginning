/*
	��ʽ��
		if (��ϵ���ʽ1) {
			�����1;
		} else if (��ϵ���ʽ2) {
			�����2;
		}
		..
		else {
			�����n+1;
		}
		
	ִ�����̣�
		1�����ȼ����ϵ���ʽ1��ֵ
		2�����ֵΪtrue��ִ�������1�����ֵΪfalse�ͼ����ϵ���ʽ2��ֵ
		3�����ֵΪtrue��ִ�������2�����ֵΪfalse�ͼ����ϵ���ʽ3��ֵ
		4��..
		5�����û���κι�ϵ���ʽΪtrue����ִ�������n+1��
*/

import java.util.Scanner;

public class IfDemo03 {
	public static void main(String[] args) {
		System.out.println("��ʼ");
		
		//���󣺼���¼��һ��������(1,2,...,7)�������Ӧ������һ�����ڶ���...������
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ����������1-7��");
		int week = sc.nextInt();
		
		if(week == 1) {
			System.out.println("����һ");
		} else if(week == 2) {
			System.out.println("���ڶ�");
		} else if(week == 3) {
			System.out.println("������");
		} else if(week == 4) {
			System.out.println("������");
		} else if(week == 5) {
			System.out.println("������");
		} else if(week == 6) {
			System.out.println("������");
		} else {
			System.out.println("������");
		}
			
		
		System.out.println("����");
	}
}