class Example2
{
	public static void main(String[] args) 
	{
		int dan = Integer.parseInt(args[0]);
		
		System.out.println(dan + "단을 출력합니다.");

		if (dan <= 0 || dan >=10)
		{
			System.out.println("1~9사이의 수를 입력해주세요");
		} else {
			for(int i=1; i< 10; i++){
				
				System.out.println(dan +" * "+ i + " = " + dan*i);
			}
		}
	}
}
