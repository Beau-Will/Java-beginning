/*

*/
public class OperatorDemo04 {
	public static void main (String[] args) {
		//�������
		int i = 10;
		System.out.println("i:" + i);
		System.out.println("--------");
		//����ʹ�ã����ֽԿɣ������һ��
		//i++;
		//++i; 
		//System.out.println("i:" + i);
		
		//�������ʹ��
		//int j = i++;
		/* ������д����Ļ������������£�
			F:\JAVA\java>java OperatorDemo
		i:10
		--------
		i:11
		j:10
		*/
		int j = ++i;
		/* ���������£�
			F:\JAVA\java>java OperatorDemo
		i:10
		--------
		i:11
		j:11
		*/
		System.out.println("i:" + i);
		System.out.println("j:" + j);
		//�Լ�ͬ��ɵ�
		
	}
}