/*
	FileName : Example4.java
	// for 문을 이용하여 1단 ~ 9단을 출력하는 프로그램
*/
public class Example4{
  
  ///main method
  public static void main(String args[]){
		
		for(int i=1; i<10; i++){

			System.out.println("\n \t\t"+i+"단을 출력합니다.");

			for (int j = 1; j<10; j++){

				System.out.println( "\t\t"+i+" * "+j+" = "+i*j);

			}//end of innerFor

		}// end of outerFor

	}//end of main

}//end of class