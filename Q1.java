/*1. �ж�һ�����Ƿ��ܱ���һ������������һ��ͦ�򵥵����⣬һ��һ��ģ����Ϳ��Ը㶨�ˣ���������Ȼ��ǲ����Լ����������ҵ������д���룬��Ͱ�����ɡ�
�����ʽ
������������ɿո�ֿ������� M �� N(1��M,N��500)��
�����ʽ
�������һ�У���� M ���Ա� N ���������YES���������NO�������Сд���У���*/

import java.util.*;   //import��֮��ҲҪ��ֺ�

public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		String divide = (M % N = 0)?"YES":"NO";  
		/*����������� ? : ��Ҳ��Ϊ ����Ԫ���������
		�﷨��ʽ���������ʽ �� ���ʽ1 �����ʽ2
        ������̣�����������ʽ��ֵΪ true ��
		�򷵻� ���ʽ1 ��ֵ�����򷵻� ���ʽ2 ��ֵ��*/
		System.out.print(divide);
	}
}
