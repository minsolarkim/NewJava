
class BusCharge {

	//Field
	String section;

	//Constructor
	public BusCharge(){
	}
	public BusCharge(String str){
		section = str;
	}

	//method
	public void information(){
		System.out.println("������ݾȳ�");
	}
	public void charge(){
		System.out.println("�л�:300, �Ϲ���:500, ���:��¥");
	}

} //end of class

class Student extends BusCharge {

	public Student(){
		super("�л�");
	}
	public void charge(){
		System.out.println(" :: 300����\n");
	}

}

class Adult extends BusCharge {

	public Adult(){
		super("�Ϲ���");
	}
	public void charge(){
		System.out.println(" :: 500����\n");
	}

}//end of class

class Old extends BusCharge {

	public Old(){
		super("���");
	}
	public void charge(){
		System.out.println(" :: ��¥\n");
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
	}//end of main
}//end of class
