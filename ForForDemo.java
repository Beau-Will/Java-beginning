/*
	ѭ��Ƕ�ף�
		ѭ������а���ѭ�����
		
	����
		�ڿ���̨���һ���Сʱ�ͷ���
		
		���Ӻ�Сʱ�ķ�Χ��
			���ӣ�0 <= minute < 60
			Сʱ��0 <= hour < 24
*/
public class ForForDemo {
	public static void main(String[] args) {
		/*
		System.out.println("0ʱ0��");
		System.out.println("0ʱ1��");
		System.out.println("0ʱ2��");
		System.out.println("0ʱ3��");
		System.out.println("--------");
		System.out.println("1ʱ0��");
		System.out.println("1ʱ1��");
		System.out.println("1ʱ2��");
		System.out.println("1ʱ3��");
		System.out.println("--------");
		System.out.println("2ʱ0��");
		System.out.println("2ʱ1��");
		System.out.println("2ʱ2��");
		System.out.println("2ʱ3��");
		*/
		
		for (int i = 0; i<=24; i++) {
			for (int j = 0; j<=60; j++) {
				System.out.println(i + "ʱ" + j + "��");
			}
			System.out.println("---------");
		}
	}
}