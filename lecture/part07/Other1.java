package jb04.part07.outer;

/*
	FileName : Other,java
	
	1. Encapsulation(information hiding)�� �����ϴ� Access Modifier ����
	2. public / protected /       / private �� ��� �� ���� 

	�� Other1�� Father �� �ٸ� package �� ����, ���谡 ����
	�� �ּ��� Ǯ�� 
	      ==> Compile �� error �� Ȯ���ϰ�, error �� �ǹ�����
	      ==> �� Access Modifier �� ���ٹ����� Ȯ���� ��  
*/

public class Other1{
	
	///Field
	//==> jb04.part07.Father�� �����Ұ�. 
	jb04.part07.Father unknown = new jb04.part07.Father();	//==> Father �ν��Ͻ� ����

	///Constructor
	public Other1(){
		System.out.println(this.unknown.name);		//==> public String name = "ȫ�浿";
		//System.out.println(unknown.bank);		    	//==> protected String bank = "�Ѿ�����";
		//System.out.println(unknown.branch);	   		//==> String branch="���ﵿ����";
		//System.out.println(unknown.password); 		//==> private int password = 1234;
		
		//==> Field(��������)�� Method(����)�� �̿� ����
		System.out.println(this.unknown.getBranch());
		System.out.println(unknown.getPassword(0));
	}
}//end of class

/*
	1. private �� ����Ͽ� �ٸ� class �� ���� ���� ���� ����
	2. method �� ����(������ ����) �������� ������ ����
*/