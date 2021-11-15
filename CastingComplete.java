
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

		//둘 : 하위 class 인스턴스 생성 (Data type == 인스턴스의 경우)
		System.out.println("\n 여기는 Sub s2 = new Sub() 부분");
		Sub s2 = new Sub();
		s2.a();
		s2.b();

		//셋 : 상위 data type으로 하위 인스턴스 생성 (Data type != 인스턴스)
		System.out.println("\n 여기는 Super s3 = new Sub() 부분");
		Super s3 = new Sub();
		s3.a();
		//아래의 사항은 error가 발생한다. s3는 b()를 참조할 수 없다 (꼭 이해)
		//s3.b();

		//s3.a()를 사용하려면 ==> casting 연산자 사용 (즉 자신의 원상태복귀(?))
		System.out.println("\n s3은 b()에 접근 불가하다.");
		System.out.println("casting 연산자를 이용 Sub sub = (Sub) s2 명시적 형변환");
		Sub sub = (Sub)s3;	//<== casting 연산자 이용 명시적 형변환
		sub.b();
	
		//넷 : 하위 data type 으로 상위 인스턴스 생성 (Data type != 인스턴스)
		//error 부위 (하위 레퍼런스변수는 상위인스턴스를 레퍼런스할 수 없다)
		//Sub s4 = new Super();


		System.out.println("=======================");
	}
}
