
/*
	상위의 Method, Field 호출할 수 있는 예약어(keyword) super
	하위의 Method, Field 호출할 수 있는 예약어(keyword) this
*/

class JuniorHighSchool {
	//Field
	String name = "대한민국중학교";

	//Constructor
	public JuniorHighSchool(){
	}

	//Method
	public void schoolName(){
		System.out.println("중학교 이름 : "+name);
	}

}//end of class

class HighSchool extends JuniorHighSchool {
	//Field 
	String name = "대한민국고등학교";

	//Constructor
	public HighSchool(){
	}

	//Constructor O/R
	public HighSchool(String str){
		name = str;
	}
	//==> 위의 생성자와 아래의 생성자를 readability 측면에서 살펴보면...
	//public HighSchool(String name){
	//	this.name = name;
	//}

	//Method
	public void schoolName(){
		System.out.println("중학교 이름 : "+super.name);
		System.out.println("고등학교 이름 : "+this.name);
		System.out.println("고등학교 이름 : "+name);
	}
}//end of class

public class SuperThisTest {

	public static void main(String[] args) {

		HighSchool hs01 = new HighSchool();
		hs01.schoolName();
		System.out.println("==================");

		HighSchool hs02 = new HighSchool("서울고등학교");
		hs02.schoolName();

	}//end of main

}//end of class
