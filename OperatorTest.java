//package jb01.part06;
/*
	1. ++, -- : ����, ���ҿ�����
	2. % : ������ ������
	3. 3�� ������
*/
public class OperatorTest 
{
	public static void main(String[] args) 
	{
		int value = 1;
	
		//������������ ���
		value++; //�ڱ��ڽ� 1 ����
		System.out.println("value++ : "+value);
		++value; //�ڱ��ڽ� 1 ����
		System.out.println("++value : "+value);

		value--; //�ڱ��ڽ� 2 ����
		System.out.println("value-- : "+value);
		--value; //�ڱ��ڽ� 2 ����
		System.out.println("--value : "+value);

		int temp = value++; //temp = value++�� �ǹ� : value ���� temp ���� �� �ڱ��ڽ� 1 ����
		//int temp = value--; //temp = value--�� �ǹ� : value ���� temp ���� �� �ڱ��ڽ� 1 ����
		//int temp = value--; //temp = value--�� �ǹ� : value ���� temp ���� �� �ڱ��ڽ� 1 ����
		//int temp = value--; //temp = value--�� �ǹ� : value ���� temp ���� �� �ڱ��ڽ� 1 ����

		System.out.println("temp : " + temp);
		System.out.println("value : " + value);

		// % ������ ������ ����ϱ�
		int temp01 = 5%2;
		int temp02 = 5%3;
		System.out.println("������ ������ : 5%2 ==>" + temp01);
		System.out.println("������ ������ : 5%3 ==>" + temp02);

		//���׿����� :: (����) ? ������ ���̸� : ������ �����̸�;
		int temp03 = (1 <=2 ) ? 3 : 4 ;
		System.out.println("���׿����� : (1 <= 2) ? 3 : 4 ==> " + temp03);

		//int temp04 = ( 1 =< 2 ) ? 3 : 4; //<== compile Error Ȯ��
	}
}
