
/*	1. Primitive type ����ȯ(������/�����) : data�� ũ��
	2. Reference type ����ȯ(������/�����) : ������ ũ�� (�߻�ȭ ����)
		: �߿� �߿� : ��ü�� ����ȯ ���� : ~~ is a ~~ Relationship
*/

//���� class Super�� ����
class Super {
	//Method
	public void a(){
		System.out.println("Super : a()");
	}
}


public class CastingComplete {
	//main method
	public static void main(String[] args) {
		//�ϳ� : ���� class �ν��Ͻ� ���� (Data Type == �ν��Ͻ��� ���)
		System.out.println("\n ����� Super s1 = new Super() �κ�");
		Super s1 = new Super();
		s1.a();
		System.out.println("=======================");
	}
}
