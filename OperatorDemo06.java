/*
	�߼������
*/
public class OperatorDemo06 {
	public static void main(String[] args){
		//�������
		int i = 10;
		int j = 20;
		int k = 30;
		
		//& ���ţ���false��false��ȫtrue��true
		System.out.println((i > j) & (i > k)); //false & false
		System.out.println((i < j) & (i > k)); //true & false
		System.out.println((i > j) & (i < k)); //false & true
		System.out.println((i < j) & (i < k)); //true & true
		System.out.println("--------");
		
		//| ���ţ���true��true, ȫfalse��false 
		System.out.println((i > j) | (i > k)); //false | false
		System.out.println((i < j) | (i > k)); //true | false
		System.out.println((i > j) | (i < k)); //false | true
		System.out.println((i < j) | (i < k)); //true | true
		System.out.println("--------");
		
		//^ ����ţ���ͬΪfalse����ͬΪtrue
		System.out.println((i > j) ^ (i > k)); //false ^ false
		System.out.println((i < j) ^ (i > k)); //true ^ false
		System.out.println((i > j) ^ (i < k)); //false ^ true
		System.out.println((i < j) ^ (i < k)); //true ^ true
		System.out.println("--------");
		
		//! ����
		System.out.println((i > j)); //false
		System.out.println(!(i > j)); //!false
		System.out.println(!!(i > j)); //!!false
		System.out.println(!!!(i > j)); //!!!false
	}
}