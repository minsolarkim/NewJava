//package jb01.part07.hw01;

/*
	FileName : Test3.java
*/
public class Test3{

  ///main method
  public static void main(String[] args){

        //�Է¹��� ���ڸ� ������ int �� ��ȯ
        int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);

///*    
    // ��� 1> if ���ǽĿ� �ΰ��� ���� and ���Ѱ���  ==> 6�� ��� check �Ҽ� ����.
		if( i%2==0 && i%3 != 0 ){
          System.out.println("�Է��Ͻ� 1��°���� �� "+i+"�� ¦���̸� 3�� ����� �ƴմϴ�.");
		}
//*/

/*
    //��� 2> if ���ο� �ٽ� if ���� �ۼ� �Ͽ� ����.
    if( i%2 == 0){
        if( i%3 == 0){
   			System.out.println("�Է��Ͻ� 1��°���� �� "+i+"�� ¦���̸� 3�� ����Դϴ�.");
          } else{
            System.out.println("�Է��Ͻ� 1��°���� �� "+i+"�� ¦���̸� 3�� ����� �ƴմϴ�.");      
        }
     }
*/

		if(j%2==1 && j%3 == 0){
			System.out.println("�Է��Ͻ� 2��°���� �� "+j+"�� Ȧ���̸� 3�� ����� �Դϴ�..");
		}

	}//end of main

}//end of class