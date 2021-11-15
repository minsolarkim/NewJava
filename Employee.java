
/*	1. ���(�Ϲ�ȭ����)�� �����ڿ��� ����
	2. �����ڸ� ��������� ȣ���ϴ� this(), super() method ����
	==> �Ʒ��� ���� ������ ���� super(), this()�� ���� �� �ǹ̸� ����
*/

public class Employee {

	//Field
	String part, name;
	int age, baseSalary;

	//Constructor
	public Employee(){
		System.out.println("Emp�� default Constructor");
	}
	public Employee(String str){
		name = str;
		System.out.println("Emp�� name�� �޴� Constructor");
	}
	public Employee(String str1, String str2){
		this(str1);
		part = str2;
		System.out.println("Emp�� name, part�� �޴� Constructor");
	}
	public Employee(String str1, String str2, int i){
		this(str1, str2);
		age = i;
		System.out.println("Emp�� name, part, age�� �޴� Constructor");
	}

	//Method
	public int salary(){
		System.out.println("Emp�� salary() method");
		baseSalary = 100;
		return baseSalary;
	}

	
}//end of class
