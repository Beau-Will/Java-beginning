/*

*/
public class ConversionDemo {
	public static void main(String[] args) {
		//自动类型转换
		double d = 10;
		System.out.println(d);
		/*输出结果:
			F:\JAVA\java>java ConversionDemo
		10.0
		*/
		
		//定义byte类型的变量
		byte b = 10;
		short s = b;
		int i = b;
		
		//char c = b;
		/*19行会报错,类型不兼容
			F:\JAVA\java>javac ConversionDemo.java
		ConversionDemo.java:19: 错误: 不兼容的类型: 从byte转换到char可能会有损失
					char c = b;
					
		1 个错误
		*/
		
		//强制类型转换
		//int k = 88.88；
		
		/*
		ConversionDemo.java:29: 错误: 非法字符: '\uff1b'
                int k = 88.88；
                             ^
		1 个错误
		*/
		int k = (int)88.88;
		System.out.println(k);
		
	}
}