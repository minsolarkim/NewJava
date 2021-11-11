
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

//abstract class ��ӽ� abstract method ���� ������(OverRiding) �ؾ��� <==������
class Old extends BusCharge {

	public Old(){
		super("���");
	}
	public void charge(){
		System.out.println("��¥");
	}

}//end of class


public class Display4 {

	//main method
	public static void main(String[] args) {

		//�������۷����� ���� �ν��Ͻ��� ��������(������ ����ȯ/ ~ is a ~ Relation)
		//abstract class �� ��ü �����Ұ� �׷��� type ������??

		BusCharge bc1 = new Student();	//Student b1 = new Student();
		BusCharge bc2 = new Adult();	//Adult b2 = new Adult();
		BusCharge bc3 = new Old();		//Old b3 = new Old();
		//==> Polymorphism : �ϳ��� �������̽� ���� �� �پ��� Ȱ��

		bc1.information();		
		System.out.println(bc1.section);
		bc1.charge();	//� Ŭ������ Method ȣ��Ǿ����� Ȯ��
		
		bc2.information();
		System.out.println(bc2.section);
		bc2.charge();

		bc3.information();
		System.out.println(bc3.section);
		bc3.charge(); 

		System.out.println("=================================");
		//==> ���� �ڵ��� �Ʒ��� �ڵ��� ���ϸ�...
		//==> 1. �ݺ��� �κ��� ���°�
		//==> 2. ���� Data Type ���� (�迭:Array)�� �̿��Ͽ� �ϰ������� ������ �� ���°�.
		BusCharge[] bc = new BusCharge[3];
		bc[0] = new Student();
		bc[1] = new Adult();
		bc[2] = new Old();

		for (int i = 0; i<bc.length; i++){
			bc[i].information();
			System.out.println(bc[i].section);
			bc[i].charge();
		}

	}//end of main
}//end of class