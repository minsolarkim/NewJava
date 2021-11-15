
/*	1. ���(�Ϲ�ȭ����)�� �����ڿ��� ����
	2. �����ڸ� ��������� ȣ���ϴ� this(), super() method ����
	==> �Ʒ��� ���� ������ ���� super(), this()�� ���� �� �ǹ̸� ����
*/

public class Employee2 {

	//Field
	String part;
	String name;
	int age;
	int baseSalary;

	//Constructor
	public Employee2(){
		System.out.println("Emp�� default Constructor");
	}
	public Employee2(String name){
		this.name = name;
		System.out.println("Emp�� name�� �޴� Constructor");
	}
	public Employee2(String name, String part){
		this(name);
		this.part = part;
		System.out.println("Emp�� name, part�� �޴� Constructor");
	}
	public Employee2(String name, String part, int age){
		this(name, part);
		this.age = age;
		System.out.println("Emp�� name, part, age�� �޴� Constructor");
	}

	//Method
	public int salary(){
		System.out.println("Emp�� salary() method");
		baseSalary = 100;
		return baseSalary;
	}

	
}//end of class
