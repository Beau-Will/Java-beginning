/*
	�����ﶬ
	
	����
		һ����12���£������ڴ����ﶬ4�����ڣ�����¼��һ���·ݣ����ó���ʵ���жϸ��·������ĸ����ڣ��������
	
	����3��4��5
	�ģ�6��7��8
	�9��10��11
	����12��1��2
*/

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		//����¼���·����ݣ�ʹ�ñ�������
		System.out.println("������һ���·ݣ�");
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		//��������жϣ��������switch���ʵ��
		//��ÿ������У���������Ӧ�ļ���
		/*
		switch(month) {
			case 1:
				System.out.println("����");
				break;
			case 2:
				System.out.println("����");
				break;
			case 3:
				System.out.println("����");
				break;
			case 4:
				System.out.println("����");
				break;
			case 5:
				System.out.println("����");
				break;
			case 6:
				System.out.println("�ļ�");
				break;
			case 7:
				System.out.println("�ļ�");
				break;
			case 8:
				System.out.println("�ļ�");
				break;
			case 9:
				System.out.println("�＾");
				break;
			case 10:
				System.out.println("�＾");
				break;
			case 11:
				System.out.println("�＾");
				break;
			case 12:
				System.out.println("����");
				break;
			default :
				System.out.println("��������·�����");
				//break; ��ʡ��
		}
		*/
		
		//case��͸
		switch(month) {
			case 1:
			case 2:
			case 12:
				System.out.println("����");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("����");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("�ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("�＾");
				break;
			default :
				System.out.println("��������·�����");
		}
	}
}