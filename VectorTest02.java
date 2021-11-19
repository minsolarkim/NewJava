
import java.util.*;

// Vector�� final class�� �ƴ϶�� Ȯ�� ����
// VectorTest02 is a Vector :: ~ is a ~

public class  VectorTest02 extends Vector {
	//Field

	//Constructor
	public VectorTest02(){
		//super(); //���� ����
	}

	public VectorTest02(int initialCapacity, int capacityIncrement){
		super(initialCapacity, capacityIncrement); //������ ����
	}

	//method
	//Vector�� ����(?, ����) �� ���ڿ� ���� ����ϴ� Method ����
	public void printString(Vector vector){

		System.out.println("\n==========for Loop=========");
		for(int i=0; i<vector.size(); i++) {
			System.out.print( (String)vector.elementAt(i) ); 
			// vector.elementAt(int index)�� Object�̱� ������ (String)���� ����� ����ȯ ����-> �׷��� String�� ���� ����
		}
		//Enhanced For Loop
		//Vector ���ο� ����� ���� size() ��ŭ �ݺ�, 1EA�� ���� Object�� ���(?) �ش�.
		System.out.println("\n==========Enhanced for Loop=========");
		for (Object object : vector ) {
			System.out.print( (String)object );
		}
	}

	public static void main(String[] args) 	{

		//Vector Ȯ���Ͽ� �߰��� ���(pringString())�� ������ VectorTest02 �ν��Ͻ� ����
		VectorTest02 vectorTest = new VectorTest02(10,10);
		
		//Vector�� Object ����
		String s1 = new String("1.ȫ /");
		vectorTest.add(s1);
		vectorTest.add(new String("2.�� /"));
		vectorTest.add("3.�� �ȳ��ϼ��� /");
		
		//Vector ����� ���� ���
		vectorTest.printString(vectorTest);

		System.out.println("\n ===========================API Ȯ��");
		vectorTest.insertElementAt("4.�� /",1);
		vectorTest.printString(vectorTest);

		System.out.println("\n ===========================API Ȯ��");
		vectorTest.setElementAt("5.ȫ��� /",3);
		vectorTest.printString(vectorTest);

		System.out.println("\n ===========================API Ȯ��");
		vectorTest.removeElementAt(3);
		vectorTest.printString(vectorTest);



	}
}
