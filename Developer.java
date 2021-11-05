/*
	����Ȱ���� ������ �����ϴ� ȫ�浿�� Object Modeling
	1.ȫ�浿�� ���ȭ ������ ��	 : attribute ==> Field
	2.������ �ش��ϴ� ����	 : behavior ==> Method
	�̸� java language�� ����
*/

class Developer
{
	public static void main(String[] args) 
	{
		//Field ==> Ư��,�Ӽ�(attribute) ǥ��
		String name = "ȫ�浿";
		String job = "������";
		int avgIncome = 100;
		int projectCareer; //<== Field ���� �� ���(������ ���� �� ���) �ʱ�ȭ ������?

		//Method ==> ���, ����(behavior) ǥ��
		/*
			project�� �����Ͽ� ������ ���� �� ����� ������ ��Ÿ���� method
			1. income�� 1 ����
			2. projectCareer�� 1 ����
			����
		*/

		public void participateProject(){
			System.out.println("���α׷����߷� ��������, ��� ����");
			avgIncome++;
			projectCareer++;
		}

		/*
			���Ǹ� ���� ������ ����
			1. income�� 1 ����
			����
		*/

		public void instruct(){
			System.out.println("���Ǹ� ���� ���� ����");
			avgIncome++;
		}


		System.out.println("Hello World!");
	}
} // end of class
