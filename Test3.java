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
			System.out.println("입력하신 1번째 인자값 " + i1 + "은 짝수이며 3의 배수가 아닙니다.");
		} else if (i1%2 != 0)
		{
			System.out.println("입력하신 1번째 인자값 " + i1 + "은 짝수이며 3의 배수가 아닙니다.");
		}

		
		if (i1%6 == 0) 
		{
			System.out.println("입력하신 1번째 인자값 " + i1 + "은 짝수이며 3의 배수입니다.");
		} else if (i2%2 == 1 && i2%3 == 0)
		{
			System.out.println("입력하신 2번째 인자값 " + i2 + "은 홀수이며 3의 배수입니다.");
		} 
	}
}
