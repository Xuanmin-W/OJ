/*�����ɴ�д��Сд��ĸ�Ϳո���ɵ��ַ�����
���� ��� һ�����ʵĳ��ȡ�
��������в����ڵ��ʣ����� 0��
ע�⣺
�����ʡ���ָ�������ո���ŵ��ַ���
���磺
�����ַ���"hello World"���������ţ�, ��ô���صĽ���� 5��
�����ַ���"abc abc "���������ţ�����ô���صĽ������ 3��
�����ʽ
�����һ�У�Ϊ�ַ��� s�����Ȳ����� 10000����
�����ʽ
��� s �����һ�����ʵĳ��ȡ�*/
import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String word = "";
		while(sc.hasNext()){	//hasNext()������NҪ��д
			word = sc.next;		//while��ֻ��һ�д��룬ʡ��{}����
		}
		System.out.print(word.length());	
		/*java�е�length�������������˵��,����˵��������һ������,
		��֪���������ĳ������õ���length�������.
		
		java�е�length()����������ַ���String˵��,	
		����뿴����ַ����ĳ������õ�length()�������.
		
		java�е�size()��������Է��ͼ���˵��,
		����뿴��������ж��ٸ�Ԫ��,�͵��ô˷������鿴!*/
	}
}

//������ѧ���ṩ����һ�ַ��������Ӹ���һ�㣬Ȩ��ѧϰ
/*
import.java.util.*

public class Main
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in)
		int len = 0;   //ѧ��������͵���֮���һ�У����Ӵ���ɶ���
					
		if (sc.hasNext()) 
		{	
			String line = sc.nextLine();
			String[] words = line.split(" ");
			//split()�ǽ��ַ����ָ����ַ�����ģ���������Կո����ָ�
			if (words.length > 0)
			{
				len = words[words.length - 1].length();
			}
		}
		System.out.print(len);
	}
}
*/