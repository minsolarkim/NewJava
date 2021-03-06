
/*	1. 상속(일반화관계)과 생성자와의 관계
	2. 생성자를 명시적으로 호출하는 this(), super() method 이해
	==> 아래의 예제 실행을 통해 super(), this()의 역할 및 의미를 이해
*/

public class Employee2 {

	//Field
	String part;
	String name;
	int age;
	int baseSalary;

	//Constructor
	public Employee2(){
		System.out.println("Emp의 default Constructor");
	}
	public Employee2(String name){
		this.name = name;
		System.out.println("Emp의 name을 받는 Constructor");
	}
	public Employee2(String name, String part){
		this(name);
		this.part = part;
		System.out.println("Emp의 name, part를 받는 Constructor");
	}
	public Employee2(String name, String part, int age){
		this(name, part);
		this.age = age;
		System.out.println("Emp의 name, part, age를 받는 Constructor");
	}

	//Method
	public int salary(){
		System.out.println("Emp의 salary() method");
		baseSalary = 100;
		return baseSalary;
	}

	
}//end of class
