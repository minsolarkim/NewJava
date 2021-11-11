//package jb01.part07;

public class IfElseETC
{
	public static void main(String[] args) 
	{
		System.out.println("입력하신 \"1번째 인수\"는 : " + args[0]);
		System.out.println("입력하신 \"2번째 인수\"는 : " + args[1]);

		System.out.println("================================");

		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);

		System.out.println("i="+"\t j="+j);
		System.out.println("한 줄 처리\n");
		System.out.println("================================");

		if (i > j) {
			System.out.println("i가 j보다 큽니다");
		} else if (i == j) {
			System.out.println("i와 j는 같습니다");
		} else if (i < j) {
			System.out.println("i보다 j가 큽니다");
		}
	
	}
}
