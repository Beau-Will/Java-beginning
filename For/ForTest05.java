/*
	ͳ��
	
	����
		ͳ��"ˮ�ɻ���"һ���ж��ٸ������ڿ���̨�������
*/
public class ForTest05 {
	public static void main(String[] args){
		//�������count�����ڱ���"ˮ�ɻ���"����������ʼֵΪ0
		int count = 0;
		
		//������е�ˮ�ɻ�����ȻҪʹ�õ�ѭ�����������е���λ������λ����100��ʼ����999����
		for (int i=100; i<1000; i++) {
			//�ڼ���֮ǰ��ȡ��λ����ÿ��λ�ϵ�ֵ
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/100%10;
			//���ж�ˮ�ɻ����Ĺ����У����������������������Ϊ�޸�count��ֵ��ʹcount+1
			if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i) {
				count++;
			}
		}
		
		//��ӡ������ս��
		System.out.println("ˮ�ɻ������У�" + count + "��");
		
	}
}