//package jb01.test;

public class Example1 
{
	public static void main(String[] args) 
	{
		int num = Integer.parseInt(args[0]);
		
		if (num > 100 || num <0)
		{
			System.out.println("�߸� �Է��ϼ̽��ϴ�. 0~100 ������ ���� �Է����ּ���");
		} else {
			/* if��
			if(num >= 90) {
				System.out.println("�Է��Ͻ� �� " + num + "���� ���Դϴ�.");
			} else if(num >= 80) {
				System.out.println("�Է��Ͻ� �� " + num + "���� ���Դϴ�.");
			} else if(num >= 70) {
				System.out.println("�Է��Ͻ� �� " + num + "���� ���Դϴ�.");
			} else if(num >= 60) {
				System.out.println("�Է��Ͻ� �� " + num + "���� ���Դϴ�.");
			} else {
				System.out.println("�Է��Ͻ� �� " + num + "���� ���Դϴ�.");
			}
			*/

			// switch��
			switch( num/10 ){
				
				case 10: 
				case 9:
					System.out.println("�Է��Ͻ� �� : "+ num + "���� ���Դϴ�.");
					break;
				case 8:
					System.out.println("�Է��Ͻ� �� : "+ num + "���� ���Դϴ�.");
					break;
				case 7:
					System.out.println("�Է��Ͻ� �� : "+ num + "���� ���Դϴ�.");
					break;
				case 6:
					System.out.println("�Է��Ͻ� �� : "+ num + "���� ���Դϴ�.");
					break;
				default:
					System.out.println("�Է��Ͻ� �� : "+ num + "���� ���Դϴ�.");
					break;

			}//end of switch
			
		}//end of if
	}//end of main
}//end of class