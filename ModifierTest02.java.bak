
/*	==>TopSecret.class의 문제점
	- : secretNo는 중요한 attribute이다. 그러나 누구나 접근 및 변경이 가능
	==>Access Modifier를 통한 information hiding과 Method(행위)를 통한 접근
*/

class TopSecret02 {

	//Field
	//==>access modifier를 활요한 information hiding
	//==>private 접근제어를 사용하여 직접 접근할 수 없도록 하고 getter Method 통해 접근
	private int secretNo = 7777;	//private은 선언함

	//Constructor
	public TopSecret02(){			//여전히 금고 밖에 있음
	}

	//Method
	//getter Method
	//==> method를 통해 조건을 충족할 경우만 secretNo를 return
	publid int getSecretNo(int pwd){
		if ( pwd == 0 ) {
			return secretNo;		//this.secretNo 생략된거임
		} else {
			return 0;
		}//end of if
	}//end of method

}//end of class


public class ModifierTest02 {
	//main method
	public static void main(String[] args) 	{

		TopSecret02 topSecret = new TopSecret02();

		//==> private Field는 information hiding이 되어 있어 접근 및 변경이 불가
		//==> Method를 통해 접근만 가능 / 변경불가
		//System.out.println(topSecret.secretNo);
		//topSecret.secretNo = 1234;

		System.out.println( topSecret.getSecretNo(0) );

	}//end of main

}//end of class