
/*	1. 상속(일반화관계)과 생성자와의 관계
	2. 생성자를 명시적으로 호출하는 this(), super() method 이해
	==> 아래의 예제 실행을 통해 super(), this()의 역할 및 의미를 이해
*/

public class Manager2 extends Employee2  {
	
	///Field
	int salary;

	///Constructor
	public Manager2(){
		System.out.println("Manager의 default Constructor");
	}
	public Manager2(String name){
		super(name);
		System.out.println("Manager의 name을 받는 Constructor");
	}
	public Manager2(String name, String part){
		this(name);
		this.part = part;
		System.out.println("Manage의 name, part를 받는 Constructor");
	}
	public Manager2(String name, String part, int age){
		super(name, part);
		this.age = age;
		System.out.println("Manager의 name, part, age를 받는 Constructor");
	}
	public Manager2(String name, String part, int age, int salary){
		this(name, part, age);
		this.salary = salary;
		System.out.println("Manager의 name, part, age, salary를 받는 Constructor");
	}
	
	//Method
	public int salary(){
		System.out.println("Manager의 salary method");
		baseSalary = 200;
		return baseSalary;
	}
	public void callSalary(){
		System.out.println("Employee의 기본급은 : "+super.salary());
		System.out.println("Manager의 기본급은 1: "+this.salary());
		System.out.println("Manager의 기본급은 2: "+salary());
	}

	//Main Method
	public static void main(String args[]){

		//Manager2 m1 = new Manager2("홍길동");

		//Manager m2 = new Manager("홍길동", "EJB");

		//Manager m3 = new Manager("홍길동", "EJB", 25);

		Manager2 m4 = new Manager2("홍길동", "EJB", 25, 300);

		System.out.println("\n");

		System.out.println("overriding된 salary 호출 : " + m4.salary());
		m4.callSalary();

	}//end of main 
	
}//end of class
