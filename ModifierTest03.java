
/*	1.TopSecret02.class가 중요한 class라면 modifier를 통해 상속할 수 없도록 했으며
	2.secretNo를 readOnly를 명확히 함
		또한 중요한 class라면 객체 생성을 불가능하게 한다.
		==> 아래의 coding을 이해하자. 생성자를 외부에서 접근하지 못하게 private 선언.
		( 예 > java.lang.System.class의 소스와 API를 통해 확인)
	3.static method를 통해 인스턴스를 리턴할 수 있도록 한다.
*/

class TopSecret03 {

	//Field
	//==> access modifier를 활요한 information hiding
	//==> final modifier를 활용한 수정불가
	private final int secretNo = 7777;

	//Constructor
	//==> Access modifier를 통한 객체생성불가 (private Constructor를 사용한 이유 이해)
	public TopSecret03(){
	}

	//Method
	//getter Method
	//==> method를 통해 조건을 충족할 경우만 secretNo를 return
	publid int getSecretNo(int pwd){
		if ( pwd == 0 ) {
			return secretNo;
		} else {
			return 0;
		}//end of if
	}//end of method

	//static method를 이용한 instance return 하게하여 다른 class에서 사용가능하게 함.
	public static TopSecret03 getInstance(){
		TopSecret03 topSecret = new TopSecret03();
		return topSecret;
		//return new TopSecret03();
	}

}//end of class


public class ModifierTest03 {
	//main method
	public static void main(String[] args) 	{

		//생성자가 private로 instance 생성(생성자 호출) 불가능
		//TopSecret topSecret = new Topsecret();

		//instance 생성을 불가로 static method를 통해 객체를 return 받는다.
		TopSecret03 topSecret = TopSecret03.getInstance();
		System.out.println( topSecret.getSecretNo(0) );

	}//end of main

}//end of class