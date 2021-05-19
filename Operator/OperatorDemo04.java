/*

*/
public class OperatorDemo04 {
	public static void main (String[] args) {
		//定义变量
		int i = 10;
		System.out.println("i:" + i);
		System.out.println("--------");
		//单独使用，两种皆可，结果都一样
		//i++;
		//++i; 
		//System.out.println("i:" + i);
		
		//参与操作使用
		//int j = i++;
		/* 这样编写代码的话，输出结果如下：
			F:\JAVA\java>java OperatorDemo
		i:10
		--------
		i:11
		j:10
		*/
		int j = ++i;
		/* 输出结果如下：
			F:\JAVA\java>java OperatorDemo
		i:10
		--------
		i:11
		j:11
		*/
		System.out.println("i:" + i);
		System.out.println("j:" + j);
		//自减同理可得
		
	}
}