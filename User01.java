
/*
	Constructor 의미 이해
	1. 인스턴스 생성시 new A()의 의미의 이해
	2. new와 같이 사용되는 특수한 행위를 하는 method 이해
	3. Constructor 주 작업, 용도는?
*/

public class User01 {
	//Field 
	String name = "홍길동";
	int javaLevel = 0;

	//default Constructor
	//==> 1. ClassName == MethodName
	//==> 2. return Type 없다
	public User01(){
		System.out.println("Constructor Method");
	}

	//Method
	//getter Method definition
	public String getName(){
		return name;
	}
	public int getJavaLevel(){
		return javaLevel;
	}

	//Main Method
	public static void main(String[] args){

		System.out.println("============");
		User01 user = new User01();
		System.out.println("============");

		//==> 출력결과를 확인하고 아래의 주석을 풀어 다시 확인하면
		/*
			System.out.println("=============");
			User01 user;
			System.out.println("=============");
			user = new User01();
			System.out.println("=============");
			new User01();
			System.out.println("=============");
		*/

		System.out.println("name : "+user.getName());
		System.out.println("javaLevel : "+user.getJavaLevel());

	}//end of main

}//end of class
