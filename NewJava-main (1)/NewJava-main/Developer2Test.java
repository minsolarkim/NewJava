public class Developer2Test {
	//Field
	//Method
	//Main Method
	public static void main(String[] args) 
	{
		//Developer2.class�� instance ����
		Developer2 developer = new Developer2();

		//developer �ĺ����� ���� Instance .�����ڸ� ���� ���
		System.out.println("�̸��� : " + developer.name);
		System.out.println("������ : " + developer.job);
		System.out.println("��ռ����� : " + developer.avgIncome);
		System.out.println("PJT����� : " + developer.projectCareer);
		
		System.out.println("=====================");

		//method�� ȣ���Ͽ� ������ ���� ���°� �޾� ����ϸ� ...
		String name = developer.getName();
		String job = developer.getJob();
		int avgIncome = developer.getAvgIncome();
		System.out.println("�̸��� : " + name);
		System.out.println("������ : " + job);
		System.out.println("��ռ����� : " + avgIncome);
		//�Ʒ��� ������ ��������.
		System.out.println("PJT ����� : " + developer.getProjectCareer());
		
		
	}//end of main

}//end of class