/*
	��������
	
	����
		һ������ס���������У����ǵ���߱��뾭�������ó������ó���ʵ�����������е������ߡ�
*/
import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		//���δ֪�����ü���¼��ʵ�֣����ȵ�����Ȼ�󴴽�����
		Scanner sc = new Scanner(System.in);
		
		//����¼��������߷ֱ�ֵ������������
		System.out.println("�������һ�����е���ߣ�");
		int height1 = sc.nextInt();
		
		System.out.println("������ڶ������е���ߣ�");
		int height2 = sc.nextInt();
		
		System.out.println("��������������е���ߣ�");
		int height3 = sc.nextInt();
		
		//����Ԫ�������ȡǰ�������еĽϸ����ֵ��������ʱ��߱�������������
		int tempHeight = height1 > height2 ? height1 : height2;
		
		//����Ԫ�������ȡ��ʱ���ֵ�͵�����������߽ϸ�ֵ�����������߱������档
		int maxHeight = tempHeight > height3 ? tempHeight : height3;
		
		//������
		System.out.println("�����������������ߵ��ǣ�" + maxHeight +"cm");
	}
}