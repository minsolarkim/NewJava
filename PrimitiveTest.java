//package jb01.part04;

public class PrimitiveTest
 
	{
		public static void main(String[] args) 
		{
			//����
			boolean boo = true;

			//������
			char c = 'ȫ';

			//������
			byte b = 127;
			//������ �Ѿ�� ���� ���� ��� ���� �߻� //==> compile error �߻�(Ȯ�ο��)
			byte b1 = 128;

			short s = 1000;
			int i = 1000;
			long l = 1000L; //long�� ��� 000l �Ǵ� 000L�� int�� ����

			//�Ǽ���
			float f = 1000.5F; //float�� ��� 0.5f �Ǵ� 0.5F�� double�� ����
			double d = 1000.5;

			//print() �� println()�� ������ 
			System.out.print("�ڹ��� Primitive Data Type�� ++ ");
			System.out.println(" ::����Ͽ� ǥ����� ��ġ�� ,,," + "::���");

			// + �������� �ǹ� (���ڿ� +  �����ڰ� ���Ǹ� append)
			System.out.println("���� : " + boo);
			System.out.println("������ : " + c);
			System.out.println("������ byte : " + b);
			System.out.println("������ short : " + s);
			System.out.println("������ int : " + i);
			System.out.println("������ long : " + l);
			System.out.println("�Ǽ��� float : " + f);
			System.out.println("�Ǽ��� double : " + d);
			
		}
	}