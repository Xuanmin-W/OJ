/*2. 斐波那契数列是一种非常有意思的数列，由 00 和 11 开始，之后的斐波那契系数就由之前的两数相加。用数学公式定义斐波那契数列则可以看成如下形式：
F_0=0
F_1=1
F_n=F_{n-1}+F_{n-2}
我们约定 F_n表示斐波那契数列的第 n 项，你能知道斐波那契数列中的任何一项吗？
输入格式
输入包括一行，包括一个整数 N(0≤N≤50)。
输出格式
输出包括一行，包括一个整数，为斐波那契数列的第 N 项的值。*/
//递归写法，时间复杂度为O(1.618^n),空间复杂度为O(n)
import java.util.*;

public class Main
{
	public static void main(String[] args){		//这里是args，不是arg
		Scanner sc = new Scanner(System.in);	//这里创建Scanner对象时括号内要写入System.in参数。
		int n = sc.nextInt();	//这里nextInt()方法括号内没有参数
		int m = feibo(n);
		System.out.print(m);
	}
	public static int feibo(int a){  //这里feibo方法加static关键字更好，它是工具方法。
		/*以下，学长给了形式更简便的写法。学习一下学长的代码风格：
			if(n < 2) return n;
			else return feibo(n - 1) + feibo(n - 2);	*/
		if(a>1)
			feibo(a) = feibo(a-1)+feibo(a-2);
		else if (a = 1)
			return 1;
		else if (a = 0)
			return 0;
	}
}

/*以下为第二种方法，非递归方法（递推方法），
时间复杂度为O（n)，空间复杂度为O(n)。

import java.util.*;

public class Main
{	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] Feibo =new int[51];   //java数组定义格式
		Feibo[0] = 0;
		Feibo[1] = 1;
		for(int i = 2;i<=n;i++){
			Feibo[i] = Feibo[i-1]+Feibo[i-2];
		}
		System.out.print(Feibo[n]);
	}
} 
*/