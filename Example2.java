class Example2
{
	public static void main(String[] args) 
	{
		int dan = Integer.parseInt(args[0]);
		
		System.out.println(dan + "���� ����մϴ�.");

		if (dan <= 0 || dan >=10)
		{
			System.out.println("1~9������ ���� �Է����ּ���");
		} else {
			for(int i=1; i< 10; i++){
				
				System.out.println(dan +" * "+ i + " = " + dan*i);
			}
		}
	}
}
