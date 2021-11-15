//package jb02.part01;

/*
	FileName : Example1.java
*/
public class Example1{		
  
  ///main method
  public static void main(String args[])	{				

        //입력받은 인자를 정수형 int 로 변환
        int inputData = Integer.parseInt(args[0]);

        //==> 100이하, 0이상일 때만 실행하도록 한다.  
        //==> 입력 data 가 유효성 확인.
		if(inputData>100 || inputData<0){

			 System.out.println("0~100사이값 입력 요망.::[usage]:: java Example [100이하의 점수] ");

		}else{

			//int j = inputData/10; // ==> [ 응용 ] 95/10 정수와 정수의 연산은.....
			
			//switch(  j  ){
			switch(  inputData/10  ){

				case 10:
					//System.out.print("입력하신 "+inputData+"의 성적은 수 입니다.\n" );
					//break;
				case 9:
					System.out.print("입력하신 "+inputData+"의 성적은 수 입니다.\n" );
					break;
				case 8:
					System.out.print("입력하신 "+inputData+ "의 성적은 우 입니다.\n");
					break;
				case 7:
					System.out.print("입력하신 "+inputData+"의 성적은 미 입니다.\n");
					break;
				case 6:
					System.out.print("입력하신 "+inputData+"의 성적은 양 입니다.\n");
					break;
				default:
					System.out.print("입력하신 "+inputData+"의 성적은 가 입니다.\n");

			}//end of switch

		}//end of else

	}//end of main

}//end of class