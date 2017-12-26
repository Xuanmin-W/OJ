/*给定由大写，小写字母和空格组成的字符串，
返回 最后 一个单词的长度。
如果输入中不存在单词，返回 0。
注意：
“单词”是指不包含空格符号的字符串
例如：
对于字符串"hello World"（不带引号）, 那么返回的结果是 5；
对于字符串"abc abc "（不带引号），那么返回的结果就是 3。
输入格式
输入仅一行，为字符串 s（长度不超过 10000）。
输出格式
输出 s 中最后一个单词的长度。*/
import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String word = "";
		while(sc.hasNext()){	//hasNext()方法的N要大写
			word = sc.next;		//while里只有一行代码，省略{}更好
		}
		System.out.print(word.length());	
		/*java中的length属性是针对数组说的,比如说你声明了一个数组,
		想知道这个数组的长度则用到了length这个属性.
		
		java中的length()方法是针对字符串String说的,	
		如果想看这个字符串的长度则用到length()这个方法.
		
		java中的size()方法是针对泛型集合说的,
		如果想看这个泛型有多少个元素,就调用此方法来查看!*/
	}
}

//以下是学长提供的另一种方法。更加复杂一点，权当学习
/*
import.java.util.*

public class Main
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in)
		int len = 0;   //学长在这里和底下之间空一行，增加代码可读性
					
		if (sc.hasNext()) 
		{	
			String line = sc.nextLine();
			String[] words = line.split(" ");
			//split()是将字符串分隔成字符数组的，这里就是以空格来分隔
			if (words.length > 0)
			{
				len = words[words.length - 1].length();
			}
		}
		System.out.print(len);
	}
}
*/