
/*	1.BusCharge.class의 charge() Method 사용유무는..?
	2.하위 클래스(Student, Adult, Old)에서 charge() Method가 OverRiding 않는다면?
	////////////////////////////////////////////////////////////////
	==> abstract Method / abstract class의 필요성 및 이해
	- abstract Method
	 : 구체적일 필요가 없는 Method
	 : 하위클래스에서 구체적으로 재정의(OverRiding) 해야하는 강제성을 갖는 Method
	- abstract class
	 : 구체적이지 않은 abstract Method가 정의된 클래스
	 : 일반화의 관계 중 공통적, 일반적 행위와 속성 공유를 목적으로 정의된 클래스
	 ==>> abstract class는 instance 생성할 수 없다 :: 중요, 중요 <<==
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
		System.out.println("버스요금안내");
	}
	
	//==> 사용되지 않으며, 하위클래스에 OverRiding을 강제하는 추상메서드 정의
	/*
	public void charge(){
		System.out.println("학생:300, 일반인:500, 어르신:공짜");
	}
	*/
	public abstract void charge();

} //end of class

//abstract.class 상속시 abstract.method 필히 재정의(OverRiding)해야함 <==강제성
class Student extends BusCharge {

	public Student(){
		super("학생");
	}
	//==> 아래의 Method 주석처리하고 컴파일시.. 컴파일 에러를 확인하자.
	public void charge(){
		System.out.println("300만원");
	}

}

//abstract class 상속시 abstract method 필히 재정의(OverRiding) 해야함 <==강제성
class Adult extends BusCharge {

	public Adult(){
		super("일반인");
	}
	public void charge(){
		System.out.println("500만원");
	}

}//end of class

//abstract class 상속시 abstract method 필히 재정의(OverRiding) 해야함 <==강제성
class Old extends BusCharge {

	public Old(){
		super("어르신");
	}
	public void charge(){
		System.out.println("공짜");
	}

}//end of class


public class Display3 {

	//main method
	public static void main(String[] args) {

		//상위레퍼런스로 하위 인스턴스를 참조가등(묵시적 형변환/ ~ is a ~ Relation)
		//abstract class 는 객체 생성불가 그러나 type 선언은??

		BusCharge bc1 = new Student();	//Student b1 = new Student();
		BusCharge bc2 = new Adult();	//Adult b2 = new Adult();
		BusCharge bc3 = new Old();		//Old b3 = new Old();
		//==> Polymorphism : 하나의 인터페이스 접근 및 다양한 활동

		bc1.information();		
		System.out.println(bc1.section);
		bc1.charge();	//어떤 클래스의 Method 호출되었는지 확인
		
		bc2.information();
		System.out.println(bc2.section);
		bc2.charge();

		bc3.information();
		System.out.println(bc3.section);
		bc3.charge(); 

	}//end of main
}//end of class
