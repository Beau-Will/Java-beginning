/*
	�ַ���"+"����
*/
public class OperatorDemo02 {
	public static void main(String[] args) {
		//������������
		int i = 10;
		char c = 'A'; //'A'��ֵ��65
		c = 'a'; //'a'��ֵ��97
		c = '0'; //'0'��ֵ��48
		System.out.println(i + c);
		System.out.println("--------");
		
		//char ch = i + c;
		//char���ͻᱻ�Զ�����Ϊint����
		int j = i + c;
		System.out.println(j);
		System.out.println("--------");
		
		//int k = 10 + 13.14;
		double d = 10 + 13.14;
		System.out.println(d);
		
	}
}