/*
	循环嵌套：
		循环语句中包含循环语句
		
	需求：
		在控制台输出一天的小时和分钟
		
		分钟和小时的范围：
			分钟：0 <= minute < 60
			小时：0 <= hour < 24
*/
public class ForForDemo {
	public static void main(String[] args) {
		/*
		System.out.println("0时0分");
		System.out.println("0时1分");
		System.out.println("0时2分");
		System.out.println("0时3分");
		System.out.println("--------");
		System.out.println("1时0分");
		System.out.println("1时1分");
		System.out.println("1时2分");
		System.out.println("1时3分");
		System.out.println("--------");
		System.out.println("2时0分");
		System.out.println("2时1分");
		System.out.println("2时2分");
		System.out.println("2时3分");
		*/
		
		for (int i = 0; i<=24; i++) {
			for (int j = 0; j<=60; j++) {
				System.out.println(i + "时" + j + "分");
			}
			System.out.println("---------");
		}
	}
}