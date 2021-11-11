/*
	FileName : Example2.java
*/
public class Example2{
	
	///main method
	public static void main(String[] args)	{
	
		//입력한 받은 값을 수로 변환
		int i = Integer.parseInt(args[0]);
		
		//입력 값의 유효성 check(1~9의 숫자일것)	
		if( 0< i && i<10){

			  System.out.println(i +"단을 출력합니다.");
			  
			  int j=1;

		      while(j<10){
				 System.out.println(j+"*"+i+" = "+i*j);
				    j++;
		      }

		}else{

			  System.out.println("[usage]::java Example2 [1 ~9의 정수]");
	   
		}


		if(  ! (  0< i && i<10  ) ){

			  System.out.println("[usage]::java Example2 [1 ~9의 정수]");

		}else{
		
			 System.out.println(i +"단을 출력합니다.");
			  
			  int j=1;

		      while(j<10){
				 System.out.println(j+"*"+i+" = "+i*j);
				    j++;
		      }

	   
		}
		
	}//end of main

}//end of class