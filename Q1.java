/*1. 判断一个数是否能被另一个整数整除是一个挺简单的问题，一般一个模运算就可以搞定了，懒惰的晓萌还是不想自己做，于是找到你帮他写代码，你就帮帮他吧。
输入格式
输入包括两个由空格分开的整数 M 和 N(1≤M,N≤500)。
输出格式
输出包括一行，如果 M 可以被 N 整除就输出YES，否则输出NO（结果大小写敏感）。*/

import java.util.*;   //import类之后也要打分号

public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		String divide = (M % N = 0)?"YES":"NO";  
		/*条件运算符（ ? : ）也称为 “三元运算符”。
		语法形式：布尔表达式 ？ 表达式1 ：表达式2
        运算过程：如果布尔表达式的值为 true ，
		则返回 表达式1 的值，否则返回 表达式2 的值。*/
		System.out.print(divide);
	}
}
