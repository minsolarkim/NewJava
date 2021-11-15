//package jb01.part07.hw01;

/*
	FileName : Test2.java
*/
public class Test2{

    ///main method
	public static void main(String[] args){

        //입력받은 인자를 정수형 int 로 변환
        int input01 = Integer.parseInt(args[0]);
		int input02 = Integer.parseInt(args[1]);

		//int sum = input01 +input02;

		//System.out.println(sum);

		//System.out.println( input01 +input02 );


		//System.out.println(  Integer.parseInt(args[0]) +Integer.parseInt(args[1]) );

 











		//두수를 비교 (if - else 사용)하여 대소에 따라 다른 출력값 출력
		if(  input01  >  input02  ){
		//if(   Integer.parseInt(args[0])  >  Integer.parseInt(args[1])  ){
			
			
			//System.out.println("첫번째 값 : "+input01+"\t두번째 값 : "+input02+"\t"	+ 
			//									input01+"-"+input02+"="+(input01-input02));

			int result = input01-input02;
			System.out.println("첫번째 값 : "+input01+"\t두번째 값 : "+input02+"\t"	+ 
												input01+"-"+input02+"="+result);


		}else if(input01==input02){
          System.out.println("첫번째 값 : "+input01+"\t두번째 값 : "+input02+
        		  									" ==> 수수는 같습니다.");
        }else{
			System.out.println("첫번째 값 : "+input01+"\t두번째 값 : "+input02+"\t"+
													input01+"+"+input02+"="+(input01+input02));
		}

	}//end of main

}//end of class