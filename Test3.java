package jb01.test;
//????????
public class Test3 
{
	public static void main(String[] args) 
	{
		int i1 = args[0];
		int i2 = args[1];

		if (i1%2 == 0) 
		{
			System.out.println("�Է��Ͻ� 1��° ���ڰ� " + i1 + "�� ¦���̸� 3�� ����� �ƴմϴ�.");
		} else if (i1%2 != 0)
		{
			System.out.println("�Է��Ͻ� 1��° ���ڰ� " + i1 + "�� ¦���̸� 3�� ����� �ƴմϴ�.");
		}

		
		if (i1%6 == 0) 
		{
			System.out.println("�Է��Ͻ� 1��° ���ڰ� " + i1 + "�� ¦���̸� 3�� ����Դϴ�.");
		} else if (i2%2 == 1 && i2%3 == 0)
		{
			System.out.println("�Է��Ͻ� 2��° ���ڰ� " + i2 + "�� Ȧ���̸� 3�� ����Դϴ�.");
		} 
	}
}
