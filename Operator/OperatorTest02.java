/*
	��������
	
	����
		һ��������ס���������У���֪���ǵ���߷ֱ�Ϊ150com��210cm��165cm,
		���ó���ʵ�ֻ�ȡ���������е������ߡ�
*/
public class OperatorTest02 {
	public static void main(String[] args) {
		//1�����������������ڱ�����е���ߣ���λΪcm���������������ֵ���ɡ�
		int height1 = 150;
		int height2 = 210;
		int height3 = 165;
		
		//2������Ԫ�������ȡǰ�������еĽϸ����ֵ��������ʱ��߱���������
		int tempHeight = height1 > height2 ? height1 : height2;
		
		//3������Ԫ�������ȡ��ʱ���ֵ�͵�����������߽ϸ�ֵ�����������߱�������
		int maxHeight = tempHeight > height3 ? tempHeight : height3;
		
		//4��������
		System.out.println("maxHeight=" + maxHeight);
	}
}