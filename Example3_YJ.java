/*
	FileName : Example3.java
*/
public class Example3{

	///main method
	public static void main(String[] args){

		//입력한 받은 값을 int 변환
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
				
		//더한 값을 저장하기 위한 sum 선언
		int sum=0;
		
		// 입력값이 같을수 있는 경우
		if(i==j){

			System.out.println("두수의 입력값이 같음");

		}else if(i<j){  //입력 받은 값중 큰수를 찾아내자.

			 for(int k=i;k<=j;k++){
				sum=sum+k;
			 }

			System.out.println(i+" ~ "+j+" 까지의 합은 : "+sum);

		}else{
			
		      for(int k=j;k<=i;k++){
					sum +=k;
			  }
			  System.out.println(j+" ~ "+i+" 까지의 합은 : "+sum);
		}

	}//end of main

}//end of class