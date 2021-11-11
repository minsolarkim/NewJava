//package jb01.test;
//????????
public class Test3 
{
	public static void main(String[] args) 
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);

		
		if (num1 % 2 == 0)
		{
			System.out.print("입력하신 1번째 인자값 "+ num1 +"은 짝수이며 ");
			if(num1 % 3 == 0) {
				System.out.println("3의 배수입니다.");
			} else {
				System.out.println("3의 배수가 아닙니다.");
			}
			
		} else {
			System.out.print("입력하신 1번째 인자값 "+ num1 +"은 홀수이며 ");
			if( num1  % 3 == 0) {
				System.out.println("3의 배수입니다.");
			} else {
				System.out.println("3의 배수가 아닙니다.");
			}
		}
		
		if (num2 % 2 == 0)
		{
			System.out.print("입력하신 2번째 인자값 "+ num2 +"은 짝수이며 ");
			if(num2 % 3 == 0) {
				System.out.println("3의 배수입니다.");
			} else {
				System.out.println("3의 배수가 아닙니다.");
			}
			
		} else {
			System.out.print("입력하신 2번째 인자값 "+ num2 +"은 홀수이며 ");
			if( num2  % 3 == 0) {
				System.out.println("3의 배수입니다.");
			} else {
				System.out.println("3의 배수가 아닙니다.");
			}
		}

	}
}
