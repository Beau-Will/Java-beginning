/*
	continue������ѭ���У������������ƣ�����ĳ��ѭ�������ݵ�ִ�У�������һ�ε�ִ��
	break������ѭ���У������������ƣ���ֹѭ�������ݵ�ִ�У�Ҳ����˵������ǰ������ѭ��
*/
public class ControlDemo {
	public static void main(String[] args) {
		for(int i = 1; i<=5; i++) {
			if(i%2 == 0) {
				//continue;
				break;
			}
			
			System.out.println(i);
		}	
	}
}