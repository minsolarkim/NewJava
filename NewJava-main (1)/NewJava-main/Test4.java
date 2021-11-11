public class Test4 
{
	public static void main(String[] args) 
	{
		int score = Integer.parseInt(args[0]);

		
		//if 문
		/*
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
		*/

		//switch문
		// 100/10, 99/10, 응용!!
		switch(score) {
			case 100:
			case 99:
			case 98:
			case 97:
			case 96:
			case 95:
			case 94:
			case 93:
			case 92:
			case 91:
			case 90:
				System.out.println("수");
				break;
			case 89:
			case 88:
			case 87:
			case 86:
			case 85:
			case 84:
			case 83:
			case 82:
			case 81:
			case 80:
				System.out.println("우");
				break;
			case 79:
			case 78:
			case 77:
			case 76:
			case 75:
			case 74:
			case 73:
			case 72:
			case 71:
			case 70:
				System.out.println("미");
				break;
			case 69:
			case 68:
			case 67:
			case 66:
			case 65:
			case 64:
			case 63:
			case 62:
			case 61:
			case 60:
				System.out.println("양");
				break;
			default :
				System.out.println("가");
				//System.out.println("잘못 입력하셨습니다. 0~100 사이의 수를 입력해주세요");
		}
	}
}
