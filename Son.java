//package jb04.part02;

/*
	File Name : Son.java
	�� Iam.class �� �Ϲ�ȭ����
	�� Iam class ��  �Ӽ��� ������ �����ϸ�, �߰���,��ü���� �Ӽ�,������ ���´�.
*/
public class Son extends Iam{

	///Field
	String school;
	
     ///Constructor
     public Son(){
		System.out.println("Son class default Constructor");
	 }

	///Method(setter method)
	public void setSchool(String str){
		school = str;
	}
	
    //getter method
	public String getSchool(){
		return school;
	}

	public static void main(String args[]){
		// 1. �Ʒ��� �ν��Ͻ� ������ ��°���� Ȯ��,����
		// 2. OOP�� �Ϲ�ȭ������ ����(�Ӽ�,����)�� OOPL���� ��� �����ϴ����� ����
		// 3. �Ʒ��� �ּ��� Ǯ�� �Ӽ�, ������ ������ Ȯ���Ѵ�.
		Son son = new Son();
		
		///*		
		son.setName("ȫ�浿�Ƶ�");
		son.setAge(50);
		son.setJob("�������غ���");
		son.setSchool("����Ƽ��������");

		System.out.println("�̸� : "+son.getName());
		System.out.println("���� : "+son.getAge());
		System.out.println("���� : "+son.getJob());
		System.out.println("���� : "+son.getSchool());
		//*/
	}//end of method

}//end of class