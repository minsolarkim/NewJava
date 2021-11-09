public class Developer1Test {
	//Field
	//Method
	//Main Method
	public static void main(String[] args) 
	{
		//Developer2.class를 instance 생성
		Developer1 developer = new Developer1();

		//developer 식별성을 갖는 Instance .연산자를 통해 사용
		System.out.println("이름은 : " + developer.name);
		System.out.println("직업은 : " + developer.job);
		System.out.println("평균수입은 : " + developer.avgIncome);
		System.out.println("PJT경력은 : " + developer.projectCareer);
		
		System.out.println("=====================");
		
		//method를 호출하여 행위를 통해 상태값 받아 출력하면 ...
		String name = developer.getName();
		String job = developer.getJob();
		int avgIncome = developer.getAvgIncome();
		System.out.println("이름은 : " + name);
		System.out.println("직업은 : " + job);
		System.out.println("평균수입은 : " + avgIncome);
		//아래의 내용을 이해하자.
		System.out.println("PJT참여 경력은 : " + developer.getProjectCareer());

		System.out.println("=====================");
		//1개 과목을 강의
		developer.instruct();
		System.out.println("평균수입은 : "+developer.avgIncome);
		
		/////////////////// 추가된 부분 ///////////////////////
		System.out.println("=====================");
		
		//한미은행 project에 참여
		String projectName = "한미은행";
		developer.participateProject(projectName);
		//위의 두 줄과 아래 결과 차이점 확인
		//eveloper.participateProject("한미은행");
		System.out.println("평균수입은 : " + avgIncome);
		System.out.println("PJT참여 경력은 : " + developer.getProjectCareer());
		System.out.println("=====================");
	
		//2개 과목을 강의
		//int lectureCount = 2;
		//developer.instruct(lectureCount);
		//아래와 비교
		developer.instruct(3);
		System.out.println("평균수입은 : " + avgIncome);
		
	}//end of main

}//end of class
