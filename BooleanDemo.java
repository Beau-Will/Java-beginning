public class BooleanDemo
{
	public static void main(String[] args)
	{
		//�����������ͱ���
		int i = 4;
		int j = 4;
		boolean b1 = i==j ;
		boolean b2 = i!=j ;
		//������������
		String s1 = new String ();
		String s2 = new String ();
		boolean b3 = (s1 == s2);
		boolean b4 = (s1 != s2);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(s1);
		System.out.println(s2);
		/*��������
			F:\JAVA\java>java BooleanDemo
		true
		false
		false
		true


		*/
	}
}