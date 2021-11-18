package jp01.part02;

/*
	FileName : CallByReferenceTest.java
		1. Reference type variable :  Method  ���� ==> Call By Reference
		2. �������� �����ϰ�,  �ڵ��Ͽ� ������� Ȯ�� : Call By Reference ���� 
*/
public class  CallByReferenceTest{

    ///Field
	int number = 100;
	
	///Method
	public void referenceChange(CallByReferenceTest value){
		System.out.println("=====================");
		value.number = 100 + value.number;
		System.out.println("value.number :  "+value.number);
		System.out.println("=====================");
	}

	///Main Method
	public static void main(String[] args){
		
		CallByReferenceTest call = new CallByReferenceTest();

		//method �� ���� ������ call (Reference DataType)
		call.referenceChange(call);
		System.out.println("call.number : "+call.number);
	}//end of main

}//end of class