
import java.util.*;

// Vector가 final class가 아니라면 확장 가능
// VectorTest02 is a Vector :: ~ is a ~

public class  VectorTest03 extends Vector {
	

	public static void main(String[] args) 	{

		//Vector 확장하여 추가적 기능(pringString())을 정의한 VectorTest02 인스턴스 생성
		VectorTest02 vectorTest = new VectorTest02(10,10);
		
		//Vector에 Object 저장
		String s1 = new String("1.홍 /");
		vectorTest.add(s1);
		vectorTest.add(new String("2.동 /"));
		vectorTest.add("3.님 안녕하세요 /");
		
		//Vector 저장된 값을 출력
		vectorTest.printString(vectorTest);

		System.out.println("\n ===========================API 확인");
		vectorTest.insertElementAt("4.길 /",1);
		vectorTest.printString(vectorTest);

		System.out.println("\n ===========================API 확인");
		vectorTest.setElementAt("5.홍길순 /",3);
		vectorTest.printString(vectorTest);

		System.out.println("\n ===========================API 확인");
		vectorTest.removeElementAt(3);
		vectorTest.printString(vectorTest);



	}
}
