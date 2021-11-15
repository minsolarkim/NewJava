//package jb01.part07.hw01;

/*
	FileName : Test3.java
*/
public class Test3{

  ///main method
  public static void main(String[] args){

        //입력받은 인자를 정수형 int 로 변환
        int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);

///*    
    // 방법 1> if 조건식에 두가지 조건 and 비교한경우로  ==> 6의 경우 check 할수 없다.
		if( i%2==0 && i%3 != 0 ){
          System.out.println("입력하신 1번째인자 값 "+i+"는 짝수이며 3의 배수가 아닙니다.");
		}
//*/

/*
    //방법 2> if 내부에 다시 if 문을 작성 하여 본다.
    if( i%2 == 0){
        if( i%3 == 0){
   			System.out.println("입력하신 1번째인자 값 "+i+"는 짝수이며 3의 배수입니다.");
          } else{
            System.out.println("입력하신 1번째인자 값 "+i+"는 짝수이며 3의 배수가 아닙니다.");      
        }
     }
*/

		if(j%2==1 && j%3 == 0){
			System.out.println("입력하신 2번째인자 값 "+j+"는 홀수이며 3의 배수가 입니다..");
		}

	}//end of main

}//end of class