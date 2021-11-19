
import java.util.*;

// Vector가 final class가 아니라면 확장 가능
// VectorTest02 is a Vector :: ~ is a ~

public class  VectorTest02 extends Vector {
	//Field

	//Constructor
	public VectorTest02(){
		//super(); //생략 가능
	}

	public VectorTest02(int initialCapacity, int capacityIncrement){
		super(initialCapacity, capacityIncrement); //가독성 위해
	}

	//method
	//Vector가 관리(?, 자장) 한 문자열 값을 출력하는 Method 정의
	public void printString(Vector vector){

		System.out.println("\n==========for Loop=========");
		for(int i=0; i<vector.size(); i++) {
			System.out.print( (String)vector.elementAt(i) ); 
			// vector.elementAt(int index)가 Object이기 때문에 (String)으로 명시적 형변환 해줌-> 그래야 String에 접근 가능
		}
		//Enhanced For Loop
		//Vector 내부에 저장된 값을 size() 만큼 반복, 1EA씩 추출 Object에 담아(?) 준다.
		System.out.println("\n==========Enhanced for Loop=========");
		for (Object object : vector ) {
			System.out.print( (String)object );
		}
	}

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
