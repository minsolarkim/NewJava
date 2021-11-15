//package jb03.part01;

/*
	FileName : Example5.java
	//==>String[][] text= new String[9][9]의 2차 배열에구구단을 입력, 출력하기
*/
public class Example5{

  ///main method
	public static void main( String args[]){
	
		//문자열 81개를 담을수 있는 String array 선언
		String text[][] = new String[9][9];

		//중첩 for문 / + 연산자 사용
		for( int i=0 ; i<9; i++){
		//for( int i=1 ; i<10; i++){

			for(int j=0; j<9; j++){

				//System.out.println(  (i+1)+" * "+(j+1)+ " ="+ (i+1)*(j+1)   )

				//text[i-1][j] = (i)+" * "+(j+1)+ " ="+ (i)*(j+1) ;

				text[i][j] = (i+1)+" * "+(j+1)+ " ="+ (i+1)*(j+1) ;

				System.out.println("text["+i+"]["+j+"] : "+text[i][j]);
			}//end of inner 

		}//end of outer


		//중첩 for문 / + 연산자 사용 / length의 사용
		for( int i=0 ; i<text.length; i++){

			for(int j=0; j<text[i].length; j++){

				text[i][j] = (i+1)+" * "+(j+1)+ " ="+ (i+1)*(j+1) ;
				System.out.println("text["+i+"]["+j+"] : "+text[i][j]);
			}//end of inner 

		}//end of outer

	}//end of main

}//end of class