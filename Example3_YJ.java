/*
	FileName : Example3.java
*/
public class Example3{

	///main method
	public static void main(String[] args){

		//�Է��� ���� ���� int ��ȯ
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
				
		//���� ���� �����ϱ� ���� sum ����
		int sum=0;
		
		// �Է°��� ������ �ִ� ���
		if(i==j){

			System.out.println("�μ��� �Է°��� ����");

		}else if(i<j){  //�Է� ���� ���� ū���� ã�Ƴ���.

			 for(int k=i;k<=j;k++){
				sum=sum+k;
			 }

			System.out.println(i+" ~ "+j+" ������ ���� : "+sum);

		}else{
			
		      for(int k=j;k<=i;k++){
					sum +=k;
			  }
			  System.out.println(j+" ~ "+i+" ������ ���� : "+sum);
		}

	}//end of main

}//end of class