/*2. 쳲�����������һ�ַǳ�����˼�����У��� 00 �� 11 ��ʼ��֮���쳲�����ϵ������֮ǰ��������ӡ�����ѧ��ʽ����쳲�������������Կ���������ʽ��
F_0=0
F_1=1
F_n=F_{n-1}+F_{n-2}
����Լ�� F_n��ʾ쳲��������еĵ� n �����֪��쳲����������е��κ�һ����
�����ʽ
�������һ�У�����һ������ N(0��N��50)��
�����ʽ
�������һ�У�����һ��������Ϊ쳲��������еĵ� N ���ֵ��*/
//�ݹ�д����ʱ�临�Ӷ�ΪO(1.618^n),�ռ临�Ӷ�ΪO(n)
import java.util.*;

public class Main
{
	public static void main(String[] args){		//������args������arg
		Scanner sc = new Scanner(System.in);	//���ﴴ��Scanner����ʱ������Ҫд��System.in������
		int n = sc.nextInt();	//����nextInt()����������û�в���
		int m = feibo(n);
		System.out.print(m);
	}
	public static int feibo(int a){  //����feibo������static�ؼ��ָ��ã����ǹ��߷�����
		/*���£�ѧ��������ʽ������д����ѧϰһ��ѧ���Ĵ�����
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

/*����Ϊ�ڶ��ַ������ǵݹ鷽�������Ʒ�������
ʱ�临�Ӷ�ΪO��n)���ռ临�Ӷ�ΪO(n)��

import java.util.*;

public class Main
{	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] Feibo =new int[51];   //java���鶨���ʽ
		Feibo[0] = 0;
		Feibo[1] = 1;
		for(int i = 2;i<=n;i++){
			Feibo[i] = Feibo[i-1]+Feibo[i-2];
		}
		System.out.print(Feibo[n]);
	}
} 
*/