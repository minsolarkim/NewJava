//package jb01.part07.hw01;

/*
	FileName : Test2.java
*/
public class Test2{

    ///main method
	public static void main(String[] args){

        //�Է¹��� ���ڸ� ������ int �� ��ȯ
        int input01 = Integer.parseInt(args[0]);
		int input02 = Integer.parseInt(args[1]);

		//int sum = input01 +input02;

		//System.out.println(sum);

		//System.out.println( input01 +input02 );


		//System.out.println(  Integer.parseInt(args[0]) +Integer.parseInt(args[1]) );

 











		//�μ��� �� (if - else ���)�Ͽ� ��ҿ� ���� �ٸ� ��°� ���
		if(  input01  >  input02  ){
		//if(   Integer.parseInt(args[0])  >  Integer.parseInt(args[1])  ){
			
			
			//System.out.println("ù��° �� : "+input01+"\t�ι�° �� : "+input02+"\t"	+ 
			//									input01+"-"+input02+"="+(input01-input02));

			int result = input01-input02;
			System.out.println("ù��° �� : "+input01+"\t�ι�° �� : "+input02+"\t"	+ 
												input01+"-"+input02+"="+result);


		}else if(input01==input02){
          System.out.println("ù��° �� : "+input01+"\t�ι�° �� : "+input02+
        		  									" ==> ������ �����ϴ�.");
        }else{
			System.out.println("ù��° �� : "+input01+"\t�ι�° �� : "+input02+"\t"+
													input01+"+"+input02+"="+(input01+input02));
		}

	}//end of main

}//end of class