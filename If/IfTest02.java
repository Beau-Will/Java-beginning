/*
	���Խ���
	
	����
		С����Ҫ��ĩ�����ˣ�С���ְֶ���˵�����������ͬ�Ŀ��Գɼ���������ͬ�������������Կ���С���ĵ÷֣�
		���ó���ʵ��С�����׸û��ʲô����������ڿ���̨�����
		
	������
		95-100	ɽ�����г�һ��
		90-94	���ֳ���һ��
		80-89	���ν�����һ��
		80����	����һ��
*/

import java.util.Scanner;

public class IfTest02 {
	public static void main(String[] args) {
		//С���Ŀ��Գɼ�δ֪������ʹ�ü���¼��ķ�ʽ��ȡֵ
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ��������");
		int score = sc.nextInt();
		
		//���ڽ�������϶࣬���ڶ����жϣ�����if...else...if��ʽʵ��
		//Ϊÿ���ж����ö�Ӧ������
		//Ϊÿ���ж����ö�Ӧ�Ľ���
		//���ݲ��ԣ���ȷ���ݣ��߽����ݣ���������
		if(score>100 || score<0) {
			System.out.println("������ķ�������");
		} else if(score>=95 && score<=100) {
			System.out.println("ɽ�����г�һ��");
		} else if(score>=90 && score<=94) {
			System.out.println("���ֳ���һ��");
		} else if(score>=80 && score<=89) {
			System.out.println("���ν�����һ��");
		} else {
			System.out.println("����һ��");
		}
		
	}
}