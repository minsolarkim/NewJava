//package jb01.test;

public class Test2  
{
	public static void main(String[] args) 
	{
		int i1 = Integer.parseInt(args[0]);
		int i2 = Integer.parseInt(args[1]);

		if (i1 > i2)
		{
			System.out.println("ù��° �μ� : " + i1 + ", �ι�° �μ� : " + i2 
				+ ", " + i1 + "-" + i2 + "=" + (i1-i2));
		} else if (i1 < i2)
		{
			System.out.println("ù��° �μ� : " + i1 + ", �ι�° �μ� : " + i2 
				+ ", " + i1 + "+" + i2 + "=" + i1+i2);
		} else {
			System.out.println("�� ���� �����ϴ�.");
		}

	}
}