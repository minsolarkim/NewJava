//package jb02.part01;

/*
	FileName : Example1.java
*/
public class Example1{		
  
  ///main method
  public static void main(String args[])	{				

        //�Է¹��� ���ڸ� ������ int �� ��ȯ
        int inputData = Integer.parseInt(args[0]);

        //==> 100����, 0�̻��� ���� �����ϵ��� �Ѵ�.  
        //==> �Է� data �� ��ȿ�� Ȯ��.
		if(inputData>100 || inputData<0){

			 System.out.println("0~100���̰� �Է� ���.::[usage]:: java Example [100������ ����] ");

		}else{

			//int j = inputData/10; // ==> [ ���� ] 95/10 ������ ������ ������.....
			
			//switch(  j  ){
			switch(  inputData/10  ){

				case 10:
					//System.out.print("�Է��Ͻ� "+inputData+"�� ������ �� �Դϴ�.\n" );
					//break;
				case 9:
					System.out.print("�Է��Ͻ� "+inputData+"�� ������ �� �Դϴ�.\n" );
					break;
				case 8:
					System.out.print("�Է��Ͻ� "+inputData+ "�� ������ �� �Դϴ�.\n");
					break;
				case 7:
					System.out.print("�Է��Ͻ� "+inputData+"�� ������ �� �Դϴ�.\n");
					break;
				case 6:
					System.out.print("�Է��Ͻ� "+inputData+"�� ������ �� �Դϴ�.\n");
					break;
				default:
					System.out.print("�Է��Ͻ� "+inputData+"�� ������ �� �Դϴ�.\n");

			}//end of switch

		}//end of else

	}//end of main

}//end of class