
import java.util.*;

// Vector�� final class�� �ƴ϶�� Ȯ�� ����
// VectorTest02 is a Vector :: ~ is a ~

public class  VectorTest03 extends Vector {
	

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
