//package jb01.test;
//????????
public class Test3 
{
	public static void main(String[] args) 
	{
		int i1 = Integer.parseInt(args[0]);
		int i2 = Integer.parseInt(args[1]);

		if (i1 % 2 == 0)
		{
			if(i1 % 3 == 0){
				System.out.println(i1 + "은 짝수이며 3의 배수 입니다.");
			
			} else {
				System.out.println(i1 + "은 짝수이며 3의 배수가 아닙니다.");
			}
		} else {
			if(i1 % 3 == 0){
				System.out.println(i1 + "은 짝수가 아니며 3의 배수 입니다.");
			
			} else {
				System.out.println(i1 + "은 짝수가 아니며 3의 배수가 아닙니다.");
			}
		}

		if (i2 % 2 == 0)
		{
			if(i2 % 3 == 0){
				System.out.println(i2 + "은 짝수이며 3의 배수 입니다.");
			
			} else {
				System.out.println(i2 + "은 짝수이며 3의 배수가 아닙니다.");
			}
		} else {
			if(i2 % 3 == 0){
				System.out.println(i2 + "은 짝수가 아니며 3의 배수 입니다.");
			
			} else {
				System.out.println(i2 + "은 짝수가 아니며 3의 배수가 아닙니다.");
			}
		}
	}
}
