/*
	if����ʽ2
	
	��ʽ��
		if (��ϵ���ʽ) {
			�����1;
		} else {
			�����2;
		}
	
	ִ�����̣�
		1�����ȼ����ϵ���ʽ��ֵ
		2�������ϵ���ʽ��ֵΪtrue��ִ�������1
		3�������ϵ���ʽ��ֵΪfalse��ִ�������2
		4������ִ�к�����������
*/
public class IfDemo02 {
	public static void main(String[] args) {
		System.out.println("��ʼ");
		
		//������������
		int a = 10;
		int b = 20;
		
		//�����ж�a�Ƿ����b������ǣ��ڿ���̨�����a��ֵ����b��������ǣ��ڿ���̨�����a��ֵ������b
		if (a > b) {
			System.out.println("a��ֵ����b");
		} else {
			System.out.println("a��ֵ������b");
		}
		
		System.out.println("����");
	}
}