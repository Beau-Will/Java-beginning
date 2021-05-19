/*
	短路逻辑运算符
*/
public class OperatorDemo07 {
	public static void main(String[] args) {
	//定义变量
	int i = 10;
	int j = 20;
	int k = 30;
	
	//&& 有false则false
	System.out.println((i > j) && (i > k)); //false && false
	System.out.println((i < j) && (i > k)); //true && false
	System.out.println((i > j) && (i < k)); //false && true
	System.out.println((i < j) && (i < k)); //true && true
	System.out.println("--------");
	
	//|| 有true则true
	System.out.println((i > j) || (i > k)); //false || false
	System.out.println((i < j) || (i > k)); //true || false
	System.out.println((i > j) || (i < k)); //false || true
	System.out.println((i < j) || (i < k)); //true || true
	System.out.println("--------");
	
	/*&&和& &&作用与&相同，但是有短路效果，是指下第二行如果前面那个条件
	是false，输出结果肯定是false，所以后面的条件就不执行了，具体测试可以
	先输出下面代码再注释掉&&，执行&代码即可
	总结：
	逻辑与&，无论左边真假，右边都要执行
	短路与&&，如果右边为真，右边执行；如果左边为假，右边不执行
	逻辑或|，无论左边真假，右边都要执行
	逻辑或，如果左边为假，右边执行；如果右边为真，右边不执行
	*/
	//System.out.println(i++ > 100 & (j++ > 100)); //false & false
	System.out.println(i++ > 100 && (j++ > 100)); //false && false
	System.out.println("i:" + i);
	System.out.println("j:" + j);
	}
}