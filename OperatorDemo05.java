/*

*/
public class OperatorDemo05 {
	public static void main(String[] args) {
		//�������
		int i = 10;
		int j = 20;
		int k = 10;
		
		//==
		System.out.println(i == j);
		System.out.println(i == k);
		System.out.println("--------");
		
		//!=
		System.out.println(i != j);
		System.out.println(i != k);
		System.out.println("--------");
		
		//>
		System.out.println(i > j);
		System.out.println(i > k);
		System.out.println("--------");
		
		//>=
		System.out.println(i >= j);
		System.out.println(i >= k);
		System.out.println("--------");
		
		//��С�İ�==д����=
		//��j��ֵ��ֵ����i��Ȼ�����i��ֵ
		System.out.println(i = j);
		/* ���������£�
			F:\JAVA\java>java OperatorDemo05
		false
		true
		--------
		true
		false
		--------
		false
		false
		--------
		false
		true
		--------
		20
		*/
		
	}
}