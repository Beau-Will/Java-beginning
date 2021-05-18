/*
	水仙花数
	
	需求：
		在控制台输出所有的"水仙花数"
*/
public class ForTest04 {
	public static void main(String[] args) {
		//输出所有的水仙花数必然要使用到循环，遍历所有的三位数，三位数从100开始，到999结束
		/*
		for(int i=100; i<=999; i++) {
			
		}
		*/
		for(int i=100; i<1000; i++) {
			//在计算之前获取三位数中每个位上的数
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/100%10;
			
			//判定条件是将三位数中的每个数值取出来，计算立方和后于原始数字比较是否相同
			if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i) {
				//输出满足条件的数字就是水仙花数
				System.out.println(i);
			}
		}
	}
}