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
				System.out.println(i1 + "�� ¦���̸� 3�� ��� �Դϴ�.");
			
			} else {
				System.out.println(i1 + "�� ¦���̸� 3�� ����� �ƴմϴ�.");
			}
		} else {
			if(i1 % 3 == 0){
				System.out.println(i1 + "�� ¦���� �ƴϸ� 3�� ��� �Դϴ�.");
			
			} else {
				System.out.println(i1 + "�� ¦���� �ƴϸ� 3�� ����� �ƴմϴ�.");
			}
		}

		if (i2 % 2 == 0)
		{
			if(i2 % 3 == 0){
				System.out.println(i2 + "�� ¦���̸� 3�� ��� �Դϴ�.");
			
			} else {
				System.out.println(i2 + "�� ¦���̸� 3�� ����� �ƴմϴ�.");
			}
		} else {
			if(i2 % 3 == 0){
				System.out.println(i2 + "�� ¦���� �ƴϸ� 3�� ��� �Դϴ�.");
			
			} else {
				System.out.println(i2 + "�� ¦���� �ƴϸ� 3�� ����� �ƴմϴ�.");
			}
		}
	}
}