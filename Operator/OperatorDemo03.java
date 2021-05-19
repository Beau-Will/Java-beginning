/*
	字符串的"+"操作
*/
public class OperatorDemo03 {
	public static void main(String[] args) {
			System.out.println("it" + "heima");
			System.out.println("itheima" + "666");
			System.out.println(666 + "itheima");
			
			System.out.println("黑马" + 6 + 66);
			System.out.println(1 + 99 +"年黑马");
			System.out.println(1 +"年黑马" + 99);
			System.out.println("年黑马" +1 + 99);
			/*输出结果：
				F:\JAVA\java>java OperatorDemo03
			itheima
			itheima666
			666itheima
			黑马666
			100年黑马
			1年黑马99
			年黑马199
			*/
	}
}