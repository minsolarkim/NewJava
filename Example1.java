//package jb01.test;

public class Example1 
{
	public static void main(String[] args) 
	{
		int num = Integer.parseInt(args[0]);
		
		if (num > 100 || num <0)
		{
			System.out.println("잘못 입력하셨습니다. 0~100 사이의 값을 입력해주세요");
		} else {
			/* if문
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
			*/

			// switch문
			switch( num/10 ){
				
				case 10: 
				case 9:
					System.out.println("입력하신 값 : "+ num + "점은 수입니다.");
					break;
				case 8:
					System.out.println("입력하신 값 : "+ num + "점은 우입니다.");
					break;
				case 7:
					System.out.println("입력하신 값 : "+ num + "점은 미입니다.");
					break;
				case 6:
					System.out.println("입력하신 값 : "+ num + "점은 양입니다.");
					break;
				default:
					System.out.println("입력하신 값 : "+ num + "점은 가입니다.");
					break;

			}//end of switch
			
		}//end of if
	}//end of main
}//end of class
