/*

*/
public class ConversionDemo {
	public static void main(String[] args) {
		//�Զ�����ת��
		double d = 10;
		System.out.println(d);
		/*������:
			F:\JAVA\java>java ConversionDemo
		10.0
		*/
		
		//����byte���͵ı���
		byte b = 10;
		short s = b;
		int i = b;
		
		//char c = b;
		/*19�лᱨ��,���Ͳ�����
			F:\JAVA\java>javac ConversionDemo.java
		ConversionDemo.java:19: ����: �����ݵ�����: ��byteת����char���ܻ�����ʧ
					char c = b;
					
		1 ������
		*/
		
		//ǿ������ת��
		//int k = 88.88��
		
		/*
		ConversionDemo.java:29: ����: �Ƿ��ַ�: '\uff1b'
                int k = 88.88��
                             ^
		1 ������
		*/
		int k = (int)88.88;
		System.out.println(k);
		
	}
}