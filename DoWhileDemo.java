/*
	do...while���
	
	������ʽ��
		do {
			ѭ�������;
		}while (�����ж����);
	������ʽ��
		��ʼ�����;
		do {
			ѭ�������;
			�����������;
		}while(�����ж����);
		
	ִ�����̣�
		1��ִ�г�ʼ�����
		2��ִ��ѭ�������
		3��ִ�������������
		4��ִ�������ж���䣬��������true����false
			�����false��ѭ������
			�����true������ִ��
		5���ص�2����
*/
public class DoWhileDemo {
	public static void main(String[] args){
		//�����ڿ���̨���5��"HelloWorld"
		//forѭ��ʵ��
		for(int i = 1; i<=5; i++) {
			System.out.println("HelloWorld");
		}
		System.out.println("--------");
		
		//do...whileѭ��ʵ��
		int j =1;
		do {
			System.out.println("HelloWorld");
			j++;
		}while(j<=5);
	}
}