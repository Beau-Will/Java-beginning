/*
	变量使用的注意事项：
		名字不能重复
		变量未赋值，不能使用
		long类型的变量定义的时候，为了防止整数过大，后面要加L
		float类型的变量定义的时候，为了防止类型不兼容，后面要加F
*/
public class VariableDemo02 {
	public static void main (String[] args){
	//定义byte类型的变量
	byte b =10;
	System.out.println(b);
	
	//定义short类型的变量
	short s = 100;
	System.out.println(s);
	
	//定义int类型的变量
	int i = 10000;
	System.out.println(i);
	
	//定义double类型的变量
	double d =13.14;
	System.out.println(d);
	
	//定义char类型的变量
	char c = 'a';
	System.out.println(c);
	
	//定义boolean类型的变量
	boolean bb = true;
	System.out.println(bb);
	System.out.println("---------");
	
	//定义long类型的变量
	//long l = 10000000000;
	/*必须后面跟写一个字母L，代表long类型，否则报错如下：
	VariableDemo02.java:29: 错误: 整数太大
        long l = 10000000000;
                 ^
	1 个错误
	*/
	//System.out.println(l);
	//System.out.println("---------");
	
	//演示上述写法
	long ll = 10000000000L;
	System.out.println(ll);
	System.out.println("---------");
	
	//定义float类型的变量
	float f = 13.14F;
	System.out.println(f);
	/*45行后不跟F输出会如下报错：
	VariableDemo02.java:40: 错误: 不兼容的类型: 从double转换到float可能会有损失
        float f = 13.14;
                  ^
	1 个错误
	*/
	
	/*输出结果如下：
		F:\JAVA\java>java VariableDemo02
	10
	100
	10000
	13.14
	a
	true
	---------
	10000000000
	---------
	13.14
	*/
	}
}
