public class Developer1Test {
	//Field
	//Method
	//Main Method
	public static void main(String[] args) 
	{
		//Developer2.class�� instance ����
		Developer1 developer = new Developer1();

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
		System.out.println("PJT���� ����� : " + developer.getProjectCareer());

		System.out.println("=====================");
		//1�� ������ ����
		developer.instruct();
		System.out.println("��ռ����� : "+developer.avgIncome);
		
		/////////////////// �߰��� �κ� ///////////////////////
		System.out.println("=====================");
		
		//�ѹ����� project�� ����
		String projectName = "�ѹ�����";
		developer.participateProject(projectName);
		//���� �� �ٰ� �Ʒ� ��� ������ Ȯ��
		//eveloper.participateProject("�ѹ�����");
		System.out.println("��ռ����� : " + avgIncome);
		System.out.println("PJT���� ����� : " + developer.getProjectCareer());
		System.out.println("=====================");
	
		//2�� ������ ����
		//int lectureCount = 2;
		//developer.instruct(lectureCount);
		//�Ʒ��� ��
		developer.instruct(3);
		System.out.println("��ռ����� : " + avgIncome);
		
	}//end of main

}//end of class
