/*
	��·�߼������
*/
public class OperatorDemo07 {
	public static void main(String[] args) {
	//�������
	int i = 10;
	int j = 20;
	int k = 30;
	
	//&& ��false��false
	System.out.println((i > j) && (i > k)); //false && false
	System.out.println((i < j) && (i > k)); //true && false
	System.out.println((i > j) && (i < k)); //false && true
	System.out.println((i < j) && (i < k)); //true && true
	System.out.println("--------");
	
	//|| ��true��true
	System.out.println((i > j) || (i > k)); //false || false
	System.out.println((i < j) || (i > k)); //true || false
	System.out.println((i > j) || (i < k)); //false || true
	System.out.println((i < j) || (i < k)); //true || true
	System.out.println("--------");
	
	/*&&��& &&������&��ͬ�������ж�·Ч������ָ�µڶ������ǰ���Ǹ�����
	��false���������϶���false�����Ժ���������Ͳ�ִ���ˣ�������Կ���
	��������������ע�͵�&&��ִ��&���뼴��
	�ܽ᣺
	�߼���&�����������٣��ұ߶�Ҫִ��
	��·��&&������ұ�Ϊ�棬�ұ�ִ�У�������Ϊ�٣��ұ߲�ִ��
	�߼���|�����������٣��ұ߶�Ҫִ��
	�߼���������Ϊ�٣��ұ�ִ�У�����ұ�Ϊ�棬�ұ߲�ִ��
	*/
	//System.out.println(i++ > 100 & (j++ > 100)); //false & false
	System.out.println(i++ > 100 && (j++ > 100)); //false && false
	System.out.println("i:" + i);
	System.out.println("j:" + j);
	}
}