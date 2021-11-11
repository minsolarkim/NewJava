
/*	1. Primitive type 형변환(묵시적/명시적) : data의 크기
	2. Reference type 형변환(묵시적/명시적) : 개념의 크기 (추상화 정도)
		: 중요 중요 : 객체의 형변환 조건 : ~~ is a ~~ Relationship
*/

//상위 class Super의 정의
class Super {
	//Method
	public void a(){
		System.out.println("Super : a()");
	}
}


public class CastingComplete {
	//main method
	public static void main(String[] args) {
		//하나 : 상위 class 인스턴스 생성 (Data Type == 인스턴스의 경우)
		System.out.println("\n 여기는 Super s1 = new Super() 부분");
		Super s1 = new Super();
		s1.a();
		System.out.println("=======================");
	}
}
