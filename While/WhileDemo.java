/*
	while���
	
	������ʽ��
		while(�����ж����) {
			ѭ�������;
		}
	������ʽ��
		��ʼ�����
		while(�����ж����) {
			ѭ�������;
			�����������;
		}
		
	ִ�����̣�
	1��ִ�г�ʼ�����
	2:ִ�������ж���䣬��������true����false
		�����false��ѭ������
		�����true������ִ��
	3:ִ��ѭ�������
	4:ִ�������������
	5���ص�2����
*/
public class WhileDemo {
	public static void main(String[] args){
		//�����ڿ���̨���5��"HelloWorld"
		//forѭ��ʵ��
		for(int i=1; i<=5; i++) {
			System.out.println("HelloWorld");
		}
		System.out.println("--------");
		
		//whileѭ��ʵ��
		int j = 1;
		while(j<=5) {
			System.out.println("HelloWorld");
			j++;
		}
	}
}