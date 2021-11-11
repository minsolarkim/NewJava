public class Test4 
{
	public static void main(String[] args) 
	{
		int score = Integer.parseInt(args[0]);

		if (score > 100 || score < 0)
		{
			System.out.print("잘못 입력하셨습니다. (0~100점 사이로 입력해주세요.)");
		} else {
			System.out.print("입력하신 값 "+score+"점은 ");

			if(score >= 90) {
				System.out.print("수");
			} else if (score >= 80)
			{
				System.out.print("우");
			} else if (score >= 70)
			{
				System.out.print("미");
			} else if (score >= 60)
			{
				System.out.print("양");
			} else if (score < 60)
			{
				System.out.print("가");
			} 
			System.out.println("입니다.");
		}
	}
}
