//package jb01.test;

public class Example1 
{
	public static void main(String[] args) 
	{
		int num = Integer.parseInt(args[0]);
		
		if(num >= 90) {
			System.out.println("입력하신 값 " + num + "점은 수입니다.");
		} else if(num >= 80) {
			System.out.println("입력하신 값 " + num + "점은 우입니다.");
		} else if(num >= 70) {
			System.out.println("입력하신 값 " + num + "점은 미입니다.");
		} else if(num >= 60) {
			System.out.println("입력하신 값 " + num + "점은 양입니다.");
		} else {
			System.out.println("입력하신 값 " + num + "점은 가입니다.");
		}

	}
}
