/*
	FileName : Example2.java
*/
public class Example2{
	
	///main method
	public static void main(String[] args)	{
	
		//�Է��� ���� ���� ���� ��ȯ
		int i = Integer.parseInt(args[0]);
		
		//�Է� ���� ��ȿ�� check(1~9�� �����ϰ�)	
		if( 0< i && i<10){

			  System.out.println(i +"���� ����մϴ�.");
			  
			  int j=1;

		      while(j<10){
				 System.out.println(j+"*"+i+" = "+i*j);
				    j++;
		      }

		}else{

			  System.out.println("[usage]::java Example2 [1 ~9�� ����]");
	   
		}


		if(  ! (  0< i && i<10  ) ){

			  System.out.println("[usage]::java Example2 [1 ~9�� ����]");

		}else{
		
			 System.out.println(i +"���� ����մϴ�.");
			  
			  int j=1;

		      while(j<10){
				 System.out.println(j+"*"+i+" = "+i*j);
				    j++;
		      }

	   
		}
		
	}//end of main

}//end of class