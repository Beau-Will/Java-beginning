/*
	����ʹ�õ�ע�����
		���ֲ����ظ�
		����δ��ֵ������ʹ��
		long���͵ı��������ʱ��Ϊ�˷�ֹ�������󣬺���Ҫ��L
		float���͵ı��������ʱ��Ϊ�˷�ֹ���Ͳ����ݣ�����Ҫ��F
*/
public class VariableDemo02 {
	public static void main (String[] args){
	//����byte���͵ı���
	byte b =10;
	System.out.println(b);
	
	//����short���͵ı���
	short s = 100;
	System.out.println(s);
	
	//����int���͵ı���
	int i = 10000;
	System.out.println(i);
	
	//����double���͵ı���
	double d =13.14;
	System.out.println(d);
	
	//����char���͵ı���
	char c = 'a';
	System.out.println(c);
	
	//����boolean���͵ı���
	boolean bb = true;
	System.out.println(bb);
	System.out.println("---------");
	
	//����long���͵ı���
	//long l = 10000000000;
	/*��������дһ����ĸL������long���ͣ����򱨴����£�
	VariableDemo02.java:29: ����: ����̫��
        long l = 10000000000;
                 ^
	1 ������
	*/
	//System.out.println(l);
	//System.out.println("---------");
	
	//��ʾ����д��
	long ll = 10000000000L;
	System.out.println(ll);
	System.out.println("---------");
	
	//����float���͵ı���
	float f = 13.14F;
	System.out.println(f);
	/*45�к󲻸�F��������±���
	VariableDemo02.java:40: ����: �����ݵ�����: ��doubleת����float���ܻ�����ʧ
        float f = 13.14;
                  ^
	1 ������
	*/
	
	/*���������£�
		F:\JAVA\java>java VariableDemo02
	10
	100
	10000
	13.14
	a
	true
	---------
	10000000000
	---------
	13.14
	*/
	}
}
