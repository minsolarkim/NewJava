//package jb03.part01;

/*
	FileName : Example5.java
	//==>String[][] text= new String[9][9]�� 2�� �迭���������� �Է�, ����ϱ�
*/
public class Example5{

  ///main method
	public static void main( String args[]){
	
		//���ڿ� 81���� ������ �ִ� String array ����
		String text[][] = new String[9][9];

		//��ø for�� / + ������ ���
		for( int i=0 ; i<9; i++){
		//for( int i=1 ; i<10; i++){

			for(int j=0; j<9; j++){

				//System.out.println(  (i+1)+" * "+(j+1)+ " ="+ (i+1)*(j+1)   )

				//text[i-1][j] = (i)+" * "+(j+1)+ " ="+ (i)*(j+1) ;

				text[i][j] = (i+1)+" * "+(j+1)+ " ="+ (i+1)*(j+1) ;

				System.out.println("text["+i+"]["+j+"] : "+text[i][j]);
			}//end of inner 

		}//end of outer


		//��ø for�� / + ������ ��� / length�� ���
		for( int i=0 ; i<text.length; i++){

			for(int j=0; j<text[i].length; j++){

				text[i][j] = (i+1)+" * "+(j+1)+ " ="+ (i+1)*(j+1) ;
				System.out.println("text["+i+"]["+j+"] : "+text[i][j]);
			}//end of inner 

		}//end of outer

	}//end of main

}//end of class