
/*	1. ���(�Ϲ�ȭ����)�� �����ڿ��� ����
	2. �����ڸ� ���������� ȣ���ϴ� this(), super() method ����
	==> �Ʒ��� ���� ������ ���� super(), this()�� ���� �� �ǹ̸� ����
*/

public class Manager2 extends Employee  {
	
	///Field
	int salary;

	///Constructor
	public Manager(){
		System.out.println("Manager�� default Constructor");
	}
	public Manager(String name){
		super(name);
		System.out.println("Manager�� name�� �޴� Constructor");
	}
	public Manager(String name, String part){
		this(name, part);
		this.part = part;
		System.out.println("Manage�� name, part�� �޴� Constructor");
	}
	public Manager(String name, String part, int age){
		super(name, part);
		this.age = age;
		System.out.println("Manager�� name, part, age�� �޴� Constructor");
	}
	public Manager(String name, String part, int age, int salary){
		this(name, part, age);
		this.salary = salary;
		System.out.println("Manager�� name, part, age, salary�� �޴� Constructor");
	}
	
	//Method
	public int salary(){
		Systm.out.println("Manager�� salary method");
		baseSalary = 200;
		return baseSalary;
	}
	public void callSalary(){
		System.out.println("Employee�� �⺻���� : "+super.salary());
		System.out.println("Manager�� �⺻���� 1: "+this.salary());
		System.out.println("Manager�� �⺻���� 2: "+salary());
	}

	//Main Method
	public static void main(String args[]){

		Manager m1 = new Manager("ȫ�浿");

		//Manager m2 = new Manager("ȫ�浿", "EJB");

		//Manager m3 = new Manager("ȫ�浿", "EJB", 25);

		//Manager m4 = new Manager("ȫ�浿", "EJB", 25, 300);

		//System.out.println("\n");

		//System.out.println("overriding�� salary ȣ�� : "+m4.salary());
		//m4.callSalary();

	}//end of main 
	
}//end of class