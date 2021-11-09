
/*	1.BusCharge.class�� charge() Method ���������..?
	2.���� Ŭ����(Student, Adult, Old)���� charge() Method�� OverRiding �ʴ´ٸ�?
	////////////////////////////////////////////////////////////////
	==> abstract Method / abstract class�� �ʿ伺 �� ����
	- abstract Method
	 : ��ü���� �ʿ䰡 ���� Method
	 : ����Ŭ�������� ��ü������ ������(OverRiding) �ؾ��ϴ� �������� ���� Method
	- abstract class
	 : ��ü������ ���� abstract Method�� ���ǵ� Ŭ����
	 : �Ϲ�ȭ�� ���� �� ������, �Ϲ��� ������ �Ӽ� ������ �������� ���ǵ� Ŭ����
	 ==>> abstract class�� instance ������ �� ���� :: �߿�, �߿� <<==
	////////////////////////////////////////////////////////////////
*/

abstract class BusCharge {

	//Field
	String section;

	//Constructor
	public BusCharge(){
	}
	public BusCharge(String section){
		this.section = section;
	}

	//method
	public void information(){
		System.out.println("������ݾȳ�");
	}
	
	//==> ������ ������, ����Ŭ������ OverRiding�� �����ϴ� �߻�޼��� ����
	/*
	public void charge(){
		System.out.println("�л�:300, �Ϲ���:500, ���:��¥");
	}
	*/
	public abstract void charge();

} //end of class

//abstract.class ��ӽ� abstract.method ���� ������(OverRiding)�ؾ��� <==������
class Student extends BusCharge {

	public Student(){
		super("�л�");
	}
	//==> �Ʒ��� Method �ּ�ó���ϰ� �����Ͻ�.. ������ ������ Ȯ������.
	public void charge(){
		System.out.println("300����");
	}

}

//abstract class ��ӽ� abstract method ���� ������(OverRiding) �ؾ��� <==������
class Adult extends BusCharge {

	public Adult(){
		super("�Ϲ���");
	}
	public void charge(){
		System.out.println("500����");
	}

}//end of class

class Old extends BusCharge {

	public Old(){
		super("���");
	}
	public void charge(){
		System.out.println("��¥");
	}

}//end of class


public class Display {

	//main method
	public static void main(String[] args) {

		Student b1 = new Student();
		Adult b2 = new Adult();
		Old b3 = new Old();

		b1.information();		
		System.out.println(b1.section);
		b1.charge();	//� Ŭ������ Method ȣ��Ǿ����� Ȯ��
		
		b2.information();
		System.out.println(b2.section);
		b2.charge();

		b3.information();
		System.out.println(b3.section);
		b3.charge(); 

		//==> �Ʒ��� �ּ��� ���ʷ� Ǯ�� ������ ������ Ȯ������.
		//==> 1. abstract class�� ��ü ���� �Ұ�
		//BusCharge bc01 = new BusCharge();

		//==> 2. ��ü������ �Ұ��ϳ�, ������ ���� (Data Type)�� �����ϴ�.
		//busCharge bc02;

	}//end of main
}//end of class