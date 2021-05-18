/*
	算术运算符
*/
public class OperatorDemo01 {
	public static void main(String[] args) {
		//定义两个变量
		int a = 6;
		int b = 4;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		//输出结果是1，因为整数相除只能得到整数，这里要想得到小数1.5，只能用浮点数相除
		System.out.println(a % b);
		//除法得到的是商，取余得到是余数
		
		System.out.println("--------");
		System.out.println(6.0 / 4);
	}
}