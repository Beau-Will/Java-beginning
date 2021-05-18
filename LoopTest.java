/*
	三种循环的区别
*/
public class LoopTest {
	public static void main(String[] args) {
		/*
		//for循环
		for(int i = 3; i<3; i++){
			System.out.println("我爱Java");
		}
		System.out.println("--------");
		
		//while循环
		int j = 3;
		while(j<3) {
			System.out.println("我爱Java");
			j++;
		}
		System.out.println("--------");
		
		//do...while循环
		int k = 3;
		do {
			System.out.println("我爱Java");
			k++;
		}while (k<3);
		输出结果如下：
			F:\JAVA\java>java LoopTest
		--------
		--------
		我爱Java
		结论：do...while是边做边循环
		*/
		/*
		//for循环
		for(int i = 1; i<3; i++){
			System.out.println("我爱Java");
		}
		//System.out.println(i);
			F:\JAVA\java>javac LoopTest.java
		LoopTest.java:38: 错误: 找不到符号
					System.out.println(i);
                                   ^
		符号:   变量 i
		位置: 类 LoopTest
		1 个错误
		//结论：i只能在for循环里面使用，放在for循环外面会报错，而while循环则不会
		System.out.println("--------");
		
		//while循环
		int j = 1;
		while(j<3) {
			System.out.println("我爱Java");
			j++;
		}
		System.out.println(j);
		System.out.println("--------");
		*/
		
		//死循环
		/*
		for(;;) {
			System.out.println("for");
		}
		*/
		
		/*
		while(true) {
			System.out.println("while");
		}
		*/
		
		/*
		do {
			System.out.println("do...while");
		}while (true);
		*/
	}
}