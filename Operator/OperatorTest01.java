/*
	��ֻ�ϻ�
	
	����
		����԰������ֻ�ϻ�����֪��ֻ�ϻ������طֱ�Ϊ180kg��200kg��
		���ó���ʵ���ж���ֻ�ϻ��������Ƿ���ͬ
*/
public class OperatorTest01 {
	public static void main(String[] args) {
			//1�����������������ڱ����ϻ������أ���λΪkg���������������ֵ����
			int weight1 = 180;
			int weight2 = 200;
			
			//2:����Ԫ�����ʵ���ϻ����ص��жϣ�������ͬ������true�����򣬷���false
			boolean b = weight1 == weight2 ? true : false;
			
			//3:������
			System.out.println("b=" + b);
	}
}